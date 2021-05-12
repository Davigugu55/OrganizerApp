package com.ufmt.organizer

import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.switchmaterial.SwitchMaterial

class Entrevista : AppCompatActivity() {

    var totalPontos = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_entrevista)
        setSupportActionBar(findViewById(R.id.toolbar))

        if(findViewById<SwitchMaterial>(R.id.switch1).isChecked){
            totalPontos++
        }else if (findViewById<SwitchMaterial>(R.id.switch2).isChecked){
            totalPontos++
        }else if (findViewById<SwitchMaterial>(R.id.switch3).isChecked){
            totalPontos++
        }else if (findViewById<SwitchMaterial>(R.id.switch4).isChecked){
            totalPontos++
        }else if (findViewById<SwitchMaterial>(R.id.switch5).isChecked){
            totalPontos++
        }else if (findViewById<SwitchMaterial>(R.id.switch6).isChecked){
            totalPontos++
        }else if (findViewById<SwitchMaterial>(R.id.switch7).isChecked){
            totalPontos++
        }else if (findViewById<SwitchMaterial>(R.id.switch8).isChecked){
            totalPontos++
        }else if (findViewById<SwitchMaterial>(R.id.switch9).isChecked){
            totalPontos++
        }else if (findViewById<SwitchMaterial>(R.id.switch10).isChecked){
            totalPontos++
        }else if (findViewById<SwitchMaterial>(R.id.switch11).isChecked){
            totalPontos+2
        }else if (findViewById<SwitchMaterial>(R.id.switch12).isChecked){
            totalPontos+2
        }else if (findViewById<SwitchMaterial>(R.id.switch13).isChecked){
            totalPontos+2
        }else if (findViewById<SwitchMaterial>(R.id.switch14).isChecked){
            totalPontos+2
        }else if (findViewById<SwitchMaterial>(R.id.switch15).isChecked){
            totalPontos+2
        }else if (findViewById<SwitchMaterial>(R.id.switch16).isChecked){
            totalPontos+2
        }else if (findViewById<SwitchMaterial>(R.id.switch17).isChecked){
            totalPontos+3
        }else if (findViewById<SwitchMaterial>(R.id.switch18).isChecked){
            totalPontos+3
        }else if (findViewById<SwitchMaterial>(R.id.switch19).isChecked){
            totalPontos+3
        }else if (findViewById<SwitchMaterial>(R.id.switch20).isChecked){
            totalPontos+3
        }else if (findViewById<SwitchMaterial>(R.id.switch21).isChecked){
            totalPontos+4
        }else if (findViewById<SwitchMaterial>(R.id.switch22).isChecked){
            totalPontos+4
        }else if (findViewById<SwitchMaterial>(R.id.switch23).isChecked){
            totalPontos+4
        }else if (findViewById<SwitchMaterial>(R.id.switch24).isChecked){
            totalPontos+4
        }

        findViewById<TextView>(R.id.textView3).text = "Pontuação: " + totalPontos


    }

    fun addPoint1(view: View) {
        // Do something in response to button click
        totalPontos++
        findViewById<TextView>(R.id.textView3).text = "Pontuação: " + totalPontos
    }

    fun addPoint2(view: View) {
        // Do something in response to button click
        totalPontos+=2
        findViewById<TextView>(R.id.textView3).text = "Pontuação: " + totalPontos
    }

    fun addPoint3(view: View) {
        // Do something in response to button click
        totalPontos+=3
        findViewById<TextView>(R.id.textView3).text = "Pontuação: " + totalPontos
    }

    fun addPoint4(view: View) {
        // Do something in response to button click
        totalPontos+=4
        findViewById<TextView>(R.id.textView3).text = "Pontuação: " + totalPontos
    }

}