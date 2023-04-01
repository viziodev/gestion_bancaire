package models;

public class Compte {
    private int id;
    private String numCompte;
    private double solde;
    public Compte() {
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNumCompte() {
        return numCompte;
    }
    public void setNumCompte(String numCompte) {
        this.numCompte = numCompte;
    }
    public double getSolde() {
        return solde;
    }
    public void setSolde(double solde) {
        this.solde = solde;
    }

    public String  affiche(){
        return  "Id : "+id
                +"\n Numero : "+ numCompte
                +"\n Solde : "+ solde;
     }
}
