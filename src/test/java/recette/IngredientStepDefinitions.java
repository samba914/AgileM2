package recette;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.recette.Ingredient;

public class IngredientStepDefinitions {
    private Ingredient ingredient;
    private String printedMessage;

    @Given("un nouvel ingrédient {string} de catégorie {string} et ayant {int} kilocalories")
    public void unNouvelIngredientDeCategorieEtAyantKilocalories(String nom, String categorie, int kilocalories) {
        ingredient = new Ingredient(nom, categorie, kilocalories);
    }

    @When("j'affiche cet ingrédient")
    public void jAfficheCetIngredient() {
        printedMessage = ingredient.toString();
        System.out.println(printedMessage);
    }

    @Then("je devrais voir {string}, {string} et {string}")
    public void jeDevraisVoirEt(String ing, String cat, String kcal) {;
        Assert.assertTrue(printedMessage.contains(cat));
        Assert.assertTrue(printedMessage.contains(kcal));
        Assert.assertTrue(printedMessage.contains(ing));
    }
}
