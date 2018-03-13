package com.example.hakutosuzuki.p_alpha_slibrarysampler

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        materialButton.setOnClickListener({
            val intent = Intent(this, MaterialButtonActivity::class.java)
            startActivity(intent)
        })

        materialCardView.setOnClickListener({
            val intent = Intent(this, MaterialCardViewActivity::class.java)
            startActivity(intent)
        })

        bottomAppBar.setOnClickListener({
            val intent = Intent(this, BottomAppBarActivity::class.java)
            startActivity(intent)
        })

        chip.setOnClickListener({
            val intent = Intent(this, ChipActivity::class.java)
            startActivity(intent)
        })
    }
}
