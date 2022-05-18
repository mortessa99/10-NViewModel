package com.example.a10_nviewmodel.sample.sampple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.a10_nviewmodel.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val mainViewModel: MainViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            txtView.text = mainViewModel.counter.toString()
            button.setOnClickListener {
                mainViewModel.addNumber()
                txtView.text = mainViewModel.counter.toString()
            }
        }
    }
}