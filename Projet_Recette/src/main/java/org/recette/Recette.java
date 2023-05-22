package org.recette;

import java.util.ArrayList;
import java.util.List;

/**
 * Cette classe recette permet de manipuler un objet recette.
 *
 * @author (Mbengue Kounda & Abla Mikou)
 * @version (14/04/2023)
 */
public class Recette
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nom;
    private int tempsCuisson;
    private List<Ingredient> listeIngredients;

    /**
     * Constructeur d'objets de classe Recette
     */
    public Recette()
    {
        // initialisation des variables d'instance
        nom = "";
        tempsCuisson = 0 ;
        listeIngredients = new ArrayList<>();


    }
    public Recette(String nom, int tempsCuisson)
    {
        // initialisation des variables d'instance
        this.nom = nom;
        this.tempsCuisson = tempsCuisson;
        this.listeIngredients = new ArrayList<>();

    }

    /**
     * Cette methode ajoute une durée au temps de cuisson.
     *
     * @param  y   durée à ajouter.
     * @return     le nouveau temps de cuisson.
     */
    public int updateCuisson(int y)
    {
        // Insérez votre code ici
        return tempsCuisson + y;
    }

    /**
     * Cette methode permet de recuperer le nom de la recette.
     *
     * @return     le nom de la recette;
     */

    public String getNom() {
        return nom;
    }
    /**
     * Cette methode modifier le nom de la recette.
     *
     */

    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
     * Cette methode permet de recuperer le temps de cuisson de la recette.
     *
     * @return     le temps de cuisson de la recette;
     */
    public int getTempsCuisson() {
        return tempsCuisson;
    }
    /**
     * Cette methode modifier le temps de cuisson de la recette.
     *
     */
    public void setTempsCuisson(int tempsCuisson) {
        this.tempsCuisson = tempsCuisson;
    }

    public void ajouterIngredient(Ingredient ingredient) {
        listeIngredients.add(ingredient);
    }

    public int calculerKilocalories() {
        int totalKilocalories = 0;
        for (Ingredient ingredient : listeIngredients) {
            totalKilocalories += ingredient.calculerKilocalories(1); // Utilisation d'une quantité unitaire pour chaque ingrédient
        }
        return totalKilocalories;
    }


    public List<Ingredient> getListeIngredients() {
        return listeIngredients;
    }

    public void setListeIngredients(List<Ingredient> listeIngredients) {
        this.listeIngredients = listeIngredients;
    }
}
