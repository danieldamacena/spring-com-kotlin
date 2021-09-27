package com.example.comjpa.controllers


import com.example.comjpa.models.Pessoas
import com.example.comjpa.repository.PessoasRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class PessoasController(private val repo: PessoasRepo) {
    @Autowired
    @GetMapping("/pessoas")
    fun lista(): List<Pessoas> = repo.findAll()

    fun cria(pessoa: Pessoas): Pessoas = repo.save(pessoa)

}