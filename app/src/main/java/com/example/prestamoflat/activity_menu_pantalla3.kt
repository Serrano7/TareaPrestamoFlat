package com.example.prestamoflat

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import kotlinx.android.synthetic.main.activity_menu_pantalla2.*
import kotlinx.android.synthetic.main.activity_menu_pantalla3.*

open class activity_menu_pantalla3 : AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_pantalla3)



       val ObjetoIntent1: Intent=intent
        var Nombre = ObjetoIntent1.getStringExtra("Nombre")
        nombre_1.text = getText(nombre_1);

        val ObjetoIntent2: Intent=intent
        var Apellido = ObjetoIntent1.getStringExtra("Apellido")
        apellido_2.text = "";

        val ObjetoIntent3: Intent=intent
        var Monto = ObjetoIntent1.getStringExtra("Monto")
        monto_3.text = "";

        val ObjetoIntent4: Intent=intent
        var Plazo = ObjetoIntent1.getStringExtra("Plazo")
        plazo_4.text = "";

        val ObjetoIntent5: Intent=intent
        var Taza = ObjetoIntent1.getStringExtra("Taza")
        taza_5.text = "";


    }
}
