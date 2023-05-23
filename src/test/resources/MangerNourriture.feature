Feature: Manger de la nourriture

  En tant qu'animal du zoo,
  Je veux manger différentes recettes,
  Afin de maintenir mon poids en fonction de mon régime alimentaire.

  Background:
    Given un zoo avec différents types d'animaux

  Scenario: Manger une recette en fonction du type d'animal
    Given un animal de type "herbivore"
    When l'animal mange une recette "contenant de la viande"
    Then son poids diminue de 0.1 kg

  Scenario Outline: Manger une recette en fonction du type d'animal
    Given un animal de type "<TypeAnimal>"
    When l'animal mange une recette "<Recette>"
    Then son poids <EffetPoids> kg pour chaque 1000 kilocalories consommées

    Examples:
      | TypeAnimal | Recette                | EffetPoids      |
      | herbivore  | sans viande            | augmente de 0.2 |
      | carnivore  | sans viande            | augmente de 0.1 |
      | carnivore  | contenant de la viande | augmente de 0.2 |
      | omnivore   |                        | augmente de 0.1 |
