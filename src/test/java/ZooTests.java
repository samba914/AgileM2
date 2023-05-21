import org.junit.Test;
import org.parc_animalier.Animal;
import org.parc_animalier.Zoo;

import static org.junit.Assert.*;

public class ZooTests {

    @Test
    public void testEstCeQueLaRaceEstDansLeZoo_RacePresente() {
        Zoo zoo = new Zoo();
        Animal lion = new Animal();
        lion.setRace("Lion");
        zoo.ajouterUnanimal(lion);
        assertTrue(zoo.estCeQueLaRaceEstDansLeZoo("Lion"));
    }

    @Test
    public void testEstCeQueLaRaceEstDansLeZoo_RaceNonPresente() {
        Zoo zoo = new Zoo();
        Animal lion = new Animal();
        lion.setRace("Lion");
        zoo.ajouterUnanimal(lion);
        assertFalse(zoo.estCeQueLaRaceEstDansLeZoo("Lion"));
    }
}
