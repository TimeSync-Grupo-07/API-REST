package com.timesync.repository.model

import com.timesync.DTO.DistribuicaoEsforcoDTO
import com.timesync.DTO.IndicadoresJornadaDTO
import com.timesync.model.AssocUsuarioProjetos
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface AssocUsuarioProjetosRepository : JpaRepository<AssocUsuarioProjetos, UUID> {

    @Query("""
        SELECT new com.timesync.DTO.DistribuicaoEsforcoDTO(
            p.idProjeto,
            p.nomeProjeto,
            u.matricula,
            u.nomeCompletoUsuario,
            aup.horasPlanejadas,
            ROUND((aup.horasPlanejadas / SUM(aup.horasPlanejadas) OVER (PARTITION BY p.idProjeto)) * 100, 2)
        )
        FROM AssocUsuarioProjetos aup
        LEFT JOIN Usuarios u ON u.matricula = aup.usuario.matricula
        LEFT JOIN Projetos p ON p.idProjeto = aup.projeto.idProjeto        
    """)
    fun buscarDistribuicaoEsforco(): List<DistribuicaoEsforcoDTO>

    @Query("""
        SELECT new com.timesync.DTO.DistribuicaoEsforcoDTO(
            p.idProjeto,
            p.nomeProjeto,
            u.matricula,
            u.nomeCompletoUsuario,
            aup.horasPlanejadas,
            ROUND((aup.horasPlanejadas / SUM(aup.horasPlanejadas) OVER (PARTITION BY p.idProjeto)) * 100, 2)
        )
        FROM AssocUsuarioProjetos aup
        LEFT JOIN Usuarios u ON u.matricula = aup.usuario.matricula
        LEFT JOIN Projetos p ON p.idProjeto = aup.projeto.idProjeto
        WHERE p.idProjeto = :idProjeto
    """)
    fun buscarDistribuicaoEsforcoPorProjeto(@Param("idProjeto") idProjeto: String): List<DistribuicaoEsforcoDTO>

    @Query("""
    SELECT new com.timesync.DTO.IndicadoresJornadaDTO(
      p.idProjeto,
      p.nomeProjeto,
      u.matricula,
      u.nomeCompletoUsuario,
      aup.horasPlanejadas,
      SUM(a.horasTotaisApontamento),
      SUM(CASE WHEN a.motivoApontamento = 'Hora Extra' THEN a.horasTotaisApontamento ELSE 0 END),
      SUM(CASE WHEN a.motivoApontamento = 'Retroativo' THEN a.horasTotaisApontamento ELSE 0 END),
      ROUND((SUM(a.horasTotaisApontamento) / aup.horasPlanejadas) * 100, 2),
      ROUND((SUM(CASE WHEN a.motivoApontamento = 'Hora Extra' THEN a.horasTotaisApontamento ELSE 0 END) / aup.horasPlanejadas) * 100, 2),
      ROUND((SUM(CASE WHEN a.motivoApontamento = 'Retroativo' THEN a.horasTotaisApontamento ELSE 0 END) / NULLIF(SUM(a.horasTotaisApontamento), 0)) * 100, 2)
    )
    FROM AssocUsuarioProjetos aup
      LEFT JOIN Usuarios u ON u.matricula = aup.usuario.matricula
      LEFT JOIN Projetos p ON p.idProjeto = aup.projeto.idProjeto
      LEFT JOIN Apontamentos a ON a.usuario.matricula = u.matricula AND a.projeto.idProjeto = p.idProjeto
    GROUP BY
      p.idProjeto,
      p.nomeProjeto,
      u.matricula,
      u.nomeCompletoUsuario,
      aup.horasPlanejadas        
    """)
    fun buscarIndicesJornada(): List<IndicadoresJornadaDTO>

    @Query("""
    SELECT new com.timesync.DTO.IndicadoresJornadaDTO(
      p.idProjeto,
      p.nomeProjeto,
      u.matricula,
      u.nomeCompletoUsuario,
      aup.horasPlanejadas,
      SUM(a.horasTotaisApontamento),
      SUM(CASE WHEN a.motivoApontamento = 'Hora Extra' THEN a.horasTotaisApontamento ELSE 0 END),
      SUM(CASE WHEN a.motivoApontamento = 'Retroativo' THEN a.horasTotaisApontamento ELSE 0 END),
      ROUND((SUM(a.horasTotaisApontamento) / aup.horasPlanejadas) * 100, 2),
      ROUND((SUM(CASE WHEN a.motivoApontamento = 'Hora Extra' THEN a.horasTotaisApontamento ELSE 0 END) / aup.horasPlanejadas) * 100, 2),
      ROUND((SUM(CASE WHEN a.motivoApontamento = 'Retroativo' THEN a.horasTotaisApontamento ELSE 0 END) / NULLIF(SUM(a.horasTotaisApontamento), 0)) * 100, 2)
    )
    FROM AssocUsuarioProjetos aup
      LEFT JOIN Usuarios u ON u.matricula = aup.usuario.matricula
      LEFT JOIN Projetos p ON p.idProjeto = aup.projeto.idProjeto
      LEFT JOIN Apontamentos a ON a.usuario.matricula = u.matricula AND a.projeto.idProjeto = p.idProjeto
    WHERE p.idProjeto = :idProjeto
    GROUP BY
      p.idProjeto,
      p.nomeProjeto,
      u.matricula,
      u.nomeCompletoUsuario,
      aup.horasPlanejadas        
    """)
    fun buscarIndicesJornadaPorProjeto(@Param("idProjeto") idProjeto: String): List<IndicadoresJornadaDTO>

}