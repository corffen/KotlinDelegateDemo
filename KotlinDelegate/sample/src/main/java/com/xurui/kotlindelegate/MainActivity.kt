package com.xurui.kotlindelegate

import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import com.xurui.kotlindelegate.databinding.ActivityMainBinding
import com.xurui.ktx.property.textForm

class MainActivity : CommonTitleActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater, commonBinding.flContent, true) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        binding.tvDisplay.text = "Main Hello World."
//        startOrderDetail(10000, null)
        setTitle(textForm(this) {
            text = "MainTitle"
            textColor = Color.BLACK
            textSize = 20f
        })
        setInfoClick {
            Toast.makeText(this, "info icon", Toast.LENGTH_SHORT).show()
        }
        infoView.setImageResource(R.drawable.icon_more)
        binding.tvDisplay.text = "hello"
    }

}