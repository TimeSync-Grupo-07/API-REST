package com.timesync.views.Vw

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.Immutable
import java.util.*

@Entity
@Table(name = "vw_prazo_entrega_projeto")
@Immutable
data class VwPrazoEntregaProjeto (
    @Id
    @Column
    val idProjeto: String,

    @Column
    val nomeProjeto: String,

    @Column
    val prazoEntrega: Date,
) {

}