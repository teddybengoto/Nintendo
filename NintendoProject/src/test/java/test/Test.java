package test;

import model.Adresse;
import model.Boutique;
import model.Console;
import model.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Console c = new Console("Console");


		Jeu j1 = new Jeu("Jeu1", c);
		Jeu j2 = new Jeu("Jeu1", c);
		Jeu j3 = new Jeu("Jeu1", c);
		Jeu j4 = new Jeu("Jeu1", c);
		Jeu j5 = new Jeu("Jeu1", c);

		Adresse a = new Adresse("8", "rue machin","NYC");
		Boutique micromania = new Boutique("Micromania",a);
		
	}

}
