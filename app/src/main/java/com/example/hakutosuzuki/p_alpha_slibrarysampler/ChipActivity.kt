package com.example.hakutosuzuki.p_alpha_slibrarysampler

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_chip.*

class ChipActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chip)

//        chip1.setOnClickListener({
//            // Handle The Click
//            Toast.makeText(this,"onClick :",Toast.LENGTH_SHORT).show()
//        })

        chip1.setOnCheckedChangeListener({ view, b ->
            //Handle the Toggle
            // view = Compound Button
            // b = isChecked
            Toast.makeText(this, "isChecked :" + b, Toast.LENGTH_SHORT).show()
        })

        chip1.setOnCloseIconClickListener({
            Toast.makeText(this, "onClose", Toast.LENGTH_SHORT).show()
        })

    }
}
