package com.example.conference10.controller

import com.example.conference10.model.Assistant
import com.example.conference10.service.AssistantService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/Assistant")   //endpoint
class AssistantController {
    @Autowired
    lateinit var assistantService: AssistantService

    @GetMapping
    fun list ():List <Assistant>{
        return assistantService.list()

    }
    @PostMapping
    fun save (@RequestBody assistant: Assistant): ResponseEntity<Assistant> {
        return ResponseEntity(assistantService.save(assistant), HttpStatus.OK)
    }
    @GetMapping("/{id}")
    fun listById (@PathVariable("id") id: Long): ResponseEntity<*> {
        return ResponseEntity(assistantService.listById (id), HttpStatus.OK)
    }
}