package br.senai.sp.jandira.imcapp20


fun nivelAtividade(sexo: Int, atividade: Int):Double {
var ncdResultado = 0.0
    if (sexo == 1) {
        if(atividade == 1) {
            ncdResultado =  1.5
        }else if (atividade == 2) {
            ncdResultado = 1.8
        }else if (atividade == 3) {
            ncdResultado = 2.1
        }
    }else if(sexo == 2) {
        if(atividade == 1) {
            ncdResultado =  1.6
        }else if (atividade == 2) {
            ncdResultado = 1.6
        }else if (atividade == 3) {
            ncdResultado = 1.8
        }
    }
        return ncdResultado
    }

fun resultadoFinalNcd(peso: Double, idade: Int, atividade: Int, sexo: Int): Double {
    var ncdResultado = nivelAtividade(sexo, atividade)
    var resultadoFinal = 0.0
    if (sexo == 1) {
        if (idade > 17 && idade <= 30) {
            resultadoFinal = (15.3 * peso + 679) * ncdResultado
        } else if (idade >= 31 && idade <= 60) {
            resultadoFinal = (11.6 * peso + 879) * ncdResultado
        } else if ( idade > 60){
            resultadoFinal = (13.5 * peso + 487) * ncdResultado
        }
    } else if (sexo == 2){
        if (idade > 17 && idade <= 30) {
            resultadoFinal = (14.7 * peso + 496) * ncdResultado
        } else if (idade >= 31 && idade <= 60) {
            resultadoFinal = (8.7 * peso + 829) * ncdResultado
        } else if (idade > 60) {
            resultadoFinal = (10.5 * peso + 596) * ncdResultado
        }
    }
    return resultadoFinal
}
