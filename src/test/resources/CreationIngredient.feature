Feature: Création d'ingrédients

  En tant que gestionnaire du zoo,
  Je veux créer différents types d'ingrédients,
  Afin de préparer des recettes pour les animaux.

  Scenario Outline: Créer un ingrédient de type "<TypeIngredient>"
    Given une fabrique d'ingrédients
    When je crée un ingrédient de type "<TypeIngredient>"
    Then l'ingrédient créé doit être de type "<TypeIngredient>" et avoir <Kilocalories> kilocalories

    Examples:
      | TypeIngredient   | Kilocalories |
      | fruit            | 50           |
      | viande           | 500          |
      | légume           | 100          |
      | produit laitier  | 200          |
      | céréale          | 150          |
      | poisson          | 300          |
      | fruits de mer    | 250          |
      | noix             | 120          |
      | inconnu          | 120          |
