Feature: Manger de la nourriture

  En tant qu'animal du zoo,
  Je veux manger différentes recettes,
  Afin de maintenir mon poids en fonction de mon régime alimentaire.

  Background:
    Given un zoo avec différents types d'animaux

  Scenario: Un herbivore mange une recette contenant de la viande
    Given un animal de type "herbivore"
    When l'animal mange une recette contenant de la viande
    Then son poids diminue de 0.1 kg

  Scenario: Un herbivore mange une recette sans viande
    Given un animal de type "herbivore"
    When l'animal mange une recette sans viande
    Then son poids augmente de 0.2 kg pour chaque 1000 kilocalories consommées

  Scenario: Un carnivore mange une recette sans viande
    Given un animal de type "carnivore"
    When l'animal mange une recette sans viande
    Then son poids augmente de 0.1 kg pour chaque 1000 kilocalories consommées

  Scenario: Un carnivore mange une recette contenant de la viande
    Given un animal de type "carnivore"
    When l'animal mange une recette contenant de la viande
    Then son poids augmente de 0.2 kg pour chaque 1000 kilocalories consommées

  Scenario: Un omnivore mange une recette
    Given un animal de type "omnivore"
    When l'animal mange une recette
    Then son poids augmente de 0.1 kg pour chaque 1000 kilocalories consommées
