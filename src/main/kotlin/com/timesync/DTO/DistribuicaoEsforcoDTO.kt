package com.timesync.DTO

data class DistribuicaoEsforcoDTO(

    val idProjeto: String,

    val nomeProjeto: String,

    val matricula: Int,

    val nomeColaborador: String,

    val horasPlanejadas: Int,

    val percentualEsforco: Long
)
