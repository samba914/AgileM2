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
    }

    @Test
    void getCategorie() {
    }

    @Test
    void setCategorie() {
    }

    @Test
    void setKilocalories() {
    }

    @Test
    void afficher() {
    }

    @Test
    void getKilocalories() {
    }

    @Test
    void testToString() {
    }

    @Test
    void calculerKilocalories() {
    }

    @Test
    void testEquals() {
    }
}