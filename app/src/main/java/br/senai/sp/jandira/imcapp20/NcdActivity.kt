package br.senai.sp.jandira.imcapp20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_ncd.*

class NcdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ncd)

        val buttonCalcular: Button = findViewById(R.id.button_calcular_ncd)

        val editTextPeso : EditText = findViewById(R.id.ed_pesoncd)
        val editTextIdade: EditText = findViewById(R.id.ed_idade)
        val generoMasculino:  RadioButton = findViewById(R.id.ed_masculino)
        val generoFeminino:  RadioButton = findViewById(R.id.ed_feminino)
        val atividadeLeve:  RadioButton = findViewById(R.id.ed_leve)
        val atividadeModerada:  RadioButton = findViewById(R.id.ed_moderado)
        val atividadeIntensa:  RadioButton = findViewById(R.id.ed_intenso)

        var sexo = 0
        var atividade = 0
        buttonCalcular.setOnClickListener {

            if (ed_pesoncd.text.isEmpty()) {
                ed_pesoncd.error = "Voce não me disse o seu peso"
            }
            if (ed_idade.text.isEmpty()) {
                ed_idade.error = "Voce não me disse a sua idade"
            }


            if (ed_pesoncd.text.isNotEmpty() && ed_idade.text.isNotEmpty()) {
                val peso: Double = ed_pesoncd.text.toString().toDouble()
                val altura: Double = ed_idade.text.toString().toDouble()



                val intent = Intent(this, ResultadoNcdActivity::class.java)

                if (generoMasculino.isChecked) {
                    sexo = 1
                } else if (generoFeminino.isChecked) {
                    sexo = 2
                }


                if (atividadeLeve.isChecked) {
                    atividade = 1
                } else if (atividadeModerada.isChecked) {
                    atividade = 2
                } else if (atividadeIntensa.isChecked) {
                    atividade = 3
                }


                intent.putExtra("sexo", sexo.toString().toInt())
                intent.putExtra("atividade", atividade.toString().toInt())
                intent.putExtra("peso", editTextPeso.text.toString().toDouble())
                intent.putExtra("idade", editTextIdade.text.toString().toInt())
                startActivity(intent)

            }
        }
    }
}