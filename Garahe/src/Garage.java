import java.util.*;
public class Garage {
	int indice=0;
	int user=0;	
	int scelta;
	int post;
	Scanner sc= new Scanner(System.in);
	String [] verifica = new String[15];
	Veicolo [] veicoli=new Veicolo[15];
	public void fillarray() {
		for (int j=0;j<veicoli.length;j++) {
			veicoli[j]=new Veicolo(null, 0 , 0);
		}
	}
	public void ver() {
		for (int p=0;p<verifica.length;p++) {
			verifica[p]="libero";
		}
	}
	public void aggiungiVeicolo() {
		System.out.println("a quale posto vuoi inserire il veicolo?");
		post=sc.nextInt();
		if (verifica[post]=="libero") {
		System.out.println("scegli");
		scelta=sc.nextInt();
		
		if(scelta==1) {
			System.out.println("inserisci auto");
			veicoli[post]= new auto();
			verifica[post]="auto";
			indice++;
			
		}
		if(scelta==2) {
			System.out.println("inserisci moto");
			veicoli[post]= new moto();
			verifica[post]="moto";
			indice++;
			
		}
		if(scelta==3) {
			System.out.println("inserisci furgone");
			veicoli[post]= new furgoni();
			verifica[post]="furgone";
			indice++;
			
		}
		} else {
			System.out.println("quel posto è occupato");
		}
		
	}
	public void elenco() {
			for (int a=0;a<veicoli.length;a++) {
			System.out.println(a+")" +veicoli[a].toString());
		
	}

	
}
	public void postioccupati() {
		for (int k=0;k<verifica.length;k++) {
			System.out.print( k+")"+verifica[k]+" ");
		
	}
		System.out.println();
	}
	public void rimuoviElemento(){
		System.out.println("Quale elemento vuoi togliere");
		user=sc.nextInt();
		veicoli[user]=new Veicolo(null, 0, 0);
		verifica[user]="libero";
		/*for (int z=user;z<indice;z++) {
			veicoli[z]=veicoli[z+1];
		}
		veicoli[15-1]=new Veicolo(null, 0, 0);
		indice=indice-1;
		verifica[user]="libero";
	}*/
}
}