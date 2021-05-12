package com.ufmt.organizer

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.ufmt.organizer.ui.home.HomeFragment

class Assinatura : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_assinatura)
        setSupportActionBar(findViewById(R.id.toolbar))

    }

    fun assinar(view: View) {
        val intent = Intent(this, Entrevista::class.java)
        startActivity(intent)
        finish()
    }
}