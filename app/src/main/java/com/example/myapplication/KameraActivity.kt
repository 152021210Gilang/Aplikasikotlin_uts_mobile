package com.example.myapplication

import android.hardware.Camera
import android.os.Bundle
import android.view.SurfaceView
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class KameraActivity : AppCompatActivity() {
    private var surfaceView: SurfaceView? = null
    private var btnCapture: Button? = null
    private var camera: Camera? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kamera)

        surfaceView = findViewById<SurfaceView>(R.id.surface_view)
        btnCapture = findViewById<Button>(R.id.btn_capture)

        btnCapture?.setOnClickListener(View.OnClickListener {
            camera = Camera.open()
            if (camera != null) {
                camera?.takePicture(null, null, Camera.PictureCallback { data, _ ->
                    // Logika untuk menyimpan gambar hasil pengambilan foto
                    // ...
                    Toast.makeText(this@KameraActivity, "Foto diambil", Toast.LENGTH_SHORT).show()
                    camera?.releaseCamera()
                })
            }
        })
    }

    private fun Camera.releaseCamera() {
        release()
    }
}