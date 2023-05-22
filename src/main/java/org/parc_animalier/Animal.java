package org.parc_animalier;

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


}