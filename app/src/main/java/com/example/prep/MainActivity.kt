package com.example.prep

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val video: VideoView = findViewById<VideoView>(R.id.my_video)
        val play : Button = findViewById<Button>( R.id.play_btn)
        val pause : Button = findViewById<Button>(R.id.pause_btn)

        val video_uri : Uri = Uri.parse("android.resource://" + packageName + "/" + R.raw.blaugrana)

        video.setVideoURI(video_uri)

        play.setOnClickListener {
            video.start()
        }

        pause.setOnClickListener {
            video.pause()
        }


    }
}