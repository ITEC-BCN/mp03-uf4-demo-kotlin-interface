package org.example.models
import org.example.interfaces.IAmable

class Botiguer: Persona, IAmable {
    private val botiga: String
    override public var salutacio: String = "Bon dia! Què li poso?"
        get() = field       // field és una paraula reservada que fa referència a la propietat (atribut)
                            // Si féssim servir this.salutacio, entraríem en un bucle infinit per recursivitat
        set(value) { field = value }

    constructor (nom: String, cognoms: String, botiga: String) : super(nom, cognoms) {
        this.botiga = botiga
    }

    override public fun saluda(): String {
        return this.salutacio
    }

    override fun treballar(): String {
        return "Treballo darrera del taulell subministrant els productes al client"
    }

    override fun toString(): String {
        return "Botiguer(botiga='$botiga', salutacio='$salutacio')"
    }

    public fun getBotiga(): String{
        return this.botiga
    }

    override fun equals(obj: Any?): Boolean {
        var isEqual: Boolean = false

        if (obj is Botiguer) {
            var botiguerComparat: Botiguer = obj as Botiguer

            if (this.botiga.equals(botiguerComparat.getBotiga())) {
                isEqual = true
            }
        }
        return isEqual
    }
}