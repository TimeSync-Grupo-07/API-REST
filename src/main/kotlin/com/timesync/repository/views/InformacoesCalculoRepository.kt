package com.timesync.repository.views

import com.timesync.views.VwInformacoesCalculo
import org.springframework.data.jpa.repository.JpaRepository

interface InformacoesCalculoRepository:JpaRepository <VwInformacoesCalculo, Int> {

    fun findByMatricula(matricula: Int): VwInformacoesCalculo

}