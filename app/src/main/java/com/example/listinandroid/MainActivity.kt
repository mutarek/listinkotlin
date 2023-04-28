package com.example.listinandroid

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    lateinit var listView: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.homeListView)

        initListView()
    }

    private fun initListView() {
        val arrayAdapter =
            ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, DummyFile().teamPlayer)

        listView.adapter = arrayAdapter


        listView.setOnItemClickListener { adapterView, view, i, l ->
            DummyFile().teamPlayer.removeAt(i)
            arrayAdapter.notifyDataSetChanged()
            Toast.makeText(this,"You clicked on ${i}",Toast.LENGTH_SHORT).show()
        }
    }
    private fun removeOneItemFromList(index:Int){
        DummyFile().teamPlayer.reversed()
    }
}