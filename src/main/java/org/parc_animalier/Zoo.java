package org.parc_animalier;


import java.util.ArrayList;
import java.util.List;

public class Zoo
{
    private List<Animal> animaux;
    private int capacite;
    public Zoo()
    {
        this.animaux = new ArrayList<>();
        this.capacite = 5;
    }

    public List<Animal> getAnimaux() {
        return this.animaux;
    }

    public boolean ajouterUnanimal(Animal animal){
        if(verifierCapacite()){
            this.animaux.add(animal);
            return true;
        }
        return false;
    }

    private boolean verifierCapacite() {
        return this.animaux.size() < this.capacite;
    }

    public int getCapacite() {
        return this.capacite;
    }
    public void setCapacite(int capacite){
        this.capacite = capacite;
    }

    public void nourrirLesAnimaux(){
        for(Animal a : this.animaux){
            a.mangerNourriture();
        }
    }

    public boolean estCeQueLaRaceEstDansLeZoo(String race) {
        for (Animal animal : this.animaux) {
            if (animal.getRace().equals(race)) {
                return true;
            }
        }
        return false;
    }
}

