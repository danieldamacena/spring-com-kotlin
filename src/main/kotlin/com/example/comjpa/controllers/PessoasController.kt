package com.example.comjpa.controllers


import com.example.comjpa.models.Pessoas
import com.example.comjpa.repository.PessoasRepo
import javassist.NotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*


@RestController
class PessoasController(private val repo: PessoasRepo) {
    @Autowired
    @GetMapping("/pessoas")
    fun lista(): List<Pessoas> = repo.findAll()

    @PostMapping("/post")
    fun cria(@RequestBody pessoa: Pessoas): Pessoas = repo.save(pessoa)

    @DeleteMapping("/delete/{pessoaId}")
    fun deletaPessoa(@PathVariable("pessoaId") pessoaId: Int) {
        if (repo.existsById(pessoaId)){
            repo.deleteById(pessoaId)
        }
    }
}