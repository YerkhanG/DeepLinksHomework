package com.example.deeplinks

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.deeplinks.databinding.ActivityDetailsBinding

class DetailsActivity: AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        intent.data?.let {
            it.queryParameterNames.forEach { btn ->
                binding.btn.text = it.getQueryParameter(btn)
            }
        }

    }
}