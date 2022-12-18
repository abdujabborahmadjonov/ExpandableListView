package dev.abdujabbor.homeandroidecpandabellistview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.abdujabbor.homeandroidecpandabellistview.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.myText.text = intent.getStringExtra("name")

    }
}