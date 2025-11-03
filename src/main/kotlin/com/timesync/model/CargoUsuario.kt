package com.timesync.model

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "cargo_usuario")
data class CargoUsuario (

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(columnDefinition = "BINARY(16)")
    val idCargoUsuario: UUID,

    @Column
    val tituloCargoUsuario: String

)