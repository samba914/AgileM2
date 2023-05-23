package parc_animalier;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.parc_animalier.Animal;
import org.parc_animalier.Zoo;

import static org.junit.Assert.*;

public class ZooTests {
    private Zoo zoo;
    private Animal simba;
    private Animal dumbo;

    @Before
    public void setUp() throws Exception {
        zoo = new Zoo();
        simba = new Animal(190.4,"Lion");
        dumbo = new Animal(2975.8,"Elephant");
    }

    @Test
    public void testAjouterUnAnimal() {
        assertTrue(zoo.ajouterUnanimal(simba));
        assertTrue(zoo.getAnimaux().contains(simba));
        assertEquals(1, zoo.getAnimaux().size());
    }

    @Test
    public void testAjouterUnAnimalAuZooPlein() {
        zoo.setCapacite(1);
        assertTrue(zoo.ajouterUnanimal(simba));
        assertFalse(zoo.ajouterUnanimal(dumbo));
        assertTrue(zoo.getAnimaux().contains(simba));
        assertFalse(zoo.getAnimaux().contains(dumbo));
    }

    @Test
    public void testEstCeQueLaRaceEstDansLeZoo() {
        zoo.ajouterUnanimal(simba);
        assertTrue(zoo.estCeQueLaRaceEstDansLeZoo(simba.getRace()));
        assertFalse(zoo.estCeQueLaRaceEstDansLeZoo(dumbo.getRace()));
    }

    @Test
    public void testNourrirLesAnimaux() {
        zoo.ajouterUnanimal(simba);
        zoo.nourrirLesAnimaux();
        assertEquals(simba.getPoids(),191.4,0.01);
    }

    @Test
    public void testGetCapacite(){
        assertEquals(5,zoo.getCapacite());
    }

}
