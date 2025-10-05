package com.timesync.model

import jakarta.persistence.*
import java.util.Date
import java.util.UUID

@Entity
@Table(name = "usuarios")
class Usuarios {

    @Id
    val matricula: Int? = null

    @Column(length = 100)
    val nomeCompletoUsuario: String = ""

    @Column(length = 150)
    val emailUsuario: String = ""

    @Column(length = 255)
    val idMicrosoftUsuario: String = ""

    @Column
    val dataCriacaoUsuario: Date? = null

    @Column
    val dataAtualizacaoUsuario: Date? = null

    @field:ManyToOne
    @JoinColumn(name = "id_estado_dado")
    val EstadoDados: EstadoDados? = null

    @field:ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "matricula_superior")
    val Superior: Usuarios? = null

}