package org.designfactory;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.recette.Ingredient;

import static org.junit.jupiter.api.Assertions.*;

class IngredientFactoryTest {

    private IngredientFactory factory;

    @BeforeEach
    public void setUp() {
        factory = new IngredientFactory();
    }

    @Test
    public void testCreateFruit() {
        Ingredient fruit = factory.createIngredient("fruit");
        assertEquals("fruit", fruit.getNom());
        assertEquals("catégorie de fruit", fruit.getCategorie());
        assertEquals(50, fruit.getKilocalories());
    }

    @Test
    public void testCreateViande() {
        Ingredient viande = factory.createIngredient("viande");
        assertEquals("viande", viande.getNom());
        assertEquals("catégorie de viande", viande.getCategorie());
        assertEquals(500, viande.getKilocalories());
    }

    @Test
    public void testCreateLegume() {
        Ingredient legume = factory.createIngredient("légume");
        assertEquals("légume", legume.getNom());
        assertEquals("catégorie de légume", legume.getCategorie());
        assertEquals(100, legume.getKilocalories());
    }

    @Test
    public void testCreateProduitLaitier() {
        Ingredient produitLaitier = factory.createIngredient("produit laitier");
        assertEquals("produit laitier", produitLaitier.getNom());
        assertEquals("catégorie de produit laitier", produitLaitier.getCategorie());
        assertEquals(200, produitLaitier.getKilocalories());
    }

    @Test
    public void testCreateCereale() {
        Ingredient cereale = factory.createIngredient("céréale");
        assertEquals("céréale", cereale.getNom());
        assertEquals("catégorie de céréale", cereale.getCategorie());
        assertEquals(150, cereale.getKilocalories());
    }

    @Test
    public void testCreatePoisson() {
        Ingredient poisson = factory.createIngredient("poisson");
        assertEquals("poisson", poisson.getNom());
        assertEquals("catégorie de poisson", poisson.getCategorie());
        assertEquals(300, poisson.getKilocalories());
    }

    @Test
    public void testCreateFruitsDeMer() {
        Ingredient fruitsDeMer = factory.createIngredient("fruits de mer");
        assertEquals("fruits de mer", fruitsDeMer.getNom());
        assertEquals("catégorie de fruits de mer", fruitsDeMer.getCategorie());
        assertEquals(250, fruitsDeMer.getKilocalories());
    }

    @Test
    public void testCreateNoix() {
        Ingredient noix = factory.createIngredient("noix");
        assertEquals("noix", noix.getNom());
        assertEquals("catégorie de noix", noix.getCategorie());
        assertEquals(120, noix.getKilocalories());
    }

    @Test
    public void testCreateAutre() {
        Ingredient autre = factory.createIngredient("autre");
        assertEquals("autre", autre.getNom());
        assertEquals("Autre", autre.getCategorie());
        assertEquals(120, autre.getKilocalories());
    }
}