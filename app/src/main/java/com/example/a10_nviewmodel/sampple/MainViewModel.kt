package com.example.a10_nviewmodel.sample.sampple

import androidx.lifecycle.ViewModel

class MainViewModel:ViewModel() {
     var counter = 0
    fun addNumber(){
        counter++
    }
}