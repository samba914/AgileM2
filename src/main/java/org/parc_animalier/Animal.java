package org.parc_animalier;

import org.designstrategy.StrategieManger;
import org.recette.Recette;

/**
 * Cette classe recette permet de manipuler un objet recette.
 *
 * @author (Alassaf Mohamed & Diouf Samba)
 * @version (22 / 05 / 2023)
 */
public class Animal
{
    private double poids;
    private String race;
    private StrategieManger strategieManger;

    public Animal()
    {
        this(0.0,"") ;
    }
    public Animal(double poids, String  race){
        this(poids, race, null);
    }
    public Animal(double poids, String  race, StrategieManger strategieManger){
        this.poids = poids ;
        this.race = race ;
        this.strategieManger = strategieManger;
    }

    public double getPoids(){
        return this.poids;
    }
    public String getRace(){
        return this.race;
    }
    public void setPoids(double poids){
        this.poids = poids;
    }
    public void setRace(String race){
        this.race = race;
    }
    public StrategieManger getStrategieManger() {
        return this.strategieManger;
    }
    public void setStrategieManger(StrategieManger strategieManger) {
        this.strategieManger = strategieManger;
    }

    public void mangerNourriture(){
        this.poids += 1;
    }

    public void mangerNourriture(Recette recette) {
        this.strategieManger.manger(this, recette);
    }


}