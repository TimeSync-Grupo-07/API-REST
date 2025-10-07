package com.timesync.repository

import com.timesync.model.Usuarios
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.query.Jpa21Utils
import org.springframework.stereotype.Repository

@Repository
interface UsuariosRepository : JpaRepository<Usuarios, Int> {
}