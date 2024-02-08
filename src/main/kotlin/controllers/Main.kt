package org.example.controllers

import org.example.interfaces.IAmable
import org.example.models.*

fun main() {
    var botiguer: IAmable = Botiguer("Josep Lluís", "Núñez", "Sanghüs Joan, eh!")
    var botiguer2: Botiguer = Botiguer("Joan", "Laporta", "Palanques Tigrinho")
    var recepcionista: IAmable = Recepcionista("Maria", "Llopis", "Ritz")

    println(botiguer.saluda())
    println(recepcionista.saluda())

    if (!botiguer.equals(botiguer2)) { // Neguem la comparació amb ! al davant
        botiguer2.salutacio = "Què passa nen?"
        println(botiguer.saluda())
    }

    var persona: Persona = botiguer as Persona
    //persona.saluda()    // Error de compilació!!

}
