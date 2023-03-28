package personnage;

public class Romain {
	private String nom;
	private int force;
	private Equipement equipements[]= new Equipement [2]; 
	private int nbEquipement=0;
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force>0;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
	}
	
	public void sEquiper(Equipement equipement) {
		switch(nbEquipement){
		case 0 :
			System.out.println("Le soldat "+ nom + " s’équipe avec un "+ equipement +".");
			equipements[0]=equipement;
			nbEquipement+=1;
			break;
		case 1 :
			if (equipements[0]==equipement) {
				System.out.println("Le soldat "+ nom + " possède déjà un "+ equipement +"!");				
			}
			else {
				System.out.println("Le soldat "+ nom + " s’équipe avec un "+ equipement +".");
				equipements[1]=equipement;
				nbEquipement+=1;
			}
			break;
		case 2:
			System.out.println("Le soldat " + nom + " est déjà bien protégé !");
			break;			
		}
	}
	
	public static void main(String[] args) {
		Romain Minus = new Romain("Minus",6);
		Minus.sEquiper(Equipement.CASQUE);
		Minus.sEquiper(Equipement.CASQUE);
		Minus.sEquiper(Equipement.BOUCLIER);
		Minus.sEquiper(Equipement.CASQUE);
	}
}
	