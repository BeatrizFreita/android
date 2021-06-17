package br.senai.sp.jandira.imcapp20

import java.util.*

fun getDicaDoDiaNcd() : String {
    val dicas = listOf<String>(
        "Não fique parado. Mexer o corpo praticando qualquer tipo de atividade física só traz benefícios para você e para a sua vida.",
        "Uma alimentação saudável é capaz de mudar várias coisas em você, tanto externamente quanto internamente.",
        "Lembre-se que: nenhum dia é igual ao outro, logo suas NCDs costumam variar a cada dia.",
        "Não seja uma pessoa sedentária. Pratique e faça exercícios físicos pelo menos 2x por semana."
    )

    val sorteio = Random()

    val dica = sorteio.nextInt(dicas.size )
    return dicas[dica]
}