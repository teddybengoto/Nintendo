package test;

import model.Adresse;
import model.Boutique;
import model.Console;
import model.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Console c = new Console("Console");


<<<<<<< HEAD
		Jeu j1 = new Jeu("Jeu1", c);
		Jeu j2 = new Jeu("Jeu2", c);
		Jeu j3 = new Jeu("Jeu3", c);
		Jeu j4 = new Jeu("Jeu4", c);
		Jeu j5 = new Jeu("Jeu5", c);


=======
		Jeu j1 = new Jeu("Jeu1", c,"Fleuriste");
		Jeu j2 = new Jeu("Jeu2", c,"Charpentier");
		Jeu j3 = new Jeu("Jeu3", c,"Boulanger");
		Jeu j4 = new Jeu("Jeu4", c,"Menusier");
		Jeu j5 = new Jeu("Jeu5", c,"Bar");
>>>>>>> main

		Adresse a = new Adresse("8", "rue machin","NYC");
		Boutique micromania = new Boutique("Micromania",a);
		
	}

}
