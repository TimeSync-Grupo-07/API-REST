package timesync.API_REST.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import timesync.API_REST.model.EstadoDados
import java.util.UUID

@Repository
interface estadoDadosRepository : JpaRepository<EstadoDados, UUID> {
    fun findByNomeEstadoDado(nomeEstadoDado: String): EstadoDados?

}