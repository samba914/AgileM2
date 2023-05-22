Feature: Recette

    Scenario: Création d'une recette simple
        Given une nouvelle recette "Tacos"
        Then le nom de la recette devrait être "Tacos"

    Scenario: Ajout d'un ingrédient à la recette
        Given une nouvelle recette "Tacos"
        When on ajoute un nouvel ingrédient à la recette
        Then la recette devrait contenir 1 ingrédient

    Scenario: Calcul des kilocalories de la recette
        Given une nouvelle recette "Tacos" avec un ingrédient de 200 kilocalories
        When on calcule les kilocalories de la recette
        Then la recette devrait avoir 200 kilocalories