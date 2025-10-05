package com.timesync.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.sql.Timestamp
import java.util.UUID

@Entity
@Table(name = "projetos")
class Projetos {

    @Id @Column(length = 6)
    val idProjeto: String = ""

    @Column
    val nomeProjeto: String = ""

    @Column
    val horasEstimadasProjeto: Timestamp? = null

    @Column
    val horasApontadasProjeto: Timestamp? = null

    @field:ManyToOne
    val idEstadoDado: UUID? = null

}