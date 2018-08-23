package com.example.vikaslandge.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.text.method.ScrollingMovementMethod
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.indiview.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         //var lmanager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        //rview.layoutManager = lmanager
        var glayout = GridLayoutManager(this,2)
        rview.layoutManager = glayout
        rview.adapter = MyAdapter(this)
    }
}
