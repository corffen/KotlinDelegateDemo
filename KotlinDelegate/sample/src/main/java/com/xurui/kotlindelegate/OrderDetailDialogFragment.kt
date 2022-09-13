package com.xurui.kotlindelegate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.xurui.kotlindelegate.databinding.DialogOrderDetailBinding
import com.xurui.ktx.property.argument
import com.xurui.ktx.property.viewBinding

/**
 * Created by pengxr on 11/5/2021
 */
class OrderDetailDialogFragment : DialogFragment() {

    private val binding by viewBinding(DialogOrderDetailBinding::bind)
    private var orderId: Int by argument()
    private var orderType: Int by argument(1)
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.dialog_order_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //在onCreateView之后才可以访问binding,否则会崩溃
        binding.tvDisplay.text = "orderId=${orderId},orderType=${orderType}"
    }

    companion object {
        fun newInstance(orderId: Int, orderType: Int?) = OrderDetailDialogFragment().apply {
            this.orderId = orderId
            orderType?.also { this.orderType = it }
        }
    }

}