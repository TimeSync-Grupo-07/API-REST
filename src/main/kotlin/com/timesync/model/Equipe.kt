package com.timesync.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(name = "equipe")
class Equipe {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    val idEquipe: UUID? = null

    @field:ManyToOne
    @JoinColumn(name = "usuarios_matricula")
    val gestor: Usuarios? = null

}