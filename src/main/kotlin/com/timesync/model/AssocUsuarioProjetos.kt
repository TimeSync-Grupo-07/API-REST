package com.timesync.model

import jakarta.persistence.*
import java.sql.Date
import java.util.UUID

@Entity
@Table(name = "assoc_usuario_projetos")
data class AssocUsuarioProjetos (

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(columnDefinition = "BINARY(16)")
    val idAssocUsuariosProjetos: UUID,

    @ManyToOne
    @JoinColumn(name = "usuarios_matricula")
    val usuario: Usuarios,

    @ManyToOne
    @JoinColumn(name = "id_projeto")
    val projeto: Projetos,

    @Column
    val dataCriacaoAssociacao: Date,

    @Column
    val horasPlanejadas: Int,

    @Column
    val dataAtualizacaoAssociacao: Date

)