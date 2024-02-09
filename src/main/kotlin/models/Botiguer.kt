package org.example.models
import org.example.interfaces.IAmable

/**
 * Classe Botiguer.
 * Hereta de Persona
 * Implementa IAmable
 */
class Botiguer: Persona, IAmable {
    private val botiga: String
    override public var salutacio: String = "Bon dia! Què li poso?"
        get() = field       // field és una paraula reservada que fa referència a la propietat (atribut)
                            // Si féssim servir this.salutacio, entraríem en un bucle infinit per recursivitat
        set(value) { field = value }

    /**
     * Constructor específic de Botiguer
     * @param nom
     * @param cognoms
     * @param botiga
     */
    constructor (nom: String, cognoms: String, botiga: String) : super(nom, cognoms) {
        this.botiga = botiga
    }

    /**
     * Override de saluda
     * @return this.salutacio
     */
    override public fun saluda(): String {
        return this.salutacio
    }

    /**
     * Overide de treballar
     * @return String
     */
    override fun treballar(): String {
        return "Treballo darrera del taulell subministrant els productes al client"
    }

    /**
     * Override de toString
     * @return String
     */
    override fun toString(): String {
        return "Botiguer(botiga='$botiga', salutacio='$salutacio')"
    }

    /**
     * Mètode getBotiga per accedir al valor de l'atribut privat
     * @return this.botiga
     */
    public fun getBotiga(): String{
        return this.botiga
    }

    /**
     * Override del mètode equals per tal de definir com comparar dos objectes de la classe complexe Botiguer
     * @return Boolean
     */
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