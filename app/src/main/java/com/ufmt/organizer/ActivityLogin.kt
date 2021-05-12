package com.ufmt.organizer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

const val USERNAME = "com.ufmt.organizer.MESSAGE"

class ActivityLogin : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun login(view: View) {

        val textViewUsername = findViewById<EditText>(R.id.editTextUsername).text
        val textViewPassword = findViewById<EditText>(R.id.editTextPassword).text
        val intent = Intent(this, ActivityAppBar::class.java)
        //Toast.makeText(this@MainActivity, textViewPassword, Toast.LENGTH_SHORT).show()
        if(textViewUsername.isEmpty() || textViewPassword.isEmpty()){
            Toast.makeText(this@ActivityLogin, "Erro: Preencha todos os campos!", Toast.LENGTH_SHORT).show()
        }else startActivity(intent)

    }
}