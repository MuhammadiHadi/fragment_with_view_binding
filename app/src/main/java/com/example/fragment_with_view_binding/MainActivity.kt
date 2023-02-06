package com.example.fragment_with_view_binding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.fragment_with_view_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
       val binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //viewBinding
        binding.button.setOnClickListener{
            Toast.makeText(this,
                "New Activity start",Toast.LENGTH_SHORT).show()
            val intent=Intent(this,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}