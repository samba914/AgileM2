package parc_animalier;

import org.designstrategy.StrategieHerbivoreManger;
import org.designstrategy.StrategieManger;
import org.designstrategy.StrategieMangerCarnivore;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.parc_animalier.Animal;
import org.recette.Ingredient;
import org.recette.Recette;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    Animal minouche ;

    @BeforeEach
    void setUp() {
        StrategieManger strategieManger = new StrategieMangerCarnivore() ;
        minouche = new Animal(4.2,"chat",strategieManger) ;
    }

    @Test
    void getPoids() {
        assertEquals(4.2,minouche.getPoids());
    }

    @Test
    void getRace() {
        assertEquals("chat",minouche.getRace());
    }

    @Test
    void setPoids() {
        minouche.setPoids(5.4);
        assertEquals(5.4,minouche.getPoids());
    }

    @Test
    void setRace() {
        minouche.setRace("maine coon");
        assertEquals("maine coon",minouche.getRace());
    }

    @Test
    void getStrategieManger() {
        assertEquals(minouche.getStrategieManger().getClass(),StrategieMangerCarnivore.class);
    }

    @Test
    void setStrategieManger() {
        minouche.setStrategieManger(new StrategieHerbivoreManger());
        assertEquals(minouche.getStrategieManger().getClass(),StrategieHerbivoreManger.class);

    }

    @Test
    void mangerNourriture() {
        Ingredient ingredient1 = new Ingredient("viande","Catégorie de viande",2000) ;
        Ingredient ingredient2 = new Ingredient("fécule de pomme de terre","féculant",900) ;
        Recette recette = new Recette("Croquettes", 0, ingredient1, ingredient2) ;
        minouche.mangerNourriture(recette);
        assertEquals(minouche.getPoids(), 4.78);
    }

    @Test
    void testMangerNourriture() {
        minouche.mangerNourriture();
        assertEquals(minouche.getPoids(),5.2);
    }
}