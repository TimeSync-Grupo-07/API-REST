package com.timesync.controller.model

import com.timesync.DTO.UserLogin
import com.timesync.model.Usuarios
import com.timesync.service.model.UsuariosService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/Usuarios")
class UsuarioController(
    private val usuariosService: UsuariosService
) {

    @GetMapping
    fun listarTodos(): List<Usuarios> = usuariosService.listarTodos()

    @PostMapping("/login")
    fun login(@RequestBody request: UserLogin): Usuarios{

        var login = usuariosService.login(request.emailUsuario, request.senhaUsuario)

        return login

    }

}