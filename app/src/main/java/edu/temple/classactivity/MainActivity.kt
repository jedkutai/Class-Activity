package edu.temple.classactivity

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.imageView)

        var id: Int = R.drawable.winpooh

        findViewById<Button>(R.id.button).setOnClickListener {
            if (id == R.drawable.winpooh) {
                imageView.setImageResource(R.drawable.hobbes)
                id = R.drawable.hobbes
            } else {
                imageView.setImageResource(R.drawable.winpooh)
                id = R.drawable.winpooh
            }
        }
    }
}