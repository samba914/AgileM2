Feature: Création d'ingrédients

  En tant que gestionnaire du zoo,
  Je veux créer différents types d'ingrédients,
  Afin de préparer des recettes pour les animaux.

  Scenario: Créer un ingrédient de type "fruit"
    Given une fabrique d'ingrédients
    When je crée un ingrédient de type "fruit"
    Then l'ingrédient créé doit être de type "fruit" et avoir 50 kilocalories

  Scenario: Créer un ingrédient de type "viande"
    Given une fabrique d'ingrédients
    When je crée un ingrédient de type "viande"
    Then l'ingrédient créé doit être de type "viande" et avoir 500 kilocalories

  Scenario: Créer un ingrédient de type "légume"
    Given une fabrique d'ingrédients
    When je crée un ingrédient de type "légume"
    Then l'ingrédient créé doit être de type "légume" et avoir 100 kilocalories

  Scenario: Créer un ingrédient de type "produit laitier"
    Given une fabrique d'ingrédients
    When je crée un ingrédient de type "produit laitier"
    Then l'ingrédient créé doit être de type "produit laitier" et avoir 200 kilocalories

  Scenario: Créer un ingrédient de type "céréale"
    Given une fabrique d'ingrédients
    When je crée un ingrédient de type "céréale"
    Then l'ingrédient créé doit être de type "céréale" et avoir 150 kilocalories

  Scenario: Créer un ingrédient de type "poisson"
    Given une fabrique d'ingrédients
    When je crée un ingrédient de type "poisson"
    Then l'ingrédient créé doit être de type "poisson" et avoir 300 kilocalories

  Scenario: Créer un ingrédient de type "fruits de mer"
    Given une fabrique d'ingrédients
    When je crée un ingrédient de type "fruits de mer"
    Then l'ingrédient créé doit être de type "fruits de mer" et avoir 250 kilocalories

  Scenario: Créer un ingrédient de type "noix"
    Given une fabrique d'ingrédients
    When je crée un ingrédient de type "noix"
    Then l'ingrédient créé doit être de type "noix" et avoir 120 kilocalories

  Scenario: Créer un ingrédient de type inconnu
    Given une fabrique d'ingrédients
    When je crée un ingrédient de type "inconnu"
    Then l'ingrédient créé doit être de type "inconnu" et avoir 120 kilocalories
