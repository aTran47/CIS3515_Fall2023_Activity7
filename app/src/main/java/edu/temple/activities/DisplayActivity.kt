package edu.temple.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts

const val RESULT_KEY = "result"
class DisplayActivity : AppCompatActivity() {

    // TODO Step 1: Launch TextSizeActivity when button clicked to allow selection of text size value

    // TODO Step 3: Use returned value for lyricsDisplayTextView text size

    private lateinit var lyricsDisplayTextView: TextView
    private lateinit var textSizeSelectorButton: Button
    private val intentLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        lyricsDisplayTextView = findViewById(R.id.lyricsDisplayTextView)
        textSizeSelectorButton = findViewById<Button?>(R.id.textSizeSelectorButton)

        textSizeSelectorButton.setOnClickListener() {

            intentLauncher.launch(Intent(this@DisplayActivity, TextSizeActivity::class.java))
        }

    }
}