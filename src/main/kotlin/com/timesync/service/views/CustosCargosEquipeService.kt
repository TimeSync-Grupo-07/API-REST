package com.timesync.service.views

import com.timesync.repository.views.CustosCargosEquipeRepository
import com.timesync.repository.views.HorasApontadasRepository
import com.timesync.views.Vw.VwCustosCargosEquipe
import com.timesync.views.Vw.VwHorasApontadas
import org.springframework.stereotype.Service

@Service
class CustosCargosEquipeService(
    private val custosCargosEquipeRepository: CustosCargosEquipeRepository
) {

    fun listarTodos(): List<VwCustosCargosEquipe> = custosCargosEquipeRepository.findByCustoHoraTrabalhoIsNotNull()

}