package com.websarva.wings.android.simpletodoapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.websarva.wings.android.simpletodoapps.databinding.ActivityMainBinding
import com.websarva.wings.android.simpletodoapps.fragment.TaskAddDialogFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val fabListener = FloatingActionButtonClickListener()
        binding.fab.setOnClickListener(fabListener)
    }

    private inner class FloatingActionButtonClickListener : View.OnClickListener {
        override fun onClick(view: View) {
            TaskAddDialogFragment().show(supportFragmentManager,"TaskAddDialogFragment")
        }
    }
}
