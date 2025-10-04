package com.timesync.model

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "cargo_usuario")
class CargoUsuario {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    val idCargoUsuario: UUID? = null

    @Column
    val tituloCargoUsuario: String = ""

}