package org.example.models
import org.example.interfaces.IAmable

/**
 * Classe Recepcionista
 * Hereta de Persona
 * Implementa IAmable
 */
class Recepcionista: Persona, IAmable {
    private var hotel: String
    override public var salutacio: String = "Hola"
        get() = "Benvingut a l'hotel $hotel"

    /**
     * Constructor específic de Recepcionista
     * @param nom
     * @param cognoms
     * @param hotel
     */
    constructor(nom: String, cognoms: String, hotel:String) : super(nom, cognoms) {
        this.hotel = hotel
    }

    /**
     * Override de saluda
     * @return String
     */
    override public fun saluda(): String {
        return "Holiii! " + this.salutacio
    }

    /**
     * Overide de treballar
     * @return String
     */
    override fun treballar(): String {
        return "Treballo a l'oficina gestionant l'agenda de l'encarregada i atenent a les seves trucades"
    }

    /**
     * Override de toString
     * @return String
     */
    override fun toString(): String {
        return "Recepcionista(hotel='$hotel', salutacio='$salutacio')" + super.toString()
    }
}