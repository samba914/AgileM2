package org.designstrategy;

import org.junit.jupiter.api.Test;
import org.parc_animalier.Animal;
import org.recette.Ingredient;
import org.recette.Recette;

import static org.junit.jupiter.api.Assertions.*;

class StrategieMangerTest {

    @Test
    void mangerStrategieMangerCarnivore() {
        StrategieManger strategieManger = new StrategieMangerCarnivore() ;
        Animal minouche = new Animal(4.2,"chat",strategieManger) ;

        Ingredient ingredient1 = new Ingredient("viande","catégorie de viande",2000) ;
        Ingredient ingredient2 = new Ingredient("fécule de pomme de terre","féculant",900) ;
        Recette recette = new Recette("Croquettes", 0, ingredient1, ingredient2) ;
        minouche.mangerNourriture(recette);
        assertEquals(minouche.getPoids(), 4.78);
    }

    @Test
    void mangerStrategieMangerHerbivore() {
        StrategieManger strategieManger = new StrategieMangerHerbivore() ;
        Animal albert = new Animal(100,"panda",strategieManger) ;

        Ingredient ingredient1 = new Ingredient("fruit","catégorie de fruit",200) ;
        Ingredient ingredient2 = new Ingredient("légume","catégorie de légume",900) ;
        Recette recette = new Recette("salade de fruits", 0, ingredient1, ingredient2) ;
        albert.mangerNourriture(recette);
        assertEquals(albert.getPoids(), 100.22,0.001);
    }

    @Test
    void mangerStrategieMangerOmnivore() {
        StrategieManger strategieManger = new StrategieMangerOmnivore() ;
        Animal pepapig = new Animal(120,"cochon",strategieManger) ;

        Ingredient ingredient1 = new Ingredient("viande","catégorie de viande",2000) ;
        Ingredient ingredient2 = new Ingredient("légume","catégorie de légume",900) ;
        Recette recette = new Recette("Chili con carne", 0, ingredient1, ingredient2) ;
        pepapig.mangerNourriture(recette);
        assertEquals(pepapig.getPoids(), 120.29);
    }
}