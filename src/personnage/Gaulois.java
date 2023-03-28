package personnage;

public class Gaulois {
	private String nom;
	private int force, nb_trophees;
	private Equipement trophees[] = new Equipement[100];
	private int effetPotion = 1;
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
//	private String prendreParole() {
//		return "Le gaulois " + nom + " : ";
//	}
	
	private String prendreParole() {
		String texte = "Le gaulois " + nom + " : ";
		return texte;
	}

	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement trophees[] = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && i < trophees.length; i++,nb_trophees++) {
			this.trophees[nb_trophees] = trophees[i];
		}
		return;
	}
	
//	public void frapper(Romain romain) {
//		System.out.println(nom + " envoie un grand coup dans la mâchoire de "+ romain.getNom());
//		romain.recevoirCoup((force*effetPotion) / 3);
//	}
	
	
	
	
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force+ ", effetPotion=" + effetPotion + "]";
	}
	public void boirePotion(int potion) {
		effetPotion=potion;
		System.out.println("Merci Druide, je sens que ma force est " + potion +  " fois décuplée.");
	}
	public static void main(String[] args) {
		Gaulois Asterix = new Gaulois ( "Asterix", 8);
		Romain Minus = new Romain("Minus",6);
		System.out.println(Asterix);
		Asterix.parler("bonjour");
		Asterix.frapper(Minus);
		Asterix.frapper(Minus);
	}
}
