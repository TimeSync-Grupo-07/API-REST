package com.timesync.repository.model

import com.timesync.model.Usuarios
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UsuariosRepository : JpaRepository<Usuarios, Int> {
}