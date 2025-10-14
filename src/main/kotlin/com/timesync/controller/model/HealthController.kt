package com.timesync.controller.model

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HealthController {

    @GetMapping("/health")
    fun healthCheck(): Map<String, String> {
        return mapOf("status" to "UP", "service" to "TimeSync API")
    }

    @GetMapping("/")
    fun welcome(): Map<String, String> {
        return mapOf(
            "message" to "Bem-vindo à TimeSync API",
            "version" to "1.0.0",
            "docs" to "Em desenvolvimento"
        )
    }
}