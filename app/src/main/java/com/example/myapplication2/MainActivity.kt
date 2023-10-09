package com.example.myapplication2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication2.R.id.limpiarB
import com.example.myapplication2.R.id.mostrar
import com.example.myapplication2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.mostrar.setOnClickListener(){
            binding.vista.text = "Hola "+ binding.nombre.text.toString()
            Toast.makeText(this, "Hola" +  binding.nombre.text.toString(), Toast.LENGTH_LONG).show()

        }

        binding.limpiarB.setOnClickListener(){
            binding.vista.text = ""
            binding.nombre.text.clear()
        }



        /*
        setContentView(R.layout.activity_main)


        //referencia al boton
        var btn = findViewById<Button>(mostrar)

        //BOTON LIMPIAR
        var btnLimpiar = findViewById<Button>(limpiarB)


        //Agregar nombre a var
        var nombre = findViewById<EditText>(R.id.nombre)

        //Mostrar nombre en textview
        var mostrarNom = findViewById<TextView>(R.id.vista)



        btn.setOnClickListener(){
            mostrarNom.text = nombre.text.toString()
        }

        btnLimpiar.setOnClickListener(){
            nombre.text.clear()
            mostrarNom.text = ""

        }
        */

    }
}