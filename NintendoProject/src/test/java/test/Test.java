package test;

import model.Console;
import model.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Console c = new Console("Console");


		Jeu j1 = new Jeu("Jeu1", c,"Fleuriste");
		Jeu j2 = new Jeu("Jeu2", c,"Charpentier");
		Jeu j3 = new Jeu("Jeu3", c,"Boulanger");
		Jeu j4 = new Jeu("Jeu4", c,"Menusier");
		Jeu j5 = new Jeu("Jeu5", c,"Bar");



	}

}
