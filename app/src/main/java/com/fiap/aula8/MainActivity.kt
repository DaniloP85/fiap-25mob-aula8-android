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
            val peso = edt_peso.text.toString()
            val altura = edt_altura.text.toString()

            val imc = getImcResult(peso, altura)
            txt_result_imc.text = imc.result.label
        }
    }
}