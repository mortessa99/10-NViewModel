package com.example.a10_nviewmodel.sample.forrecycler

import androidx.lifecycle.ViewModel
import com.example.a10_nviewmodel.Utils

class RecyclerViewModel:ViewModel() {
    var itemsList = Utils.loadData()
}