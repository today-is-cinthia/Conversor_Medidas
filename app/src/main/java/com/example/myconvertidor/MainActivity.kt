package com.example.myconvertidor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.myconvertidor.convertidor.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val origen : RadioGroup = findViewById(R.id.radiogroup_Origen)
        val destino : RadioGroup = findViewById(R.id.radiogroup_Destino)
        var num : EditText = findViewById(R.id.editnum)
        val btnConvertir = findViewById<Button>(R.id.convertir)
        val result = findViewById<TextView>(R.id.resultado)


        val RGBid = RBGID()
        val indexO = RGBid.findCheckRBId(origen)
        val indexD = RGBid.findCheckRBId(destino)

        btnConvertir.setOnClickListener {

            if(indexO == 0 && indexD == 0)
            {
                Toast.makeText(applicationContext, "Seleccione una medida de destino diferente al origen", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            else if(indexO == 1 && indexD == 1)
            {
                Toast.makeText(applicationContext, "Seleccione una medida de destino diferente al origen", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            else if(indexO == 2  && indexD == 2)
            {
                Toast.makeText(applicationContext, "Seleccione una medida de destino diferente al origen", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            if(num.text.isEmpty()){
                Toast.makeText(applicationContext, "Por favor rellene el campo", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }
            val indexO = RGBid.findCheckRBId(origen)
            val indexD = RGBid.findCheckRBId(destino)

            if(indexD == -1 || indexO == -1){
                Toast.makeText(applicationContext, "Seleccione las medidas que desea convertir", Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if(indexO == 0 && indexD == 1)
            {
                val medida: Float= num.text.toString().toFloat();

                val kmametrov = kmametro()
                result.text = kmametrov.kmametro(medida).toString() + " m"
            }

            if(indexO == 0 && indexD == 2)
            {
                val medida: Float= num.text.toString().toFloat();

                val kmacmv = kmacm()
                result.text = kmacmv.kmacm(medida).toString() + " cm"
            }

            if(indexO == 1 && indexD == 0)
            {
                val medida: Double= num.text.toString().toDouble();

                val makmv = metroakm()
                result.text = makmv.metroakm(medida).toString() + " km"
            }
            if(indexO == 1 && indexD == 2)
            {
                val medida: Double= num.text.toString().toDouble();

                val macmv = metroacm()
                result.text = macmv.metroacm(medida).toString() + " cm"
            }
            if(indexO == 2 && indexD == 0)
            {
                val medida: Double= num.text.toString().toDouble();

                val cmakmv = cmakm()
                result.text = cmakmv.cmakm(medida).toString() + " km"
            }
            if(indexO == 2 && indexD == 1)
            {
                val medida: Double= num.text.toString().toDouble();

                val cmamv = cmametro()
                result.text = cmamv.cmametro(medida).toString() + " m"
            }

        }
        }
}