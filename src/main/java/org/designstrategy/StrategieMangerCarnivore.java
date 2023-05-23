package org.designstrategy;

import org.parc_animalier.Animal;
import org.recette.Recette;

public class StrategieMangerCarnivore implements StrategieManger {
    @Override
    public void manger(Animal animal, Recette recette) {
        if (!recette.verifierIngredientPresent("viande")) {
            // Si la recette ne contient pas de viande, le carnivore  il mange moins bien et son poid augmente peu
            animal.setPoids(animal.getPoids() + (recette.calculerKilocalories() * 0.1)/1000);
        } else {
            //Pour chaque 1000 kilocalories consommées, l'animal prend 0,1 kg
            animal.setPoids(animal.getPoids() + (recette.calculerKilocalories() * 0.2)/1000);
        }
    }
}
