package recette;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.recette.Ingredient;
import org.recette.Recette;

import static org.junit.Assert.assertEquals;

public class RecetteStepDefinitions {
    private Recette recette;
    private Ingredient ingredient;

    @Given("une nouvelle recette {string}")
    public void uneNouvelleRecette(String nomRecette) {
        this.recette = new Recette(nomRecette, 0);
    }

    @Then("le nom de la recette devrait être {string}")
    public void leNomDeLaRecetteDevraitEtre(String expectedNom) {
        assertEquals(expectedNom, this.recette.getNom());
    }

    @When("on ajoute un nouvel ingrédient à la recette")
    public void onAjouteUnNouvelIngredientALaRecette() {
        ingredient = new Ingredient("Poulet", "Viande", 200);
        this.recette.ajouterIngredient(ingredient);
    }

    @Then("la recette devrait contenir {int} ingrédient")
    public void laRecetteDevraitContenirIngredient(int expectedNumber) {
        assertEquals(expectedNumber, this.recette.getListeIngredients().size());
    }

    @Given("une nouvelle recette {string} avec un ingrédient de {int} kilocalories")
    public void nouvelleRecetteAvecPoulet(String nomRecette, int kilocalories) {
        this.recette = new Recette(nomRecette, 0);
        Ingredient ingredient = new Ingredient("Poulet", "Viande", kilocalories);
        this.recette.ajouterIngredient(ingredient);
    }

    @When("on calcule les kilocalories de la recette")
    public void onCalculeLesKilocaloriesDeLaRecette() {
        this.recette.calculerKilocalories();
    }

    @Then("la recette devrait avoir {int} kilocalories")
    public void laRecetteDevraitAvoirKilocalories(int expectedKilocalories) {
        assertEquals(expectedKilocalories, this.recette.calculerKilocalories());
    }

    private boolean ingredientPresent;

    @Given("une recette avec un ingrédient {string}")
    public void uneRecetteAvecUnIngredient(String nomIngredient) {
        this.recette = new Recette("Pizza", 30);
        Ingredient ingredient = new Ingredient(nomIngredient, "Autre", 50);
        this.recette.ajouterIngredient(ingredient);
    }

    @When("on vérifie la présence de l'ingrédient {string}")
    public void onVerifieLaPresenceDeLIngredient(String nomIngredient) {
        this.ingredientPresent = this.recette.verifierIngredientPresent(nomIngredient);
    }

    @Then("l'ingrédient {string} devrait être présent")
    public void lIngredientDevraitEtrePresent(String nomIngredient) {
        Assert.assertTrue(this.ingredientPresent);
    }

    @Then("l'ingrédient {string} ne devrait pas être présent")
    public void lIngredientNeDevraitPasEtrePresent(String nomIngredient) {
        Assert.assertFalse(this.ingredientPresent);
    }
}