package org.designstrategy;

import org.parc_animalier.Animal;
import org.recette.Recette;

public class StrategieHerbivoreManger implements StrategieManger {
    @Override
    public void manger(Animal animal, Recette recette) {
        if (recette.verifierIngredientPresent("Viande")) {
            // Si la recette contient de la viande, cela a un impact négatif sur l'herbivore
            animal.setPoids(animal.getPoids() - 0.1);
        } else {
            //chaque 1000 kilocalories mangé l'animal grossit de 0.2 kg
            animal.setPoids(animal.getPoids() + (recette.calculerKilocalories() * 0.2)/1000);
        }
    }
}
