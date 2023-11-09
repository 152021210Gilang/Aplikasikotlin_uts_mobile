package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class KalkulatorActivity : AppCompatActivity() {
    private lateinit var etAngka1: EditText
    private lateinit var etAngka2: EditText
    private lateinit var btnTambah: Button
    private lateinit var btnKurang: Button
    private lateinit var btnKali: Button
    private lateinit var btnBagi: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kalkulator)

        etAngka1 = findViewById(R.id.et_angka1)
        etAngka2 = findViewById(R.id.et_angka2)
        btnTambah = findViewById(R.id.btn_tambah)
        btnKurang = findViewById(R.id.btn_kurang)
        btnKali = findViewById(R.id.btn_kali)
        btnBagi = findViewById(R.id.btn_bagi)

        btnTambah.setOnClickListener(View.OnClickListener {
            val angka1 = etAngka1.text.toString().toDouble()
            val angka2 = etAngka2.text.toString().toDouble()
            val hasil = angka1 + angka2
            Toast.makeText(this@KalkulatorActivity, "Hasil: $hasil", Toast.LENGTH_SHORT).show()
        })

        btnKurang.setOnClickListener(View.OnClickListener {
            val angka1 = etAngka1.text.toString().toDouble()
            val angka2 = etAngka2.text.toString().toDouble()
            val hasil = angka1 - angka2
            Toast.makeText(this@KalkulatorActivity, "Hasil: $hasil", Toast.LENGTH_SHORT).show()
        })

        btnKali.setOnClickListener(View.OnClickListener {
            val angka1 = etAngka1.text.toString().toDouble()
            val angka2 = etAngka2.text.toString().toDouble()
            val hasil = angka1 * angka2
            Toast.makeText(this@KalkulatorActivity, "Hasil: $hasil", Toast.LENGTH_SHORT).show()
        })

        btnBagi.setOnClickListener(View.OnClickListener {
            val angka1 = etAngka1.text.toString().toDouble()
            val angka2 = etAngka2.text.toString().toDouble()

            if (angka2 != 0.0) {
                val hasil = angka1 / angka2
                Toast.makeText(this@KalkulatorActivity, "Hasil: $hasil", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(
                    this@KalkulatorActivity,
                    "Error: Pembagian dengan angka 0 tidak valid",
                    Toast.LENGTH_SHORT
                ).show()
            }
        })
    }
}