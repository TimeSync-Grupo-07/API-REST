package com.timesync.views

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "nome_funcionario__nome_superior")
data class NomeFuncionarioNomeSuperior(
    @Id
    val nome_funcionario: String,
    val nome_superior: String
)
