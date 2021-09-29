package com.example.comjpa.service

import com.example.comjpa.models.Pessoas
import com.example.comjpa.repository.PessoasRepo
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class pessoasService(private val repository: PessoasRepo) {
    @Autowired

    fun listaPessoas(): List<Pessoas> = repository.findAll()

    fun criaPessoa(pessoa: Pessoas): Pessoas = repository.save(pessoa)

}