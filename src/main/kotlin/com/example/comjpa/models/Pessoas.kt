package com.example.comjpa.models

import javax.persistence.*

@Entity
@Table(name = "pessoas")
data class Pessoas(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id") val id: Int?,
    @Column(name = "nome") val nome: String,
    @Column(name = "email") val email: String
)