package timesync.API_REST.model

import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "estado_dados")
class EstadoDados {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    val idEstadoDado: UUID? = null

    @Column(length = 60)
    val nomeEstadoDado: String = ""
}