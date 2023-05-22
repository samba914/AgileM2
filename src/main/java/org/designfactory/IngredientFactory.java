package org.designfactory;

import org.recette.Ingredient;

public class IngredientFactory {
    public Ingredient createIngredient(String type) {
        if (type.equalsIgnoreCase("fruit")) {
            return new Ingredient("fruit", "catégorie de fruit", 50);
        } else if (type.equalsIgnoreCase("viande")) {
            return new Ingredient("viande", "catégorie de viande", 500);
        } else if (type.equalsIgnoreCase("légume")) {
            return new Ingredient("légume", "catégorie de légume", 100);
        } else if (type.equalsIgnoreCase("produit laitier")) {
            return new Ingredient("produit laitier", "catégorie de produit laitier", 200);
        } else if (type.equalsIgnoreCase("céréale")) {
            return new Ingredient("céréale", "catégorie de céréale", 150);
        } else if (type.equalsIgnoreCase("poisson")) {
            return new Ingredient("poisson", "catégorie de poisson", 300);
        } else if (type.equalsIgnoreCase("fruits de mer")) {
            return new Ingredient("fruits de mer", "catégorie de fruits de mer", 250);
        } else if (type.equalsIgnoreCase("noix")) {
            return new Ingredient("noix", "catégorie de noix", 120);
        }
        // Ici on ajoutera plus de types si nécessaire
        return new Ingredient(type, "Autre", 120);
    }
}
