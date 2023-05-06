package services;

import models.Client;

public class ClientService {

    /*
     * Type Tableau=> Classe 
     * 1.Declaration
     *   type[] nomTableau=new type[Taille]
     */
      
       private final int N=10;//Taille Reservation
       private Client[] tabClient=new Client[N];
       private int nbreClient=0;//Taille Reelle

       public int getNbreClient() {
        return nbreClient;
      }

      //Creer Client => Ajouter  un Client dans le Tableau
       public void creerClient(Client client){
        tabClient[nbreClient]=client;
         nbreClient++;
       }

       //Lister Client => Afficher les clients du Tableau
      public Client[] listerClient(){
         return tabClient;
      }

    public ClientService(){

    }
      //Fitrer Client Par Telephone => Rechercher un client dans le tableau 
                                      //  partir du Telephone
      public Client rechercherUnClientParTel(String tel){
        for (int index = 0; index < nbreClient; index++) {
             if(tabClient[index].getTelephone().equals(tel)){
                 return tabClient[index];
             }
        }
          return null;
      }
    
}
