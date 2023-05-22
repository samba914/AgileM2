package recette;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Classe-test recette.RecetteTest.
 *
 * @author  (votre nom)
 * @version (un numéro de version ou une date)
 *
 * Les classes-test sont documentées ici :
 * http://junit.sourceforge.net/javadoc/junit/framework/TestCase.html
 * et sont basées sur le document Š 2002 Robert A. Ballance intitulé
 * "JUnit: Unit Testing Framework".
 *
 * Les objets Test (et TestSuite) sont associés aux classes à tester
 * par la simple relation yyyTest (e.g. qu'un Test de la classe Name.java
 * se nommera NameTest.java); les deux se retrouvent dans le męme paquetage.
 * Les "engagements" (anglais : "fixture") forment un ensemble de conditions
 * qui sont vraies pour chaque méthode Test à exécuter.  Il peut y avoir
 * plus d'une méthode Test dans une classe Test; leur ensemble forme un
 * objet TestSuite.
 * BlueJ découvrira automatiquement (par introspection) les méthodes
 * Test de votre classe Test et générera la TestSuite conséquente.
 * Chaque appel d'une méthode Test sera précédé d'un appel de setUp(),
 * qui réalise les engagements, et suivi d'un appel à tearDown(), qui les
 * détruit.
 */
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.recette.Ingredient;
import org.recette.Recette;

public class RecetteTest
{
    // Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
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
}
