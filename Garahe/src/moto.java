import java.util.*;
public class moto extends Veicolo {
	int temp;
	private Scanner sc = new Scanner(System.in);
	
	public moto() {
		super();
		System.out.println("inserisci tempo del motore");
		temp=sc.nextInt();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "moto [temp=" + temp + ", marca=" + marca + ", anno=" + anno + ", cilindrata=" + cilindrata + "]";
	}
	
}
