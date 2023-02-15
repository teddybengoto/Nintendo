package test;

import model.Console;
import model.Jeu;

import java.time.LocalDate;

import model.Client;

public class Test {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		Console c = new Console("Console");
		Jeu j1 = new Jeu("Jeu1", c);
		Jeu j2 = new Jeu("Jeu1", c);
		Jeu j3 = new Jeu("Jeu1", c);
		Jeu j4 = new Jeu("Jeu1", c);
		Jeu j5 = new Jeu("Jeu1", c);
		
		Achat achat1 = new Achat(j1,LocalDate.now(),50);
		Achat achat2 = new Achat(j2,LocalDate.now(),500);
		Achat achat3 = new Achat(j4,LocalDate.now(),25);
		Achat listAchat1[] = {achat1,achat2};
		Achat listAchat2[] = {achat3,achat2};
		
		Client c1 = new Client("Bengoto","Teddy");
		c1.setAchat(listAchat1);
		Client c2 = new Client("Tata","Toto");
		c2.setAchat(listAchat1);

	}

}
