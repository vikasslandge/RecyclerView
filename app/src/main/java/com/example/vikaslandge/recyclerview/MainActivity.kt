package com.example.vikaslandge.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var lmanager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)

        rview.layoutManager = lmanager
        rview.adapter = MyAdapter(this)
    }
}