package com.timesync.repository.model

import com.timesync.DTO.ProjetosInfoDTO
import com.timesync.model.Projetos
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository

@Repository
interface ProjetosRepository: JpaRepository<Projetos, String> {

    @Query(
        """
            SELECT new com.timesync.DTO.ProjetosInfoDTO(
	            p.idProjeto,
                SUM(e.valorHora)*SUM(a.horasPlanejadas),
                SUM(a.horasPlanejadas),
                p.dataEntregaProjeto,
                p.dataInicioProjeto
            )
            FROM Projetos p 
            JOIN AssocUsuarioProjetos a
                ON p.idProjeto = a.projeto.idProjeto
		    JOIN AssocCargoEquipe e
                ON e.usuario.matricula = a.usuario.matricula
		    GROUP BY p.idProjeto
        """
    )
    fun listarProjetosInfo(): List<ProjetosInfoDTO>

}