Feature: Zoo

  Scenario: Nourrir un seul animal
    Given un zoo avec un animal de 5 kg
    When on nourrit les animaux
    Then l'animal devrait peser 6 kg

  Scenario: Nourrir plusieurs animaux
    Given un zoo avec deux animaux de 5 kg
    When on nourrit les animaux
    Then chaque animal devrait peser 6 kg

  Scenario: Ajouter un animal au zoo
    Given un zoo avec un animal
    When on ajoute un nouvel animal au zoo
    Then le zoo devrait avoir deux animaux

  Scenario: Ajouter un animal à un zoo plein
    Given un zoo plein
    When on ajoute un nouvel animal au zoo
    Then l'ajout devrait échouer
