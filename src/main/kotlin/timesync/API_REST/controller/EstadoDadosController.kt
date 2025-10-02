package timesync.API_REST.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import timesync.API_REST.model.EstadoDados
import timesync.API_REST.repository.estadoDadosRepository

@RestController
@RequestMapping("/estadoDados")
class EstadoDadosController(
    private val repository: estadoDadosRepository
) {

    @GetMapping
    fun listarTodos(): List<EstadoDados> = repository.findAll()

}