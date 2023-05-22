import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.parc_animalier.Animal;
import static org.junit.Assert.*;

public class AnimalStepDefinitions {
    private Animal animal;

    @Given("un nouvel animal")
    public void unNouvelAnimal() {
        this.animal = new Animal();
    }

    @When("l'animal mange un tacos")
    public void lAnimalMangeUnTaco() {
        this.animal.mangerNourriture();
    }

    @Then("son poids devrait être {double} kg")
    public void sonPoidsDevraitEtreKg(double poidsExpected) {
        assertEquals(poidsExpected, this.animal.getPoids(), 0.01);
    }
}
