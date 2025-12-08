package com.timesync.views

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.Immutable

@Entity
@Table(name="vw_informacoes_calculo")
@Immutable
data class VwInformacoesCalculo (

    @Id @Column
    val matricula: Int,

    val valorHoraColaborador: Double,

    val horasPlanejadasTotais: Double,

    val horasApontadasTotais: Double

)

