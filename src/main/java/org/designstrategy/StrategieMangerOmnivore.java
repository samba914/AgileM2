package org.designstrategy;

import org.parc_animalier.Animal;
import org.recette.Recette;

public class StrategieMangerOmnivore implements StrategieManger {
    @Override
    public void manger(Animal animal, Recette recette) {
        //Pour chaque 1000 kilocalories consommées, l'animal prend 0,1 kg
        animal.setPoids(animal.getPoids() + (recette.calculerKilocalories() * 0.1)/1000);
    }
}