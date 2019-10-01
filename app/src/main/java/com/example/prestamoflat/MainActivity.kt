package com.example.prestamoflat

import android.content.Intent
import android.content.pm.ActivityInfo
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_menu_pantalla2.*

open class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT



        val button_iniciar = findViewById<Button>(R.id.button1)
        button_iniciar.setOnClickListener(View.OnClickListener {
            // finish();

            val i = Intent(this@MainActivity, activity_menu_pantalla2::class.java)
            startActivity(i)
        })


        }

        }




