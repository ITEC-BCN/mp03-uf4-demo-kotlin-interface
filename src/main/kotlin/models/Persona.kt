package org.example.models

abstract class Persona  {
    protected var nom: String
    protected var cognoms: String
    private var edat: Int = 0

    constructor(nom: String, cognoms: String) {
        this.nom = nom
        this.cognoms = cognoms
    }

    public fun getEdat(): Int{
        return this.edat
    }

    public fun setEdat(edat: Int){
        if (edat > 0 && edat < 150) {
            this.edat = edat
        }
    }

    public abstract fun treballar(): String

}