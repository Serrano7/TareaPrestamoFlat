package com.example.prestamoflat

import android.content.Intent
import android.content.pm.ActivityInfo
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_menu_pantalla2.*

open class activity_menu_pantalla2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_pantalla2)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT


        val button_siguiente = findViewById<Button>(R.id.button2)
        button_siguiente.setOnClickListener(View.OnClickListener {
            // finish();

            val i = Intent(this@activity_menu_pantalla2, activity_menu_pantalla3::class.java)
            startActivity(i)
        })


        nombre_1.setOnClickListener {
            var nombre: String = nombre_1.text.toString()
            val intent = Intent (this, activity_menu_pantalla3::class.java).putExtra("Nombre", nombre )
        }

        apellido_2.setOnClickListener {
            var apellido: String = apellido_2.text.toString()
            val intent = Intent (this, activity_menu_pantalla3::class.java).putExtra("Apellido", apellido)
        }

        monto_3.setOnClickListener{
            var monto: String = monto_3.toString()
            val intent = Intent(this, activity_menu_pantalla3::class.java).putExtra("Monto", monto)
        }
        plazo_4.setOnClickListener{
            var plazo: String = plazo_4.text.toString()
            val intent = Intent(this, activity_menu_pantalla3::class.java).putExtra("Plazo", plazo)
        }
        taza_5.setOnClickListener{
            var taza: String = taza_5.text.toString()
            val intent = Intent(this, activity_menu_pantalla3::class.java).putExtra("Taza de interes", taza)
        }

        }
    }



