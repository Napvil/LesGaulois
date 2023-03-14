package personnage;

public class Village {
	private String nom;
	private Chef chef;
	private int nbVillageois=0;
	private Gaulois[] villageois;
	public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois=new Gaulois[nbVillageoisMaximum];
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois]=gaulois;
		nbVillageois=nbVillageois+1;
	}
	public Gaulois trouverHabitant(int position) {
		return villageois[position];
	}
	public void afficherVillageois() {
		System.out.println("Dans le village du chef "+ chef.getNom() +" vivent les legendaire gaulois:");
		for(int i=0;i<nbVillageois;i++) {
			System.out.println("-"+trouverHabitant(i).getNom());
		}
	}
	public static void main(String[] args) {
		Village village=new Village("Village des Irreductibles",30);
//		Gaulois gaulois = ville.trouverHabitant(30);
//		ligne au dessus renvoie une erreur parce que le tableau finis avec la position 29
		Chef Abraracourcix= new Chef("Abraracourcix",6,village);
		village.setChef(Abraracourcix);
		Gaulois Asterix = new Gaulois ( "Asterix", 8);
		village.ajouterHabitant(Asterix);
		Gaulois Obelix = new Gaulois ( "Obelix", 25);
		village.ajouterHabitant(Obelix);
		village.afficherVillageois();
//		Gaulois gaulois = village.trouverHabitant(1);
//		System.out.println(gaulois);
//		j'obtiens null car la liste commence a 0 il n y a donc pas encore de villageois dans la place 1
	}
}
