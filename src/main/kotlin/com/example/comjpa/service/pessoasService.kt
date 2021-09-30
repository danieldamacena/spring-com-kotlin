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

    fun getById(pessoaId: Int): Pessoas = repository.findById(pessoaId)
        .orElseThrow { NotFoundException("não há id correspondente") }


    fun criaPessoa(pessoa: Pessoas): Pessoas = repository.save(pessoa)

    fun updateById(pessoaId: Int, pessoa: Pessoas): Pessoas {
        return if (repository.existsById(pessoaId)) {
            repository.save(
                Pessoas(
                    id = pessoa.id,
                    nome = pessoa.nome,
                    email = pessoa.email
                )
            )
        } else throw NotFoundException("não há id correspondente")
    }

    fun deletaPessoa(pessoaId: Int) {
        if (repository.existsById(pessoaId)) {
            repository.deleteById(pessoaId)
        } else {
            throw NotFoundException("Não existe id correspondente no banco de dados")
        }
    }
}