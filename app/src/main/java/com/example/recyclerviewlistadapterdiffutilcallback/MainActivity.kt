package com.example.recyclerviewlistadapterdiffutilcallback

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.recyclerviewlistadapterdiffutilcallback.databinding.ActivityMainBinding
import com.example.recyclerviewlistadapterdiffutilcallback.simple.view.SimpleRecyclerViewActivity

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        with(binding) {
            lifecycleOwner = this@MainActivity
            mainActivity = this@MainActivity
        }
    }

    fun onSimpleButtonClick() {
        Intent(this, SimpleRecyclerViewActivity::class.java).apply {
            startActivity(this)
        }
    }
}