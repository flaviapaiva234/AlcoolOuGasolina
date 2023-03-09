package com.flaviapaiva.gasolinaalcool

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun calcular( view: View ){

        // Pegar as referncias do item na tela
        val etAlcool = findViewById<EditText>(R.id.etAlcool)
        val etGasolina = findViewById<EditText>(R.id.etGasolina)
        val tvResultado = findViewById<TextView>(R.id.tvResultado)

        val precoAlcool = etAlcool.text.toString()
        val precoGasolina = etGasolina.text.toString()

        if ( precoAlcool.isNotEmpty() ){
            if (precoGasolina.isNotEmpty()){
                val pAlcool = precoAlcool.toDouble()
                val pGasolina = precoGasolina.toDouble()

                val resultado = pAlcool / pGasolina
                if(resultado >= 0.7){ // se for menor que 0.7 então usa gasolina
                       tvResultado.text = "Melhor utilizar Gasolina"
                }
            }
        }else{ // se for maior que 0.7 então usa Alcool
            tvResultado.text = "Melhor utilizar Alcool"
        }
    }
}