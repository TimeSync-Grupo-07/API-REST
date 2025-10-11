package com.timesync.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.util.Date

@Entity
@Table(name = "projetos")
data class Projetos (

    @Id @Column(length = 6)
    val idProjeto: String,

    @Column
    val nomeProjeto: String,

    @Column
    val dataEntregaProjeto: Date,

    @Column
    val dataInicioProjeto: Date,

    @field:ManyToOne
    @JoinColumn(name = "id_estado_dado")
    val EstadoDados: EstadoDados
)