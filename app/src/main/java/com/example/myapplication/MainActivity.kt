package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnBMI: Button
    private lateinit var btnNilaiAkhir: Button
    private lateinit var btnPersegiPanjang: Button
    private lateinit var btnKalkulator: Button
    private lateinit var btnDaftarKontak: Button
    private lateinit var btnKamera: Button
    private lateinit var btnPemutarMusik: Button

    private var isLoggedIn = false // Status login

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBMI = findViewById(R.id.btn_bmi)
        btnNilaiAkhir = findViewById(R.id.btn_nilai_akhir)
        btnPersegiPanjang = findViewById(R.id.btn_persegi_panjang)
        btnKalkulator = findViewById(R.id.btn_kalkulator)
        btnDaftarKontak = findViewById(R.id.btn_daftar_kontak)
        btnKamera = findViewById(R.id.btn_kamera)
        btnPemutarMusik = findViewById(R.id.btn_pemutar_musik)

        // Cek status login saat activity dibuat
        checkLoginStatus()

        btnBMI.setOnClickListener {
            // Cek apakah pengguna sudah login sebelum membuka aktivitas BMI Calculator
            if (isLoggedIn) {
                val intent = Intent(this@MainActivity, BMICalculatorActivity::class.java)
                startActivity(intent)
            } else {
                showToast("Silakan login terlebih dahulu.")
            }
        }

        // Tambahkan logika untuk tombol-tombol lainnya seperti di atas

        // Tombol Login
        val btnLogin: Button = findViewById(R.id.btn_login)
        btnLogin.setOnClickListener {
            // Simulasikan login dengan mengubah status login menjadi true
            isLoggedIn = true
            showToast("Login berhasil.")
        }

        // Tombol Logout
        val btnLogout: Button = findViewById(R.id.btn_logout)
        btnLogout.setOnClickListener {
            // Simulasikan logout dengan mengubah status login menjadi false
            isLoggedIn = false
            showToast("Logout berhasil.")
        }
    }

    private fun checkLoginStatus() {
        // Simulasikan pengecekan status login di sini
        // Jika pengguna telah login, set isLoggedIn menjadi true
        // Jika pengguna belum login, set isLoggedIn menjadi false
        isLoggedIn = false // Ganti dengan logika pengecekan status login yang sesuai
    }

    private fun showToast(message: String) {
        Toast.makeText(this@MainActivity, message, Toast.LENGTH_SHORT).show()
    }
}