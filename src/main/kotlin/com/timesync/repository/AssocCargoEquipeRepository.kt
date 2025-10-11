package com.timesync.repository

import com.timesync.DTO.CategoriaValorHoraDTO
import com.timesync.model.AssocCargoEquipe
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface AssocCargoEquipeRepository : JpaRepository<AssocCargoEquipe, UUID> {

    @Query("""
        SELECT new com.timesync.DTO.CategoriaValorHoraDTO(
            a.cargoUsuario.tituloCargoUsuario,
            a.valorHora
        )
        FROM AssocCargoEquipe a
        JOIN a.equipe e
        JOIN e.gestor g
        WHERE g.matricula = :matricula
    """)
    fun buscarCategoriaValorHora(@Param("matricula") matricula: Int): List<CategoriaValorHoraDTO>
}
