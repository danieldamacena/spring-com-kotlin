package com.example.comjpa.controllers


import com.example.comjpa.models.Pessoas
import com.example.comjpa.service.pessoasService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class PessoasController(
    private val service: pessoasService
) {

    @GetMapping("/pessoas")
    fun listaPessoas(): List<Pessoas> = service.listaPessoas()

    @PostMapping("/post")
    fun criaPessoa(@RequestBody pessoa: Pessoas): Pessoas = service.criaPessoa(pessoa)

/*
    @DeleteMapping("/delete/{pessoaId}")
    fun deletaPessoa(@PathVariable("pessoaId") pessoaId: Int) {
        if (repo.existsById(pessoaId)) {
            repo.deleteById(pessoaId)
        }
    } */
}