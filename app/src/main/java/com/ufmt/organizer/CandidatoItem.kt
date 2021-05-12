package com.ufmt.organizer

import java.io.Serializable

data class CandidatoItem(val fotoCandidato: Int, var nomeCandidato: String, val cargoPretendido: String, var  status:String, var assinouPresenca:Boolean):Serializable