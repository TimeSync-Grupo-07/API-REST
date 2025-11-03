package com.timesync.views.Vw

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.Immutable

@Entity
@Table(name="vw_custo_real_laboral")
@Immutable
data class VwCustoRealLaboral (
    @Id
    @Column
    val idProjeto: String?,

    @Column
    val nomeProjeto: String?,

    @Column
    val custoRealLaboral: Double?,
) {
}