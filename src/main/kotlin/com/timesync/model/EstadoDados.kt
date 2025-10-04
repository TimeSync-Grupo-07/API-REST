package com.timesync.model

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "estado_Dados")
class EstadoDados {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    val idEstadoDado: UUID? = null

    @Column
    val nomeEstadoDado: String = ""
}