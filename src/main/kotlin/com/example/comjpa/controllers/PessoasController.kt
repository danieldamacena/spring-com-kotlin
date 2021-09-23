package com.example.comjpa.controllers


import com.example.comjpa.repository.PessoasRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class PessoasController(private val repo: PessoasRepo) {
    @GetMapping("/pessoas")
    fun lista() = repo.findAll()
}