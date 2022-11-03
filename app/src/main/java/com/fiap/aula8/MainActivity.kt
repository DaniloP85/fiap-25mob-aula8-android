package com.fiap.aula8

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_make_calc.setOnClickListener {
            val pesoTxt = edt_peso.text.toString()
            val alturaTxt = edt_altura.text.toString()
            val peso = pesoTxt.toFloat()
            val altura = alturaTxt.toFloat()
            val imc = peso / (altura * altura)
            when {
                imc < 16 -> txt_result_imc.text = "Magreza grave"
                imc < 17 -> txt_result_imc.text = "Magreza moderada"
                imc < 18.5 -> txt_result_imc.text = "Magreza leve"
                imc < 25 -> txt_result_imc.text = "Saudável"
                imc < 30 -> txt_result_imc.text = "Sobrepeso"
                imc < 35 -> txt_result_imc.text = "Obesidade Grau I"
                imc < 40 -> txt_result_imc.text = "Obesidade Grau II (severa)"
                else -> {
                    txt_result_imc.text = "Obesidade Grau III (mórbida)"
                }
            }
        }
    }
}