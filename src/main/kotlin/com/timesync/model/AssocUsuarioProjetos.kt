package com.timesync.model

import jakarta.persistence.*
import java.sql.Date
import java.util.UUID

@Entity
@Table(name = "assoc_usuario_projetos")
class AssocUsuarioProjetos {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    val idAssocUsuariosProjetos: UUID? = null

    @ManyToOne
    @JoinColumn(name = "usuarios_matricula")
    val usuario: Usuarios? = null

    @ManyToOne
    @JoinColumn(name = "id_projeto")
    val projeto: Projetos? = null

    @Column
    val dataCriacaoAssociacao: Date? = null

    @Column
    val horasPlanejadas: Int? = null

    @Column
    val dataAtualizacaoAssociacao: Date? = null

}