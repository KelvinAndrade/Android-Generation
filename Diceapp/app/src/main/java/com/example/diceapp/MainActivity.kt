package com.example.diceapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonD6 = findViewById<Button>(R.id.buttonD6)

        buttonD6.setOnClickListener {
            //Toast.makeText(this, "Botão clicado", Toast.LENGTH_LONG).show()
            rolarDados(6)

            val buttonD12 = findViewById<Button>(R.id.buttonD12)

            buttonD12.setOnClickListener {

                rolarDados(12)

               val buttonD20 = findViewById<Button>(R.id.buttonD20)

                buttonD20.setOnClickListener {
                    rolarDados(20)
                }
            }

        }
    }

            private fun rolarDados(lados: Int) {
                val rolagem = (1..lados).random()

                val textDado = findViewById<TextView>(R.id.textDado)

                textDado.text = rolagem.toString()

                fun rolarDados(lados: Int) {
                    val rolagem = (1..lados).random()

                    val textDado = findViewById<TextView>(R.id.textDado)

                    textDado.text = rolagem.toString()

                    fun rolarDados(lados: Int) {
                        val rolagem = (1..lados).random()

                        val textDado = findViewById<TextView>(R.id.textDado)

                        textDado.text = rolagem.toString()
                    }
                }
            }
}

