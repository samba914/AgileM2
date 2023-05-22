package recette;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.designfactory.IngredientFactory;
import org.recette.Ingredient;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CreationIngredientStepDefinitions {
    private IngredientFactory ingredientFactory;
    private Ingredient ingredient;

    @Given("une fabrique d'ingrédients")
    public void initialiserFabrique() {
        ingredientFactory = new IngredientFactory();
    }

    @When("je crée un ingrédient de type {string}")
    public void creerIngredient(String type) {
        ingredient = ingredientFactory.createIngredient(type);
    }

    @Then("l'ingrédient créé doit être de type {string} et avoir {int} kilocalories")
    public void verifierIngredient(String type, int kcal) {
        assertEquals(type, ingredient.getNom());
        assertEquals(kcal, ingredient.getKilocalories());
    }
}
