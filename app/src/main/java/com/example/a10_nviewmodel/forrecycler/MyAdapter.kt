package com.example.a10_nviewmodel.sample.forrecycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.a10_nviewmodel.databinding.ItemsBinding

class MyAdapter:RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    private lateinit var binding: ItemsBinding
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyAdapter.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        binding = ItemsBinding.inflate(inflater,parent,false)
        return ViewHolder()
    }

    override fun onBindViewHolder(holder: MyAdapter.ViewHolder, position: Int) {
        holder.bind(differ.currentList[position])
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }


    override fun getItemViewType(position: Int): Int {
        return position
    }


    inner class ViewHolder:RecyclerView.ViewHolder(binding.root){
        fun bind(itemModel: ItemModel){
            binding.apply {
                txtId.text = itemModel.id.toString()
                txtName.text = itemModel.name
            }
        }
    }

    //best way for click on items operation
    private var onMyItemClicked : ((ItemModel) -> Unit)? =  null
    fun whenClickedOnMyItem(listener: (ItemModel) -> Unit) {
        onMyItemClicked = listener
    }
    //
    
    private val differCallBack = object : DiffUtil.ItemCallback<ItemModel>(){
        override fun areItemsTheSame(oldItem: ItemModel, newItem: ItemModel): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: ItemModel, newItem: ItemModel): Boolean {
            return oldItem == newItem
        }

    }

    val differ = AsyncListDiffer(this,differCallBack)
}