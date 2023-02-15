package model;

import java.time.LocalDate;

public class Achat {

    private Jeu jeu;
    private LocalDate date;
    private Double prix;


    public Achat(Jeu jeu, LocalDate date, Double prix) {
        this.jeu = jeu;
        this.date = date;
        this.prix = prix;
    }



    public Jeu getJeu() {
        return this.jeu;
    }

    public void setJeu(Jeu jeu) {
        this.jeu = jeu;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getPrix() {
        return this.prix;
    }

    public void setPrix(Double prix) {
        this.prix = prix;
    }
    

    @Override
    public String toString() {
        return "{" +
            " jeu='" + getJeu() + "'" +
            ", date='" + getDate() + "'" +
            ", prix='" + getPrix() + "'" +
            "}";
    }

}
