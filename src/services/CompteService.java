package services;

import java.util.ArrayList;

import models.Client;
import models.Compte;

public class CompteService {
    
/*
 *  Inconvenients Tableau
 *     -Taille Reservation ==>
 *       Compte[] comptes =new Compte[10];
 *  Collections : ensemble capable de stocker plusieurs Objets
 *    Collection ne stocke que des Objets
 *    Impossible Collection de int ,double
 * Types Collections 
 *    ==> List 
 *        |23|56|35|40
 *         0   1  2  3  =>entier
 *      1-ArrayList  => Parcours Premier ==> Dernier => Unidirectionnel
 *           Syntaxe : 
 *         1. Declarer
 *            Type ==> Classe
 *            ArrayList<Type> nomList;
 *            Exemple : 
 *               ArrayList<String> chaines;
 *               ArrayList<Client> clients;
 *            //Impossible 
 *              ArrayList<int> entiers;//Erreur car int n'est pas une classe
 *         2. Instanciation
 *           ArrayList<Type> nomList;
 *           nomList=new ArrayList<Type>();
 *          Exemple : 
 *          ArrayList<String> chaines;
 *         chaines=new  ArrayList<String>();  ou chaines=new  ArrayList<>();
 *           ArrayList<Client> clients;
 *           clients=new ArrayList<> ();
 * 
 *         3.Manipuler
 *             chaines. ==> interface de liste(methodes publiques)
 *               add(): Ajouter un element dans la liste
 *               size(): Nbre  element dans la liste
 *               get(pos): Recuperer l'element a cette position
 *               remouve()): Supprimer un element de la liste
 *      2-LinkedList 
 *        => Parcours 
 *           Premier ==> Dernier 
 *           Dernier ==> Prenier
 *    ==> Map
 *        |Et1|Et2|Et3
 *         
 *         
 *  
 *  
 */

     private ArrayList<Compte> comptes =new ArrayList<Compte>();
     
     public void creerCompte(Compte compte){
          comptes.add(compte);
     }
     public ArrayList<Compte> listerCompte(){
          return comptes;
     }

}
