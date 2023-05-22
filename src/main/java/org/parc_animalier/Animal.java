package org.parc_animalier;

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

    public Animal()
    {
        this.poids = 0;
        this.race = "";
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

    public void mangerNourriture(){
        this.poids += 1;
    }

    public void mangerNourriture(Recette recette){
        int calories = recette.calculerKilocalories();
        //chaque 1000 kilocalories mangé l'animal grossit de 0.1 kg
        this.poids += (calories*0.1)/1000;
    }


}