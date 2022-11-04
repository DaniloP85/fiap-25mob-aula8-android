package com.fiap.aula8

internal fun getImcResult(pesoTxt: String, alturaTxt: String): IMCResult {

    if (alturaTxt.isBlank() || pesoTxt.isBlank()) {
        return IMCResult(Result.BLANK)
    }

    val peso = pesoTxt.toFloat()
    val altura = alturaTxt.toFloat()

    val imc = peso / (altura * altura)
    return when {
        (imc < 16) -> IMCResult(Result.MAGREZA_III)
        (imc < 17) -> IMCResult(Result.MAGREZA_II)
        (imc < 18.5) -> IMCResult(Result.MAGREZA_I)
        (imc < 25) -> IMCResult(Result.OK)
        (imc < 30) -> IMCResult(Result.SOBREPESO)
        (imc < 35) -> IMCResult(Result.OBESIDADE_I)
        (imc < 40) -> IMCResult(Result.OBESIDADE_II)
        else -> {
            IMCResult(Result.OBESIDADE_III)
        }
    }
}

data class IMCResult(val result: Result)

enum class Result(val label: String) {
    MAGREZA_III("Magreza Severa"),
    MAGREZA_II("Magreza moderada"),
    MAGREZA_I("Magreza leve"),
    OK("Saudável"),
    SOBREPESO("Sobrepeso"),
    OBESIDADE_I("Obesidade Grau I"),
    OBESIDADE_II("Obesidade GHrau II (severa)"),
    OBESIDADE_III("Obesidade GHrau III (mórbida)"),
    BLANK("Insira os valores de peso e altura corretamente")
}