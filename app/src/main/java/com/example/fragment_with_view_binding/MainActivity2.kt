package com.example.fragment_with_view_binding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.fragment_with_view_binding.databinding.ActivityMain2Binding
import com.example.fragment_with_view_binding.fragment.Chat
import com.example.fragment_with_view_binding.fragment.Home
import com.example.fragment_with_view_binding.fragment.Status

class MainActivity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        val viewBinding=ActivityMain2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(viewBinding.root)
//        val home=findViewById<Button>(R.id.home)
//        val chat=findViewById<Button>(R.id.chat)
//        val status=findViewById<Button>(R.id.status)


        viewBinding.home.setOnClickListener {

            replaceFragment(Home())
        }
        viewBinding.chat.setOnClickListener {
            replaceFragment(Chat())
        }
        viewBinding.status.setOnClickListener {
            replaceFragment(Status())
        }
    }
    fun replaceFragment(Fragment: Fragment){
        val fragmentTransaction=supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragment,Fragment)
        fragmentTransaction.commit()
    }
}