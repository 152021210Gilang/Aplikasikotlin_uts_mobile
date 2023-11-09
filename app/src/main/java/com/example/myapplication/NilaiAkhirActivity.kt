package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NilaiAkhirActivity : AppCompatActivity() {
    private var etAssignment: EditText? = null
    private var etExam: EditText? = null
    private var etAttendance: EditText? = null
    private var btnCalculate: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nilai_akhir)

        etAssignment = findViewById(R.id.et_assignment)
        etExam = findViewById(R.id.et_exam)
        etAttendance = findViewById(R.id.et_attendance)
        btnCalculate = findViewById(R.id.btn_calculate)

        btnCalculate?.setOnClickListener {
            val assignment = etAssignment?.text.toString().toDouble()
            val exam = etExam?.text.toString().toDouble()
            val attendance = etAttendance?.text.toString().toDouble()
            val finalScore = calculateFinalScore(assignment, exam, attendance)

            // Tampilkan nilai akhir ke pengguna
            Toast.makeText(this@NilaiAkhirActivity, "Nilai Akhir: $finalScore", Toast.LENGTH_SHORT).show()
        }
    }

    private fun calculateFinalScore(
        assignment: Double,
        exam: Double,
        attendance: Double
    ): Double {
        // Implementasikan logika perhitungan nilai akhir di sini
        return assignment * 0.3 + exam * 0.6 + attendance * 0.1
    }
}