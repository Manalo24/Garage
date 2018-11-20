import java.util.*;

public class main {

	public static void main(String[] args) {
		Garage garageobj=new Garage();
		Scanner input=new Scanner(System.in);
		garageobj.fillarray();
		garageobj.ver();
		int pick;
		int finale=0;
		while(finale==0) {
		System.out.println("0)Exit");
		System.out.println("1)Aggiungi Veicolo");
		System.out.println("2)Elenco");
		System.out.println("3)Posti");
		System.out.println("4)Togliere");
		pick=input.nextInt();
		switch(pick) {
		case 0: finale=1;
				break;
		case 1: 
		
			garageobj.aggiungiVeicolo();
				break;
		case 2: 
			
			garageobj.elenco();;
				break;
		case 3: 
			
			garageobj.postioccupati();
				break;
		case 4: 
			
			garageobj.rimuoviElemento();
				break;
		
		}
		
		}
		
		
		/* TODO Auto-generated method stub
		auto v2= new auto("fer", 0, 0, 0, null);
		moto m2= new moto(null, 0, 0, 0);
		furgoni f2 = new furgoni(null, 0, 0, 0);
		Garage garage = new Garage();
		garage.ver();
		garage.aggiungiVeicolo(v2);
		garage.aggiungiVeicolo(m2);
		garage.aggiungiVeicolo(f2);
		garage.elenco();	
		garage.postioccupati();
		garage.rimuoviElemento();
		garage.elenco();
		garage.postioccupati();*/
		
		
	}

}
