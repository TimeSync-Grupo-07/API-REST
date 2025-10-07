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
    val justificativa: String = ""

//    @ManyToOne
//    @JoinColumn(name = "id_projeto")
//    val projeto: Projeto? = null

    @Column
    val horaInicio: Time? = null

    @Column
    val horaFim: Time? = null

    @Column
    val horasTotais: Int? = null

    @Column
    val motivo: String = ""

//    @field:ManyToOne
//    @JoinColumn(name = "usuarios_matricula")
//    val usuario: Usuario? = null

    @ManyToOne
    @JoinColumn(name = "id_estado_dado")
    val estadoDados: EstadoDados? = null

}