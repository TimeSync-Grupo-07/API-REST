package com.timesync

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TimesyncApplication

fun main(args: Array<String>) {
    runApplication<TimesyncApplication>(*args)
}