package br.senai.sp.jandira.imcapp20.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import br.senai.sp.jandira.imcapp20.R
import kotlinx.android.synthetic.main.activity_login2.*

class LoginActivity2 : AppCompatActivity() {
    lateinit var editUser: EditText
    lateinit var editPassword: EditText
    lateinit var bntLogin: Button
    lateinit var tvMensagemErro: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        editUser = findViewById(R.id.ed_user)
        editPassword = findViewById(R.id.ed_password)
        bntLogin = findViewById(R.id.bnt_Login)
        tvMensagemErro = findViewById(R.id.tv_mensagem_erro)

        bntLogin.setOnClickListener {
            login()
        }
    }

    private fun login() {
        //email: user@email.com
        //senha: 123

        val user = editUser.text.toString()
        val pass = editPassword.text.toString()

        val dados = getSharedPreferences("dados_usuario", Context.MODE_PRIVATE)

        val userPreferences = dados.getString("email", "Não encontrado")
        val passPreferences = dados.getString("senha", "Não encontrado")

        if (user == userPreferences && pass == passPreferences){
            // Armazenar os dados no usuário no SharedPreferences
            val intent = Intent(this, DashBoardActivity::class.java)

            //Gravar e lembrar do SharedPreferences
            val editor = dados.edit()
            editor.putBoolean("lembrar", check_lembrar.isChecked)
            editor.apply()

            startActivity(intent)
            finish()
        }else {
            tvMensagemErro.text = "Usuário ou senha incorretos"
        }
    }
}