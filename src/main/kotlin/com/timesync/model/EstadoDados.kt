package com.timesync.model

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "estado_Dados")
data class EstadoDados(

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(columnDefinition = "BINARY(16)")
    val idEstadoDado: UUID,

    @Column
    val nomeEstadoDado: String
)