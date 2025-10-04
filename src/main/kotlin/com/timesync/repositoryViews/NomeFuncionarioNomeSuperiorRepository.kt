package com.timesync.repositoryViews

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface NomeFuncionarioNomeSuperiorRepository: JpaRepository<NomeFuncionarioNomeSuperiorRepository, String> {
}