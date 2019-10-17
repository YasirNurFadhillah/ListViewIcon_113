package com.example.listviewicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewicon.Adapter.ListIconA
import com.example.listviewicon.model.kodeicon
import com.example.listviewicon.model.kodelist

class MainActivity : AppCompatActivity() {

    private lateinit var rvKode: RecyclerView
    private var list: ArrayList<kodeicon> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvKode = findViewById(R.id.listviewicon)
        rvKode.setHasFixedSize(true)
        list.addAll(kodelist.codelist)
        showKodingList()
    }
    private fun showKodingList() {
        rvKode.layoutManager = LinearLayoutManager(this)
        val listkodingAdapter = ListIconA(list)
        rvKode.adapter = listkodingAdapter
    }
}
