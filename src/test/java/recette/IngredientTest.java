package recette;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.recette.Ingredient;

import static org.junit.jupiter.api.Assertions.*;

class IngredientTest {
    Ingredient ingredient ;
    @BeforeEach
    void setUp() {
        ingredient = new Ingredient("viande","catégorie de viande",1500);
    }

    @Test
    void getNom() {
        assertEquals("viande",ingredient.getNom());
    }

    @Test
    void setNom() {
        ingredient.setNom("poisson");
        assertEquals("poisson",ingredient.getNom());
    }

    @Test
    void getCategorie() {
        assertEquals("catégorie de viande",ingredient.getCategorie());
    }

    @Test
    void setCategorie() {
        ingredient.setCategorie("legume wtf");
        assertEquals("legume wtf",ingredient.getCategorie());
    }
    @Test
    void setKilocalories() {
        ingredient.setKilocalories(2500);
        assertEquals(2500,ingredient.getKilocalories());
    }

    @Test
    void getKilocalories() {
        assertEquals(1500,ingredient.getKilocalories());
    }

    @Test
    void calculerKilocalories() {
        assertEquals(2*ingredient.getKilocalories(),ingredient.calculerKilocalories(2));
    }

}