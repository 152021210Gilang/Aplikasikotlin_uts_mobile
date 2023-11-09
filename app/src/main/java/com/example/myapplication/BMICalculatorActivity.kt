package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class BMICalculatorActivity : AppCompatActivity() {
    private lateinit var etHeight: EditText
    private lateinit var etWeight: EditText
    private lateinit var btnCalculate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_calculator)
        etHeight = findViewById(R.id.et_height)
        etWeight = findViewById(R.id.et_weight)
        btnCalculate = findViewById(R.id.btn_calculate)
        btnCalculate!!.setOnClickListener {
            val height = etHeight!!.text.toString().toDouble()
            val weight = etWeight!!.text.toString().toDouble()
            val bmi = calculateBMI(height, weight)

            // Tampilkan hasil BMI ke pengguna
            Toast.makeText(this@BMICalculatorActivity, "BMI: $bmi", Toast.LENGTH_SHORT).show()
        }
    }

    private fun calculateBMI(height: Double, weight: Double): Double {
        // Implementasikan logika perhitungan BMI di sini
        return weight / (height * height)
    }
}