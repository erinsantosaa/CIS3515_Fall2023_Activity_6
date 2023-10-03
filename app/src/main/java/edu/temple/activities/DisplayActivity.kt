package edu.temple.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        // TODO Step 3: Extract transferred value and use for lyricsDisplayView text size
        val textSize = intent.getFloatExtra("textSize", 0f)
        val lyricsDisplayView = findViewById<TextView>(R.id.lyricsDisplayTextView)
        lyricsDisplayView.textSize = textSize


    }
}