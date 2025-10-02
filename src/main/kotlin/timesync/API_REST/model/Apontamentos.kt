package timesync.API_REST.model

import jakarta.persistence.*
import java.util.Date
import java.util.UUID

@Entity
@Table(name = "apontamentos")
class Apontamentos {

    @Id @GeneratedValue(strategy = GenerationType.UUID)
    val idApontamento: UUID? = null


    val dataApontamento: Date

    val ocorrenciaApontamento

    val justificativa

    val idProjeto

    val horaInicio

    val horaFim

    val horasTotais

    val motivo

    val usuariosMatricula

    val idEstadoDado


}