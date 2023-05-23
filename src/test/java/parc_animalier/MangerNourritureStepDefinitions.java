package parc_animalier;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.designfactory.IngredientFactory;
import org.designstrategy.StrategieHerbivoreManger;
import org.designstrategy.StrategieMangerCarnivore;
import org.designstrategy.StrategieMangerOmnivore;
import org.parc_animalier.Animal;
import org.parc_animalier.Zoo;
import org.recette.Ingredient;
import org.recette.Recette;

import static org.junit.Assert.*;

public class MangerNourritureStepDefinitions {
    private Zoo zoo;
    private Animal animal;
    private Recette recette;
    private double poidsInitial;

    private IngredientFactory ingredientFactory;

    @Given("un zoo avec différents types d'animaux")
    public void creerZoo() {
        zoo = new Zoo();
    }

    @Given("un animal de type {string}")
    public void creerAnimal(String type) {
        switch(type) {
            case "herbivore":
                animal = new Animal();
                animal.setRace("Mouton");
                animal.setPoids(70);
                animal.setStrategieManger(new StrategieHerbivoreManger());
                break;
            case "carnivore":
                animal = new Animal();
                animal.setRace("Lion");
                animal.setPoids(300);
                animal.setStrategieManger(new StrategieMangerCarnivore());
                break;
            case "omnivore":
                animal = new Animal();
                animal.setRace("Singe");
                animal.setPoids(80);
                animal.setStrategieManger(new StrategieMangerOmnivore());
                break;
        }
    }

    @When("l'animal mange une recette {string}")
    public void donnerRecette(String typeRecette) {
        recette = new Recette();
        ingredientFactory = new IngredientFactory();

        if (typeRecette.equals("contenant de la viande")) {
            recette.ajouterIngredient(ingredientFactory.createIngredient("viande"));
        } else if (typeRecette.equals("sans viande")) {
            recette.ajouterIngredient(ingredientFactory.createIngredient("légumes"));
        } else {
            recette.ajouterIngredient(ingredientFactory.createIngredient("viande"));
            recette.ajouterIngredient(ingredientFactory.createIngredient("légumes"));
        }

        poidsInitial = animal.getPoids();
        animal.mangerNourriture(recette);
    }

    @Then("son poids diminue de {double} kg")
    public void verifierPoidsDiminue(double poids) {
        assertEquals(poidsInitial - poids, animal.getPoids(), 0.1);
    }

    @Then("son poids augmente de {double} kg pour chaque {int} kilocalories consommées")
    public void verifierPoidsAugmente(double poids, int kcal) {
        assertEquals(poidsInitial + (recette.calculerKilocalories() * poids / kcal), animal.getPoids(), 0.1);
    }
}
