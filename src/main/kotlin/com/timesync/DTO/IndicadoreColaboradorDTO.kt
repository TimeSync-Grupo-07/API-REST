package com.timesync.DTO

import java.math.BigDecimal

data class IndicadoreColaboradorDTO(

    val projeto: String,
    val horasPlanejadas: Int,
    val horasApontadas: Int,
    val horasExtras: Int,
    val taxaErroApontamento: BigDecimal

)