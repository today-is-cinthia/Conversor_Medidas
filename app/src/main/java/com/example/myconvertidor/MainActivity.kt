package com.example.myconvertidor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.myconvertidor.convertidor.RBGID

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val origen : RadioGroup = findViewById(R.id.radiogroup_Origen)
        val destino : RadioGroup = findViewById(R.id.radiogroup_Destino)
        val num : EditText = findViewById(R.id.editnum)
        val btnConvertir = findViewById<Button>(R.id.convertir)
        val result = findViewById<TextView>(R.id.resultado)


        val RGBid = RBGID()

        btnConvertir.setOnClickListener {

            if(num.text.isEmpty()){
                Toast.makeText(applicationContext, "Por favor rellene el campo", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            val indexO = RGBid.findCheckRBId(origen)
            val indexD = RGBid.findCheckRBId(destino)

            if(indexD == -1 || indexO == -1){
                Toast.makeText(applicationContext, "Debe seleccionar la medida origen y destino para poder convertir", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
        }
        }
}