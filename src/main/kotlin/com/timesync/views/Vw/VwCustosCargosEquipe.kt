package com.timesync.views.Vw

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.annotations.Immutable
import java.util.UUID

@Entity
@Table(name="vw_custos_cargos_equipe")
@Immutable
data class VwCustosCargosEquipe (

    @Id
    @Column
    val idCargoUsuario: UUID?,

    @Column
    val categoria: String?,

    @Column
    val custoHoraTrabalho: Int?

)