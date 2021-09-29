package com.example.comjpa.service

import com.example.comjpa.models.Pessoas
import com.example.comjpa.repository.PessoasRepo
import javassist.NotFoundException
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class PessoasService(private val repository: PessoasRepo) {
    @Autowired

    fun listaPessoas(): List<Pessoas> = repository.findAll()

    fun criaPessoa(pessoa: Pessoas): Pessoas = repository.save(pessoa)

    fun deletaPessoa(pessoaId: Int) {
        if (repository.existsById(pessoaId)) {
            repository.deleteById(pessoaId)
        } else {
            throw NotFoundException("Não existe id correspondente no banco de dados")
        }
    }
}