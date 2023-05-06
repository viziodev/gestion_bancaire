import java.util.ArrayList;
import java.util.Scanner;

import models.Client;
import models.Compte;
import services.ClientService;
import services.CompteService;

public class App {
    public static void main(String[] args) throws Exception {
        int choix;     
        Scanner scanner=new Scanner(System.in);
        //Creer les Dependances
        ClientService serviceClient=new ClientService();
        CompteService compteService=new CompteService();

        do {
            System.out.println("1-Creer Client");
            System.out.println("2-Lister Client");
            System.out.println("3-Rechercher Client par telephone");
            System.out.println("4-Creer un Compte");  
            System.out.println("5-Lister tous les Comptes"); 
            System.out.println("6-Lister  les Comptes un Client");
            System.out.println("7-Faire une Transaction"); 
            System.out.println("8-Lister toutes les Transactions");  
            System.out.println("9-Lister les Transactions d'un Client"); 
            System.out.println("10-Lister les Transactions Par type"); 
            System.out.println("11-Quitter"); 

            System.out.println("Faites votre choix"); 
            choix=scanner.nextInt();
            switch (choix) {
                   case 1:
                   //Saisie
                       System.out.println("Entrer Id du Client");
                       int id=scanner.nextInt();
                         scanner.nextLine();
                       System.out.println("Entrer le Complet");
                       String nomComplet=scanner.nextLine();
                       System.out.println("Entrer le Telephone");
                       String tel=scanner.nextLine();
                  //Formater 
                     Client client =new Client();
                     
                     //Hydrater   => Donnez un Etat
                        client.setId(id);
                        client.setNomComplet(nomComplet);
                        client.setTelephone(tel);
                    //Appeler le Service
                     serviceClient.creerClient(client);

                    break;
                    case 2:
                        Client[] clients=    serviceClient.listerClient();
                        int nbreClient=serviceClient.getNbreClient();
                        for (int index = 0; index < nbreClient; index++) {
                              System.out.println(clients[index].affiche());
                        }
                    break;
                    case 3:
                      scanner.nextLine();
                     System.out.println("Entrer le Telephone");
                       tel=scanner.nextLine();
                       client= serviceClient.rechercherUnClientParTel(tel);
                       if(client==null){
                        System.out.println("Ce client n'existe pas");
                       }else{
                         System.out.println(client.affiche());
                       }
                    break;
                    case 4:
                      scanner.nextLine();
                      System.out.println("Entrer le Telephone");
                      tel=scanner.nextLine();
                      client= serviceClient.rechercherUnClientParTel(tel);
                      if(client==null){
                       System.out.println("Ce client n'existe pas");
                      }else{
                         //Client existe 
                         //Saisit des informations du compte
                          Compte compte=new Compte();
                          System.out.println("Entrer l'Id du Compte");
                          compte.setId(scanner.nextInt());
                          scanner.nextLine();
                          System.out.println("Entrer le Numero du Compte");
                          compte.setNumCompte(scanner.nextLine());
                          System.out.println("Entrer le Solde");
                          compte.setSolde(scanner.nextDouble());
                          //Creer la relation entre Compte et Client
                             //Compte ==>Client
                              compte.setClient(client);
                             //Client ==> Compte
                             client.addCompte(compte);
                            compteService.creerCompte(compte);
                      }
                    break;
                    case 5 : 
                    ArrayList<Compte> comptes=  compteService.listerCompte();
                    for (Compte cp : comptes) {
                           System.out.println(cp.affiche());
                    }
                     break;
                     case 6: 
                     scanner.nextLine();
                     System.out.println("Entrer le Telephone");
                       tel=scanner.nextLine();
                       client= serviceClient.rechercherUnClientParTel(tel);
                       if(client==null){
                        System.out.println("Ce client n'existe pas");
                       }else{
                          comptes=client.getComptes();
                          for (Compte cp : comptes) {
                            System.out.println(cp.affiche());
                         }
                       }
                     break;
                default:
                     System.out.println("Choix est Invalide");
                    break;
            }

        } while (choix!=11);

        scanner.close();
       
    }
}
