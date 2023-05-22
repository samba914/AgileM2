package org.designstrategy;

import org.parc_animalier.Animal;
import org.recette.Recette;

public interface StrategieManger {
    void manger(Animal animal, Recette recette);
}