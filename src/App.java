import java.util.Scanner;

import models.Client;

public class App {
    public static void main(String[] args) throws Exception {
        int choix;
        
        Scanner scanner=new Scanner(System.in);
       //Saisir 2 Clients et les affiches
         //1-Declarer 2 objets de de Classe Client
          Client cl1,cl2;
          //Pour cl1
          //2-Instanciation
          cl1=new Client();
          //3-Hydrater Objet ou lui donner un etat => donner des valeurs 
           //aux caracteristiques de l'objet
           cl1.setId(1);
           cl1.setNomComplet("Birane Baila Wane");
           cl1.setTelephone("772151010");
          /* System.out.println("Id: "+cl1.getId());
           System.out.println("Nom et Prenom : "+cl1.getNomComplet());
           System.out.println("Telephone: "+cl1.getTelephone());*/ 
          System.out.println(cl1.affiche()); 
           cl2=new Client();
            int id;
            System.out.println("Entrer un id");
            //id=scanner.nextInt();
            //cl2.setId(id);
            cl2.setId(scanner.nextInt());
            System.out.println("Entrer un Nom et un Prenom");
            cl2.setNomComplet(scanner.nextLine());
            System.out.println("Entrer un Telephone");
            cl2.setTelephone(scanner.nextLine());

            /*System.out.println("Id: "+cl2.getId());
            System.out.println("Nom et Prenom : "+cl2.getNomComplet());
            System.out.println("Telephone: "+cl2.getTelephone());*/
            System.out.println(cl2.affiche());
           cl1.estEgal(cl2);
            

       /*  do {
            System.out.println("1-Creer Client");
            System.out.println("2-Lister Client");
            System.out.println("3-Rechercher Client par telephone"); 
            System.out.println("4-Quitter"); 
            System.out.println("Faites votre choix"); 
            choix=scanner.nextInt();
            switch (choix) {
                   case 1:
                    
                    break;
                    case 2:
                    
                    break;
                    case 3:
                    
                    break;
                    case 4:
                    
                    break;
                default:
                     System.out.println("Choix est Invalide");
                    break;
            }

        } while (choix!=4);
*/
        scanner.close();
       
    }
}
