package org.example.models
import org.example.interfaces.IAmable

class Recepcionista: Persona, IAmable {
    private var hotel: String
    override public var salutacio: String = "Hola"
        get() = "Benvingut a l'hotel $hotel"

    constructor(nom: String, cognoms: String, hotel:String) : super(nom, cognoms) {
        this.hotel = hotel
    }

    override public fun saluda(): String {
        return "Holiii! " + this.salutacio
    }

    override fun treballar(): String {
        return "Treballo a l'oficina gestionant l'agenda de l'encarregada i atenent a les seves trucades"
    }

    override fun toString(): String {
        return "Recepcionista(hotel='$hotel', salutacio='$salutacio')" + super.toString()
    }
}