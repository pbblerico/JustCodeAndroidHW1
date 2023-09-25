package com.example.justcodehw2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.justcodehw2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sayHello("Rico")
    }

    private fun sayHello(name: String) {
        binding.hello.text = getString(R.string.say_hello, name)
    }
}