package com.timesync.views

import jakarta.persistence.*
import org.hibernate.annotations.Immutable

@Entity
@Table(name = "vw_resumo_projetos_equipe")
@Immutable
data class VwResumoProjetosEquipe(

    @Id
    @Column
    val idProjeto: String,

    @Column
    val nomeProjeto: String,

    @Column
    val custoEstimadoLaboral: Double?,

    @Column
    val horasPlanejadas: Int?,

    @Column
    val dataEntrega: String,

    @Column
    val dataInicio: String

)
