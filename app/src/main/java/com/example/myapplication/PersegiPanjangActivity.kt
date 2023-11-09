package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PersegiPanjangActivity : AppCompatActivity() {
    private var etPanjang: EditText? = null
    private var etLebar: EditText? = null
    private var btnHitung: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi_panjang)

        etPanjang = findViewById<EditText>(R.id.et_panjang)
        etLebar = findViewById<EditText>(R.id.et_lebar)
        btnHitung = findViewById<Button>(R.id.btn_hitung)

        btnHitung?.setOnClickListener {
            val panjang = etPanjang?.text.toString().toDouble()
            val lebar = etLebar?.text.toString().toDouble()
            val luas = panjang * lebar
            Toast.makeText(this@PersegiPanjangActivity, "Luas: $luas", Toast.LENGTH_SHORT).show()
        }
    }
}