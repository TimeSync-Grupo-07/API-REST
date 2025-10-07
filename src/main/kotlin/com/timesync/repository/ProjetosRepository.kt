package com.timesync.repository

import com.timesync.model.Projetos
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ProjetosRepository: JpaRepository<Projetos, String> {
}