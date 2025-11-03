package com.timesync.DTO

import com.timesync.model.EstadoDados

data class CriacaoUsuarioDTO (

    val matricula: Int,
    val nomeCompletoUsuario: String,
    val emailUsuario: String,
    val idMicrosoftUsuario: String,
    val SuperiorId: Int?

)