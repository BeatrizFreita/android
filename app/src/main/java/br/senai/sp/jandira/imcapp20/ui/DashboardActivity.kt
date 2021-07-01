package br.senai.sp.jandira.imcapp20.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.senai.sp.jandira.imcapp20.R

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        preencherDashBoardActivity()

        tv_logout.setOnClickListener {
            val dados = getSharedPreferences("dados_usuario", Context.MODE_PRIVATE)
            val editor = dados.edit()
            editor.putBoolean("lembrar", false)
            editor.apply()
            finish()
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }

    private fun preencherDashBoardActivity() {
        val dados = getSharedPreferences("dados_usuario", Context.MODE_PRIVATE)

        tv_profile_name.text = dados.getString("nome", "")
        tv_profile_ocupation.text = dados.getString("profissao", "")
        tv_weight.text = dados.getInt("peso", 0).toString()
        tv_age.text = dados.getInt("idade", 0).toString()

        // ***Colocar foto do GitHub no ImageView
        val url = "https://avatars.githubusercontent.com/u/77053543?v=4"
        Glide.with(this).load(url).into(iv_profile)

    }
}