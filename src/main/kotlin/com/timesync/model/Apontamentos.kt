package com.timesync.model

import jakarta.persistence.*
import java.sql.Time
import java.util.Date
import java.util.UUID

@Entity
@Table(name = "apontamentos")
data class Apontamentos (

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(columnDefinition = "BINARY(16)")
    val idApontamento: UUID,

    @Column
    val dataApontamento: Date,

    @Column
    val ocorrenciaApontamento: String,

    @Column
    val justificativaApontamento: String,

    @ManyToOne
    @JoinColumn(name = "id_projeto")
    val projeto: Projetos,

    @Column
    val horaInicioApontamento: Time,

    @Column
    val horaFimApontamento: Time,

    @Column
    val horasTotaisApontamento: Float,

    @Column
    val motivoApontamento: String,

    @field:ManyToOne
    @JoinColumn(name = "usuarios_matricula")
    val usuario: Usuarios,

    @ManyToOne
    @JoinColumn(name = "id_estado_dado")
    val estadoDados: EstadoDados,

)