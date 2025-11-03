package com.timesync.DTO

import java.sql.Date
import java.sql.Timestamp

data class ProjetosInfoDTO(
    val projeto: String,
    val custoEstimado: Double,
    val horasEstimadas: Long,
    val dataEntrega: Timestamp,
    val dataInicio: Timestamp
)