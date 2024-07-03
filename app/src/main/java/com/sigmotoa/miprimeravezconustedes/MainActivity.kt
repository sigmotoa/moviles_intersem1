package com.sigmotoa.miprimeravezconustedes

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var btnTouch = findViewById<Button>(R.id.btn_touch)

        btnTouch.setOnClickListener {
            Toast.makeText(this,"Gracias por tocarme",Toast.LENGTH_SHORT).show()
        }


    }
}
