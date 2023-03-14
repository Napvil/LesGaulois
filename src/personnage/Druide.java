package personnage;
import java.util.Random;

public class Druide {
	private String nom;
	private int forcePotion=1;
	private int effetPotionMin=5;
	private int effetPotionMax=10;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à "+ effetPotionMax + ".");
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	public int preparerPotion() {
		Random pot = new Random();		
		int nombre=pot.nextInt(effetPotionMax-1)+effetPotionMin;
		if (nombre>7) {
			System.out.println("J'ai préparé une super potion de force");
			return nombre;
		}
		System.out.println("Je n'ai pas trouvé tous les ingrédients, ma potion est seulement de force " + nombre);
		return nombre;
	}
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom()=="Obelix") {
			System.out.println("Non, Obélix !... Tu n’auras pas de potion magique !");
		}
		else {
			int jsp=preparerPotion();
			gaulois.boirePotion(jsp);
		}
		
	}
	public static void main(String[] args) {
		Druide Panoramix= new Druide ("Panoramix",5,10);
		Panoramix.preparerPotion();
	}
}
