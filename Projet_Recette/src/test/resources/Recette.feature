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

    Scenario: Vérifier la présence d'un ingrédient dans la recette
        Given une recette avec un ingrédient "Tomate"
        When on vérifie la présence de l'ingrédient "Tomate"
        Then l'ingrédient "Tomate" devrait être présent

    Scenario: Vérifier l'absence d'un ingrédient dans la recette
        Given une recette avec un ingrédient "Tomate"
        When on vérifie la présence de l'ingrédient "Champignon"
        Then l'ingrédient "Champignon" ne devrait pas être présent