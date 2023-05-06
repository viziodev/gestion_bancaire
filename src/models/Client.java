package models;

import java.util.ArrayList;

public class Client {
    /*
     * Attributs => Caracteristiques
     *   Syxtaxe
     *    [public|private|protected] type nomAttribut;
     *  Un attribut doit etre encapsule => cache  ou a la visibilite private
     */
    private int id;
    private String nomComplet;
    private String telephone;
;
    /*
     * Methodes => 
     *  fonctions => type de retour est !void 
     *  procedures => type de retour est void 
     *  Syntaxe
     *     [public|private|protected] typeRetour nomMethode(){
     *     
     *      [return resultat]
     *    }
     * D'apres l'encapsulation les methodes d'une classe sont a publiques
     * Categories de Methodes
     *   ==> Constructeur => Creer un Objet ou Instancier un Objet
        *       Definition 
        *        1- Porte le meme nom que la classe
        *        2-Pas de type de Retour
          ==> Getters ou Accesseurs  => 
               recuperer ou obtenir la valeur d'un attribut encapsuler
               Definition 
                  =>Un getter est une fonction dont le type de retour
                      est le meme que celui de l'attribut retourne
                  => Son nom   getNomAttribut()

          ==> Setters ou Mutateurs
             modifier ou initialiser la valeur d'un attribut encapsuler
             Definition 
               ==> Un setter est une procedure donc le type de retour est void
               ==> il recoit un parametre dont le type de retour
                      est le meme que celui de l'attribut modifie 
               => son nom :  setNomAttribut(TypeAttribut attribut)
          ==> Metiers
            ==> offre un autre service autre que la construction , les getters ou setters
     */

   //OneToMany
   private ArrayList<Compte> comptes=new ArrayList<>();
     public ArrayList<Compte> getComptes() {
      return comptes;
   }
     public void addCompte(Compte compte){
        comptes.add(compte);
     }

     public Client(){

     }

     public int getId(){
        return id;
     }
     public String getNomComplet(){
        return nomComplet;
     }
     public String getTelephone(){
        return telephone;
     }
     public void setId(int id){
        this.id=id;
     }
     public void setNomComplet(String nomComplet){
        this.nomComplet=nomComplet;
     }
     public void setTelephone(String telephone){
        this.telephone=telephone;
     }

     //Methodes Metiers
     public String  affiche(){
        return  "Id : "+id
                +"\n Nom et Prenom : "+ nomComplet
                +"\n Telephone : "+ telephone;
     }
    
      public boolean estEgal(Client client){
         return this.id==client.getId();
      } 

    
}
