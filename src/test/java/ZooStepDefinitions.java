import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.parc_animalier.Animal;
import org.parc_animalier.Zoo;

import static org.junit.Assert.*;

public class ZooStepDefinitions {
    private Zoo zoo;
    private Animal animal;
    private int initialAnimalCount;
    private boolean result;

    @Given("un zoo avec un animal de {double} kg")
    public void unZooAvecUnAnimalDeKg(double poids) {
        this.zoo = new Zoo();
        this.animal = new Animal();
        this.animal.setPoids(poids);
        this.zoo.ajouterUnanimal(this.animal);
    }

    @Given("un zoo avec deux animaux de {double} kg")
    public void unZooAvecDeuxAnimauxDeKg(double poids) {
        this.zoo = new Zoo();
        Animal animal1 = new Animal();
        Animal animal2 = new Animal();
        animal1.setPoids(poids);
        animal2.setPoids(poids);
        this.zoo.ajouterUnanimal(animal1);
        this.zoo.ajouterUnanimal(animal2);
    }

    @Given("un zoo avec un animal")
    public void unZooAvecUnAnimal() {
        this.zoo = new Zoo();
        this.animal = new Animal();
        this.zoo.ajouterUnanimal(this.animal);
        this.initialAnimalCount = this.zoo.getAnimaux().size();
    }
    @Given("un zoo plein")
    public void unZooPlein() {
        this.zoo = new Zoo();
        for (int i = 0; i < this.zoo.getCapacite(); i++) {
            this.zoo.ajouterUnanimal(new Animal());
        }
    }

    @When("on nourrit les animaux")
    public void onNourritLesAnimaux() {
        this.zoo.nourrirLesAnimaux();
    }

    @When("on ajoute un nouvel animal au zoo")
    public void onAjouteUnNouvelAnimalAuZoo() {
        Animal newAnimal = new Animal();
        this.zoo.ajouterUnanimal(newAnimal);
    }

    @Then("l'animal devrait peser {double} kg")
    public void lAnimalDevraitPeseKg(double poidsExpected) {
        assertEquals(poidsExpected, this.animal.getPoids(), 0.01);
    }

    @Then("chaque animal devrait peser {double} kg")
    public void chaqueAnimalDevraitPeseKg(double poidsExpected) {
        for (Animal animal : this.zoo.getAnimaux()) {
            assertEquals(poidsExpected, animal.getPoids(), 0.01);
        }
    }

    @Then("le zoo devrait avoir deux animaux")
    public void leZooDevraitAvoirDeuxAnimaux() {
        assertEquals(this.initialAnimalCount + 1, this.zoo.getAnimaux().size());
    }

    @Then("l'ajout devrait échouer")
    public void lAjoutDevraitEchouer() {
        assertFalse(this.result);
    }
}
