package com.example.hakutosuzuki.p_alpha_slibrarysampler

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.bottomappbar.BottomAppBar.FAB_ALIGNMENT_MODE_CENTER
import android.support.design.bottomappbar.BottomAppBar.FAB_ALIGNMENT_MODE_END
import android.support.design.widget.FloatingActionButton.SIZE_MINI
import android.support.design.widget.FloatingActionButton.SIZE_NORMAL
import kotlinx.android.synthetic.main.activity_bottom_app_bar.*

class BottomAppBarActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_app_bar)


        button_center.setOnClickListener {
            bottomappbar.fabAlignmentMode = FAB_ALIGNMENT_MODE_CENTER
        }

        button_end.setOnClickListener {
            bottomappbar.fabAlignmentMode = FAB_ALIGNMENT_MODE_END
        }

        button_fab.setOnClickListener {
            if (fab.size == SIZE_NORMAL) fab.size = SIZE_MINI
            else fab.size = SIZE_NORMAL
        }
    }
}
