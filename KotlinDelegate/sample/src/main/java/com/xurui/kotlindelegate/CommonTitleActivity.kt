package com.xurui.kotlindelegate

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.xurui.kotlindelegate.databinding.ActivityCommonBinding
import com.xurui.ktx.property.TextForm
import com.xurui.ktx.property.applyTextForm
import com.xurui.ktx.property.viewBinding

open class CommonTitleActivity : AppCompatActivity() {
    open val commonBinding by viewBinding(ActivityCommonBinding::bind)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_common)
        with(commonBinding) {
            mainTitle.ivBack.setOnClickListener {
                finish()
            }
        }
    }

    fun setTitle(title: String) {
        commonBinding.mainTitle.tvTitle.text = title
    }

    fun setTitle(textForm: TextForm) {
        commonBinding.mainTitle.tvTitle.applyTextForm(textForm)
    }

    val infoView
        get() = commonBinding.mainTitle.ivInfo

    fun setInfoClick(click: () -> Unit) {
        commonBinding.mainTitle.ivInfo.setOnClickListener {
            click()
        }
    }
}