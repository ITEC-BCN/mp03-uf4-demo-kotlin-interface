package org.example.models

/**
 * Classe Persona abstracte
 * @author ITEC-BCN
 * @since Feb 2024
 */
abstract class Persona  {
    protected var nom: String
    protected var cognoms: String
    private var edat: Int = 0

    /**
     * Constructor específic
     * @param nom
     * @param cognoms
     */
    constructor(nom: String, cognoms: String) {
        this.nom = nom
        this.cognoms = cognoms
    }

    /**
     * Getter per a Edat
     * @return this.edat
     */
    public fun getEdat(): Int{
        return this.edat
    }

    /**
     * Setter per l'atribut privat 'this.edat'
     * Només fa set si edat està comprès entre 0 i 149
     * @param edat
     */
    public fun setEdat(edat: Int){
        if (edat >= 0 && edat < 150) {
            this.edat = edat
        }
    }

    /**
     * Mètode abstracte treballar
     * @return String
     */
    public abstract fun treballar(): String

}