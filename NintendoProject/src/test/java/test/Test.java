package test;

import model.Achat;
import model.Adresse;
import model.Boutique;
import model.Console;
import model.Jeu;
import model.Portable;

import java.time.LocalDate;

import model.Client;

public class Test {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Portable p = new Portable ("Console",12,LocalDate.now());


		Jeu j1 = new Jeu("Jeu1", c,"Fleuriste");
		Jeu j2 = new Jeu("Jeu2", c,"Charpentier");
		Jeu j3 = new Jeu("Jeu3", c,"Boulanger");
		Jeu j4 = new Jeu("Jeu4", c,"Menusier");
		Jeu j5 = new Jeu("Jeu5", c,"Bar");
		Achat achat1 = new Achat(j1,LocalDate.now(),50);
		Achat achat2 = new Achat(j2,LocalDate.now(),500);
		Achat achat3 = new Achat(j4,LocalDate.now(),25);
		Achat listAchat1[] = {achat1,achat2};
		Achat listAchat2[] = {achat3,achat2};
		Client c1 = new Client("Bengoto","Teddy");
		c1.setAchat(listAchat1);
		Client c2 = new Client("Tata","Toto");
		c2.setAchat(listAchat1);

		Adresse a = new Adresse("8", "rue machin","NYC");
		Boutique micromania = new Boutique("Micromania",a);
		
	}

}
