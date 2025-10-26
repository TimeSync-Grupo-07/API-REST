package com.timesync.DTO

import java.math.BigDecimal

data class IndicadoresJornadaDTO (

    val idProjeto: String?,

    val nomeProjeto: String?,

    val matricula: Int?,

    val nomeColaborador: String?,

    val horasPlanejadas: Int?,

    val horasApontadas: Double?,

    val horasExtras: Double?,

    val horasRetroativas: Double?,

    val indiceCumprimento: Double?,

    val indiceExcedente: Double?,

    val taxaErroApontamento: Double?

)