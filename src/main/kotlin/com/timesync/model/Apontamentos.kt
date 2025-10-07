package com.timesync.model

import jakarta.persistence.*
import java.sql.Time
import java.util.Date
import java.util.UUID

@Entity
@Table(name = "apontamentos")
class Apontamentos {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    val idApontamento: UUID? = null

    @Column
    val dataApontamento: Date? = null

    @Column
    val ocorrenciaApontamento: String = ""

    @Column
    val justificativaApontamento: String = ""

    @ManyToOne
    @JoinColumn(name = "id_projeto")
    val projeto: Projetos? = null

    @Column
    val horaInicioApontamento: Time? = null

    @Column
    val horaFimApontamento: Time? = null

    @Column
    val horasTotaisApontamento: Time? = null

    @Column
    val motivoApontamento: String = ""

    @field:ManyToOne
    @JoinColumn(name = "usuarios_matricula")
    val usuario: Usuarios? = null

    @ManyToOne
    @JoinColumn(name = "id_estado_dado")
    val estadoDados: EstadoDados? = null

}