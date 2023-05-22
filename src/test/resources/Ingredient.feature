Feature: Gestion des ingrédients
  En tant que cuisinier
  Je veux pouvoir créer des ingrédients
  Afin de pouvoir les utiliser dans mes recettes

  Scenario: Création d'un nouvel ingrédient
    Given un nouvel ingrédient "Tomate" de catégorie "Légume" et ayant 18 kilocalories
    When j'affiche cet ingrédient
    Then je devrais voir "Ingrédient : Tomate", "Catégorie : Légume" et "kilocalories : 18"
