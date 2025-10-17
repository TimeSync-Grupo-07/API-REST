package com.timesync.views.Vw

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.Immutable
import java.math.BigDecimal

@Entity
@Table(name="vw_indicadores_jornada")
@Immutable
data class VwIndicadoresJornada (

    @Id
    @Column
    val idProjeto: String,

    @Column
    val nomeProjeto: String,

    @Column
    val matricula: Int,

    @Column
    val nomeColaborador: String,

    @Column
    val horasPlanejadas: Int,

    @Column
    val horasApontadas: Int,

    @Column
    val horasExtras: Int,

    @Column
    val horasRetroativas: Int,

    @Column
    val indiceCumprimento: Int,

    @Column
    val indiceExcedente: Int,

    @Column
    val taxaErroApontamento: BigDecimal
)