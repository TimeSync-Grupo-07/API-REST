package com.timesync.model

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import java.util.UUID

@Entity
@Table(name = "equipe")
class Equipe {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    val idEquipe: UUID? = null

    @Column
    val usuario_matricula: Int? = null

}