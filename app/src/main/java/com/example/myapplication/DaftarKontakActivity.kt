package com.example.myapplication

import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DaftarKontakActivity : AppCompatActivity() {
    private lateinit var listView: ListView
    private lateinit var kontakList: MutableList<String>
    private lateinit var adapter: ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_kontak)

        listView = findViewById(R.id.list_view)
        kontakList = ArrayList()
        kontakList.add("Kontak 1")
        kontakList.add("Kontak 2")
        kontakList.add("Kontak 3")

        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, kontakList)
        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val kontak = kontakList[position]
            Toast.makeText(this@DaftarKontakActivity, "Kontak yang dipilih: $kontak", Toast.LENGTH_SHORT).show()
        }
    }
}