package com.example.myapplication

import android.os.Bundle
import android.media.MediaPlayer
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PemutarMusikActivity : AppCompatActivity() {
    private var ivAlbumCover: ImageView? = null
    private var tvSongTitle: TextView? = null
    private var btnPlay: Button? = null
    private var btnPause: Button? = null
    private var btnStop: Button? = null
    private var mediaPlayer: MediaPlayer? = null
    private var isPaused = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pemutar_musik)

        ivAlbumCover = findViewById<ImageView>(R.id.iv_album_cover)
        tvSongTitle = findViewById<TextView>(R.id.tv_song_title)
        btnPlay = findViewById<Button>(R.id.btn_play)
        btnPause = findViewById<Button>(R.id.btn_pause)
        btnStop = findViewById<Button>(R.id.btn_stop)
        mediaPlayer = MediaPlayer.create(this, R.raw.spiderman)

        btnPlay?.setOnClickListener {
            if (isPaused) {
                mediaPlayer?.start()
                Toast.makeText(this@PemutarMusikActivity, "Memutar musik", Toast.LENGTH_SHORT)
                    .show()
                isPaused = false
            } else {
                mediaPlayer = MediaPlayer.create(this@PemutarMusikActivity, R.raw.spiderman)
                mediaPlayer?.start()
                Toast.makeText(this@PemutarMusikActivity, "Memutar musik", Toast.LENGTH_SHORT)
                    .show()
            }
        }

        btnPause?.setOnClickListener {
            if (mediaPlayer?.isPlaying == true) {
                mediaPlayer?.pause()
                Toast.makeText(this@PemutarMusikActivity, "Musik dijeda", Toast.LENGTH_SHORT).show()
                isPaused = true
            }
        }

        btnStop?.setOnClickListener {
            mediaPlayer?.stop()
            mediaPlayer?.release()
            Toast.makeText(this@PemutarMusikActivity, "Musik dihentikan", Toast.LENGTH_SHORT).show()
        }
    }
}