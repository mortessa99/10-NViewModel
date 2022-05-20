package com.example.a10_nviewmodel.sample.forrecycler

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.a10_nviewmodel.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    private val viewModel : RecyclerViewModel by viewModels()

    private val myAdapter : MyAdapter by lazy { MyAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            //Get Data
            myAdapter.differ.submitList(viewModel.itemsList)

            //recycler
            recyclerView.apply {
                layoutManager = LinearLayoutManager(this@SecondActivity)
                adapter = myAdapter
            }
        }
    }
}

