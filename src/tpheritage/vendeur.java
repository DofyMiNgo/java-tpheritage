package tpheritage;

public class vendeur extends salarie {
	private double vente;
	private double percentage;
	public vendeur(int mat, String nm, double recru, double vente, double percentage) {
		super(mat, nm, recru);
		this.vente = vente;
		this.percentage = percentage;
	}
	public double getVente() {
		return vente;
	}
	public void setVente(double vente) {
		this.vente = vente;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public void affich() {
		super.affich();
		System.out.println(" vente:"+this.vente+" percentage:"+this.percentage);
		
	}
	public double salaire() {
		double s ;
		s=super.salaire()+(this.vente*this.percentage)/100;
		return s;
		
	}
	
	
	

}
