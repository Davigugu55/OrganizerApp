package com.ufmt.organizer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CandidatoAdapter(private val candidatoList: List<CandidatoItem>, private val listener: OnItemClickListener) : RecyclerView.Adapter<CandidatoAdapter.CandidatoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CandidatoViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.candidato_item,
            parent, false)

        return CandidatoViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CandidatoViewHolder, position: Int) {
        val currentItem = candidatoList[position]

        holder.imageView.setImageResource(currentItem.fotoCandidato)
        holder.textView1.text = currentItem.nomeCandidato
        holder.textView2.text = currentItem.cargoPretendido
    }

    override fun getItemCount() = candidatoList.size

    inner class CandidatoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener{
        val imageView: ImageView = itemView.findViewById(R.id.image_view)
        val textView1: TextView = itemView.findViewById(R.id.text_view_1)
        val textView2: TextView = itemView.findViewById(R.id.text_view_2)

        init {
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION){
                listener.onItemClick(position)
            }
        }
    }

    interface OnItemClickListener{
        fun onItemClick(position: Int)
    }
}