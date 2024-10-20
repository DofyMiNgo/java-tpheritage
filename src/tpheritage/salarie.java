package tpheritage;

public class salarie {
	protected int matricule;
	protected String nom;
	protected double recrutement;
	
	public salarie(int mat, String nm, double recru) {
		this.matricule=mat;
		this.nom=nm;
		this.recrutement=recru;
	}
	public void affich() {
		System.out.println(" matricule: "+this.matricule+" nom : "+this.nom+ " recrutement:  "+ this.recrutement);
	}
	public int getMatricule() {
		return matricule;
	}
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getRecrutement() {
		return recrutement;
	}
	public void setRecrutement(double recrutement) {
		this.recrutement = recrutement;
	}
	
	public double salaire() {
		double s;
		if(this.recrutement>2005) {
			s=280;
		}
		else {
			s=400;
		}
		return s;
	}
	
	
	
	

}
