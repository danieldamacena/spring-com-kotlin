package com.example.comjpa.models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Pessoas(
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    val id: Int,
    val nome: String,
    val email: String
)