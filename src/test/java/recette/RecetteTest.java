package recette;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.recette.Ingredient;
import org.recette.Recette;

import java.util.ArrayList;
import java.util.List;

public class RecetteTest
{

    private Recette recette;

    /**
     * Constructeur de la classe-test recette.RecetteTest
     */
    public RecetteTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @BeforeEach
    public void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        this.recette = new Recette("Gâteau au chocolat",15);
        // Instanciation des objets et liaison
        Ingredient ingredient1 = new Ingredient("Farine", "Céréales", 100);
        Ingredient ingredient2 = new Ingredient("Sucre", "Édulcorants", 50);
        Ingredient ingredient3 = new Ingredient("Œufs", "Produits laitiers", 70);

        recette.ajouterIngredient(ingredient1);
        recette.ajouterIngredient(ingredient2);
        recette.ajouterIngredient(ingredient3);
    }

    @Test
    public void testUpdateCuisson() {
        int tempsCuissonAvant = recette.getTempsCuisson();
        int tempsCuissonApres = recette.updateCuisson(5);
        Assertions.assertEquals(tempsCuissonAvant + 5, tempsCuissonApres);

    }

    @Test
    public void testCalculerKilocalories() {
        // Calcul des kilocalories de la recette
        int kilocaloriesTotales = recette.calculerKilocalories();

        // Assertion pour vérifier le résultat attendu
        assertEquals(220, kilocaloriesTotales);
    }

    @Test
    public void testGetNom(){
        assertEquals("Gâteau au chocolat",recette.getNom());
    }

    @Test
    public void testSetNom(){
        recette.setNom("Gâteau au citron");
        assertEquals("Gâteau au citron",recette.getNom());
    }

    @Test
    public void testSetTempsCuisson(){
        recette.setTempsCuisson(25);
        assertEquals(25,recette.getTempsCuisson());
    }

    @Test
    public void testVerifierIngredientPresent(){
        assertTrue(recette.verifierIngredientPresent("Farine")) ;
        assertFalse(recette.verifierIngredientPresent("Citron")) ;

    }

    @Test
    public void testGetListeIngredients(){
        Ingredient ingredient1 = new Ingredient("Farine", "Céréales", 100);
        Ingredient ingredient2 = new Ingredient("Sucre", "Édulcorants", 50);
        Ingredient ingredient3 = new Ingredient("Œufs", "Produits laitiers", 70);

        List<Ingredient> ingredientList = new ArrayList<Ingredient>();
        ingredientList.add(ingredient1);
        ingredientList.add(ingredient2);
        ingredientList.add(ingredient3);

        assertEquals(ingredientList,recette.getListeIngredients());

    }

    @Test
    public void testSetListeIngredients(){
        Ingredient ingredient1 = new Ingredient("Farine", "Céréales", 100);
        Ingredient ingredient2 = new Ingredient("Sucre", "Édulcorants", 50);

        List<Ingredient> ingredientList = new ArrayList<Ingredient>();
        ingredientList.add(ingredient1);
        ingredientList.add(ingredient2);
        recette.setListeIngredients(ingredientList);
        assertEquals(ingredientList,recette.getListeIngredients());
    }

}
