package histoire;

import personnage.Druide;
import personnage.Gaulois;
import personnage.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois ( "Asterix", 8);
		Gaulois Obelix = new Gaulois ( "Obelix", 20);
		Romain Minus = new Romain("Minus",6);
		Druide Panoramix= new Druide ("Panoramix",5,10);
		Panoramix.booster(Obelix);
		System.out.println(Asterix);
		Asterix.parler("bonjour");
		Minus.parler("oh non");
		Panoramix.booster(Obelix);
		System.out.println(Asterix);
		Asterix.frapper(Minus);
		Asterix.frapper(Minus);
	}

}
