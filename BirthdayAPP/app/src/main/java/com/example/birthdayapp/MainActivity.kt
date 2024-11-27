package com.example.birthdayapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var name = findViewById<EditText>(R.id.name)
        val button = findViewById<Button>(R.id.submit)

        button.setOnClickListener {

            if(name.text.isEmpty()) {
                Toast.makeText(this, "please write the name", Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("name",name.text)
                startActivity(intent)
            }
        }
    }
}
