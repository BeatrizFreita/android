package br.senai.sp.jandira.imcapp20

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

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

        if (user == "user@email.com" && pass == "123") {
            val precerences = getSharedPreferences("biometria" , Context.MODE_PRIVATE)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }else {
            tvMensagemErro.text = "Usuário ou senha incorretos"
        }
    }
}