package com.timesync.model

import jakarta.persistence.*
import java.util.Date
import java.util.UUID

@Entity
@Table(name = "usuarios")
data class Usuarios (

    @Id
    val matricula: Int,

    @Column(length = 100)
    val nomeCompletoUsuario: String,

    @Column(length = 150)
    val emailUsuario: String,

    @Column(length = 40)
    val senhaUsuario: String,

    @Column(length = 255)
    val idMicrosoftUsuario: String,

    @Column
    val dataCriacaoUsuario: Date,

    @Column
    val dataAtualizacaoUsuario: Date,

    @field:ManyToOne
    @JoinColumn(name = "id_estado_dado")
    val EstadoDados: EstadoDados,

    @field:ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "matricula_superior")
    val Superior: com.timesync.model.Usuarios?

)