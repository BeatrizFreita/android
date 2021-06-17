package br.senai.sp.jandira.imcapp20

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultadoNcdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultado_ncd)

        val textViewNcd: TextView = findViewById(R.id.text_view_ncd)

        val peso = intent.getDoubleExtra("peso", 0.0)
        val idade = intent.getIntExtra("idade", 0)
        val sexo =  intent.getIntExtra("sexo", 0)
        val atividade =  intent.getIntExtra("atividade", 0)
        val txtDica: TextView = findViewById(R.id.text_view_dica_ncd)
          textViewNcd.text =  nivelAtividade(sexo, atividade).toString()
        textViewNcd.text = String.format ( "%.1f",resultadoFinalNcd(peso, idade, atividade, sexo))

        txtDica.text = getDicaDoDiaNcd()

    //  text_view_status.text =
     //   text_view_statuss.text =
     //   text_view_statusss.text =
    }
}