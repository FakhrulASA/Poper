package com.fakhrulasa.scoper

import android.app.Activity
import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.Window
import android.view.WindowManager
import com.fakhrulasa.scoper.databinding.FragmentPoperDialogBinding

class PoperDialogFragment {
    private var dialog: Dialog? = null

    fun showTaskDialog(activity: Activity, onDissmiss: (String) -> Unit, onTask:(String)->Unit) {
        val binding = FragmentPoperDialogBinding.inflate(LayoutInflater.from(activity), null, false)
        dialog = Dialog(activity).apply {
            requestWindowFeature(Window.FEATURE_NO_TITLE)
            setContentView(binding.root)
            setCancelable(true)
            window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            window?.setLayout(
                WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.WRAP_CONTENT
            )
            binding.buttonOK.setOnClickListener {
                val email = "KI Khobor"
                onDissmiss.invoke(email)
                dialog?.dismiss()

            }
            binding.buttonDO.setOnClickListener {
                onTask.invoke("DONE")
            }
            show()
        }

    }
    fun showAlerDialog(activity: Activity, onDissmiss: (String) -> Unit) {
        val binding = FragmentPoperDialogBinding.inflate(LayoutInflater.from(activity), null, false)
        dialog = Dialog(activity).apply {
            requestWindowFeature(Window.FEATURE_NO_TITLE)
            setContentView(binding.root)
            setCancelable(true)
            window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            window?.setLayout(
                WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.WRAP_CONTENT
            )
            binding.buttonOK.setOnClickListener {
                val email = "KI Khobor"
                onDissmiss.invoke(email)
                dialog?.dismiss()

            }
            binding.buttonDO.visibility= View.GONE
            show()
        }

    }

    fun cancelDialog() {
        dialog?.cancel()
    }
}