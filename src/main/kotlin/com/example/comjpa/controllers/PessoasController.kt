package com.example.comjpa.controllers


import com.example.comjpa.models.Pessoas
import com.example.comjpa.service.PessoasService
import org.springframework.web.bind.annotation.*


@RestController
class PessoasController(private val service: PessoasService) {

    @GetMapping("/pessoas")
    fun listaPessoas(): List<Pessoas> = service.listaPessoas()

    @PostMapping("/post")
    fun criaPessoa(@RequestBody pessoa: Pessoas): Pessoas = service.criaPessoa(pessoa)

    @DeleteMapping("/delete/{pessoaId}")
    fun deletaPessoa(@PathVariable("pessoaId") pessoaId: Int) = service.deletaPessoa(pessoaId)
}