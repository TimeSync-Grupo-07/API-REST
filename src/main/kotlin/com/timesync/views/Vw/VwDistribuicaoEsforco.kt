package com.timesync.views.Vw

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.IdClass
import jakarta.persistence.Table
import org.hibernate.annotations.Immutable
import java.io.Serializable
import java.io.SerializablePermission
import java.math.BigDecimal

@Entity
@Table(name="vw_distribuicao_esforco")
@Immutable
data class VwDistribuicaoEsforco(

    @Id
    @Column
    val idProjeto: String,

    @Column
    val nomeProjeto: String?,

    @Column
    val matricula: Int,

    @Column
    val nomeColaborador: String?,

    @Column
    val horasPlanejadas: Int?,

    @Column
    val percentualEsforco: BigDecimal?
)
