Feature: Animal

  Scenario: Poids initial de l'animal
    Given un nouvel animal
    Then son poids devrait être 0 kg

  Scenario: Nourrir un animal
    Given un nouvel animal
    When l'animal mange un tacos
    Then son poids devrait être 1 kg
