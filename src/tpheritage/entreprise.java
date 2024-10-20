package tpheritage;


public class entreprise {
	 public static salarie[]tab ;

	public static void main(String[] args) {
		tab=new salarie[5];
		tab[0]=new employe(12345,"walid",2002,15,4);
		tab[1]=new vendeur(23445,"yessine",2007,1000,0.1);
		tab[2]=new vendeur(65478,"nassime",2000	,700,0.1);
		tab[3]=new employe(87698,"aymen",2003,19,5);
		tab[4]=new employe(1234,"khaled",2008,7,4);
		
		for (int i = 0; i <= 4; i++) {
			if (tab[i]instanceof employe) {
				tab[i].affich();
				
			}}
		
		System.out.println("----------------------------------------------------------------------------------------------------");
		for (int i = 0; i <= 4; i++) {
				if (tab[i]instanceof vendeur) {
					tab[i].affich();
					
				}
			
			
		}
		
		int x=0;
		
		double min=tab[0].recrutement;
		
		for (int i = 0; i < 4; i++) {
			if (tab[i].recrutement<min) {
				min=tab[i].recrutement;
				x=i;
				
				
			}
			
			
			
		}
		System.out.println("----------------------------------------------------------------------------------------------------");
		
		System.out.println(tab[x].nom+" recruté en "+tab[x].recrutement);

		System.out.println("----------------------------------------------------------------------------------------------------");

		
		int y =0;
		
		double max=tab[0].salaire();
		for (int i = 0; i <tab.length; i++) {
			if ((tab[i]instanceof vendeur)&&(tab[i].salaire()>max)) {
				max=tab[i].salaire();
				y=i;
				
				
			}
			}
		System.out.println(tab[y].matricule+" de salaire : "+max);
	
		
		
		
		
		 
		
		

	}

}
