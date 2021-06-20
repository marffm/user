package com.marffm.user.infrastructure.controllers

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class UserController {

    @GetMapping
    fun findUser(): ResponseEntity<String> {
        return ResponseEntity.ok("Hello World")
    }
}