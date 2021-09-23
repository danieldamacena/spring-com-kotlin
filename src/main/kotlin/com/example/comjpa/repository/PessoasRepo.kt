package com.example.comjpa.repository

import com.example.comjpa.models.Pessoas
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface PessoasRepo: JpaRepository<Pessoas, Int>