package com.timesync.views

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.Immutable

@Entity
@Table(name="vw_horas_apontadas")
@Immutable
data class VwHorasApontadas (

    @Id
    @Column
    val idProjeto: String?,

    @Column
    val nomeProjeto: String?,

    @Column
    val horasApontadas: Int?

)