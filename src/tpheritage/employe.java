package tpheritage;

public class employe extends salarie {
	private double hsupp;
	private double phsupp;
	public employe(int mat, String nm, double recru, double hsupp, double phsupp) {
		super(mat, nm, recru);
		this.hsupp = hsupp;
		this.phsupp = phsupp;
	}
	public void affich() {
		super.affich();
		System.out.println("      "+" hsupp: "+this.hsupp+ " phsupp:  "+this.phsupp);
		}
	
	public double salaire() {
		double s ;
		s=super.salaire()+(this.hsupp * this.phsupp);
		return s;
		
				
		
	}
	public double getHsupp() {
		return hsupp;
	}
	public void setHsupp(double hsupp) {
		this.hsupp = hsupp;
	}
	public double getPhsupp() {
		return phsupp;
	}
	public void setPhsupp(double phsupp) {
		this.phsupp = phsupp;
	}
	
	
	

}
