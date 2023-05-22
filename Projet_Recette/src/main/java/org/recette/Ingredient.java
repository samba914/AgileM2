package org.recette;


public class Ingredient
{
    // variables d'instance - remplacez l'exemple qui suit par le vôtre
    private String nom;
    private String categorie;
    private int kilocalories;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public void setKilocalories(int kilocalories) {
        this.kilocalories = kilocalories;
    }

    /**
     * Constructeur d'objets de classe Ingredient
     */
    public Ingredient()
    {
        // initialisation des variables d'instance
        nom = "";
        categorie = "" ;
        kilocalories = 0;
    }

    public Ingredient(String nom, String categorie, int kilocalories)
    {
        // initialisation des variables d'instance
        this.nom = nom;
        this.categorie = categorie ;
        this.kilocalories = kilocalories ;
    }

    public void afficher() {
        System.out.println("Ingrédient : " + nom);
        System.out.println("Catégorie : " + categorie);
        System.out.println("kilocalories : " + kilocalories);
    }
    public int getKilocalories() {
        return kilocalories;
    }

    public String toString() {
        return "Ingrédient : " + nom + ", Catégorie : " + categorie + ", kilocalories : " + kilocalories;
    }


    public int calculerKilocalories(int quantite) {
        return quantite * kilocalories;
    }

}
