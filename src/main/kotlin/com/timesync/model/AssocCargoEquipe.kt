package com.timesync.model

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
class AssocCargoEquipe {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    val idAssocCargoEquipe: UUID? = null

    @ManyToOne
    @JoinColumn(name = "usuarios_matricula")
    val usuario: Usuarios? = null

    @ManyToOne
    @JoinColumn(name = "equipe_id_equipe")
    val equipe: Equipe? = null

    @ManyToOne
    @JoinColumn(name = "cargo_usuario_id_cargo_usuario")
    val cargoUsuario: CargoUsuario? = null

    val valorHora: Float? = null

}