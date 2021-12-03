package com.namelessness.org

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.namelessness.org.databinding.ActivityMainBinding

class Main : AppCompatActivity() {
    //viewbinding activity main
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //bottomNavigationview
    }

    override fun onStart() {
        super.onStart()
    }
}