package br.senai.sp.jandira.imcapp20

import android.util.Log

fun calcularImc(peso: Double, altura: Double ) = peso / (altura * altura)
    fun obter_status(imc: Double): List<String> {
        var resultados = emptyList<String>()

        if (imc < 18.5) {
             resultados = listOf("Abaixo do Peso", "Risco de fadiga, stress e ansiedade")
        } else if (imc > 18.5 && imc < 25) {
            resultados = listOf("Peso Ideal", "Menor riscos de doenças cardíacas e vasculares.")
        } else if (imc >=25 && imc < 30) {
            resultados = listOf("Acima do Peso", "Fadiga, má circulação, varizes")
        } else if(imc >= 30 && imc < 35) {
            resultados = listOf("Obesidade Grau I", "Diabete, angina, infarto, aterosclerose")
        } else if(imc >= 35 && imc < 40) {
            resultados = listOf("Obesidade Grau II", "Apneia do sono, falta de ar")
        } else{
            resultados = listOf("Obesidade Grau III", "Refluxo, dificuldade para se mover, escaras, diabetes, infarto, AVC")
        }
        return resultados
    }
