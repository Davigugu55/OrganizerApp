package com.ufmt.organizer.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.ufmt.organizer.*

import kotlinx.android.synthetic.main.fragment_home.*
import kotlin.random.Random

class HomeFragment : Fragment(), CandidatoAdapter.OnItemClickListener {

    private lateinit var homeViewModel: HomeViewModel
    var candidatosList = getListaCandidatos(60).sortedBy { it.cargoPretendido }
    private val adapter = CandidatoAdapter(candidatosList, this)

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
                ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)


        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recycler_view.adapter = CandidatoAdapter(candidatosList, this)
        recycler_view.layoutManager = LinearLayoutManager(this.context)
        recycler_view.setHasFixedSize(true)
    }

    private fun getListaCandidatos(size: Int): List<CandidatoItem> {
        val list = ArrayList<CandidatoItem>()
        val nomesArray = arrayOf("Pedro", "João", "Maria", "José", "Carlos", "Edmundo", "Matheus", "Ronaldo", "David", "Thiago", "Júlia", "Larissa", "Eliza")
        val sobrenomesArray = arrayOf("Silva", "Ribeiro", "Souza", "Cruz", "Santos", "Albuquerque", "Cury", "Lima", "Costa", "Oliveira", "Pereira", "Garcia", "Vasconcelos", "Moreira", "Pinto", "Melo")
        val cargosArray = arrayOf("Analista de Sistemas", "Programador Júnior", "Programador Sênior", "Designer", "Diretor de Marketing", "Vendedor Externo", "Suporte")
        val statusArray = arrayOf("Entrevista Pendente", "Aprovado", "Reprovado")
        val fotosArray = arrayOf(R.drawable.man, R.drawable.man_2, R.drawable.woman, R.drawable.millennial, R.drawable.boy)

        for (i in 0 until size) {
            val item = CandidatoItem(fotosArray[Random.nextInt(fotosArray.size)]
                , nomesArray[Random.nextInt(nomesArray.size)] + " " + sobrenomesArray[Random.nextInt(sobrenomesArray.size)]
                , cargosArray[Random.nextInt(cargosArray.size)]
                , statusArray[Random.nextInt(statusArray.size)]
                , Random.nextBoolean())

            list += item
        }
        return list
    }

    override fun onItemClick(position: Int) {
//        Toast.makeText(this.context, "Item $position clicked", Toast.LENGTH_SHORT).show()

        val clickedItem = candidatosList[position]
        if(clickedItem.assinouPresenca){
            val intent = Intent(this.context, Entrevista::class.java)
            intent.putExtra("CLICKED_ITEM", clickedItem)
            startActivity(intent)
        }else{
            val intent = Intent(this.context, Assinatura::class.java)
            intent.putExtra("CLICKED_ITEM", clickedItem)
            startActivity(intent)
        }

//        clickedItem.nomeCandidato = "Clicked"
//        adapter.notifyItemChanged(position)
    }

}
