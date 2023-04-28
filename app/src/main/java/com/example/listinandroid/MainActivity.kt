package com.example.listinandroid

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var listView: ListView
    var myNumber = mutableListOf("Hello", "Mello","Hello 3 ", "Hello 5")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val title = supportActionBar
        title!!.title = "List View "
        listView = findViewById(R.id.homeListView)
        val numberAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, myNumber)
        listView.adapter = numberAdapter

        listView.setOnItemClickListener { adapterView, view, i, l ->
            //myNumber.add(0,"New Value{$myNumber.size+1} ")
            //myNumber.removeAt(i)
            //myNumber.reversed()
            //myNumber.shuffle()
            numberAdapter.notifyDataSetChanged()
        }

    }
}