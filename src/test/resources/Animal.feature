Feature: Animal
  En tant que gardien du zoo,
  Je veux suivre le poids des animaux après qu'ils aient mangé,
  Afin de garantir leur santé et leur bien-être.

  Scenario: Poids initial de l'animal
    Given un nouvel animal
    Then son poids devrait être 0 kg

  Scenario: Nourrir un animal
    Given un nouvel animal
    When l'animal mange un tacos
    Then son poids devrait être 1 kg
