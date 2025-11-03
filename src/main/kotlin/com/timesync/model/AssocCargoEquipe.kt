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
@Table(name = "assoc_cargo_equipe")
data class AssocCargoEquipe(
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(columnDefinition = "BINARY(16)")
    val idAssocCargoEquipe: UUID,

    @ManyToOne
    @JoinColumn(name = "usuarios_matricula")
    val usuario: Usuarios,

    @ManyToOne
    @JoinColumn(name = "equipe_id_equipe")
    val equipe: Equipe,

    @ManyToOne
    @JoinColumn(name = "cargo_usuario_id_cargo_usuario")
    val cargoUsuario: CargoUsuario,

    val valorHora: Double
)