package com.example.a10_nviewmodel

import com.example.a10_nviewmodel.sample.forrecycler.ItemModel

object Utils {
    fun loadData() : MutableList<ItemModel>{
        val items : MutableList<ItemModel> = mutableListOf()
        /* items.add(ItemModel(1,"Morteza"))
         items.add(ItemModel(2,"Morteza"))
         items.add(ItemModel(3,"Morteza"))
         items.add(ItemModel(4,"Morteza"))
         items.add(ItemModel(5,"Morteza"))
         items.add(ItemModel(6,"Morteza"))
         items.add(ItemModel(7,"Morteza"))
         items.add(ItemModel(8,"Morteza"))
         items.add(ItemModel(9,"Morteza"))
         items.add(ItemModel(10,"Morteza"))
         items.add(ItemModel(11,"Morteza"))*/

        for (i in 1..100) {
            items.add(ItemModel(i,"item $i"))
        }

        return items
    }
}