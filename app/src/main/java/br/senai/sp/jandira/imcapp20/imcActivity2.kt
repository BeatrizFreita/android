package br.senai.sp.jandira.imcapp20

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class imcActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc2)

        val btnCalcular: Button = findViewById(R.id.button_calcular_imc)
        val edPeso: EditText = findViewById(R.id.ed_peso)
        val edAltura: EditText = findViewById(R.id.ed_altura)

        btnCalcular.setOnClickListener {

            if (edPeso.text.isEmpty()) {
                edPeso.error = "Voce não me disse o seu peso"
            }
            if (edAltura.text.isEmpty()) {
                edAltura.error = "Voce não me disse a sua altura"
            }

            if (edPeso.text.isNotEmpty() && edAltura.text.isNotEmpty()) {
                val peso: Double = edPeso.text.toString().toDouble()
                val altura: Double = edAltura.text.toString().toDouble()


                val intent = Intent(this, ResultadoImcActivity::class.java)
                intent.putExtra("peso", peso)
                intent.putExtra("altura", altura)
                startActivity(intent)

            }
        }
    }
}