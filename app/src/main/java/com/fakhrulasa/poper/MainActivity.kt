package com.fakhrulasa.poper

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var poperDialogFragment: PoperDialogFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        poperDialogFragment = PoperDialogFragment()

//        poperDialogFragment.showExitDialog(this, {
//            Toast.makeText(this, it, Toast.LENGTH_LONG).show()
//        },
//        {
//
//            poperDialogFragment.cancelDialog()
//            Toast.makeText(this, "TASK EXECUtED", Toast.LENGTH_LONG).show()
//        })

        poperDialogFragment.showAlerDialog(this){

        }
    }
}