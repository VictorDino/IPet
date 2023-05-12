package com.example.ipet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.ipet.peluqueria.PeluActivity
import com.example.ipet.perrera.PerreActivity
import com.example.ipet.shop.ShopActivity
import com.example.ipet.vet.VeterinariActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<Button>(R.id.Vetbutton)
        val button2 = findViewById<Button>(R.id.Shopbutton)
        val button3 = findViewById<Button>(R.id.Pelubutton)
        val button4 = findViewById<Button>(R.id.Perrebutton)

        button1.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, VeterinariActivity::class.java)
            startActivity(intent)
        })

        button2.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, ShopActivity::class.java)
            startActivity(intent)
        })

        button3.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, PeluActivity::class.java)
            startActivity(intent)
        })

        button4.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, PerreActivity::class.java)
            startActivity(intent)
        })
    }
}