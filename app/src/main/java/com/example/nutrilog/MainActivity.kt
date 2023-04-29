package com.example.nutrilog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
class MainPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainpage)
    }
}

class BreakButton : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainpage)

        // 获取按钮对象
        val button = findViewById<Button>(R.id.BreakButton)

        // 设置按钮的点击事件
        button.setOnClickListener {
            // 创建一个Intent对象，跳转到第二个Activity
            val intent = Intent(this, BreakButton::class.java)
            startActivity(intent)
        }
    }
}
