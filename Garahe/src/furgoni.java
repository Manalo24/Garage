import java.util.*;
public class furgoni extends Veicolo {
	int carico;
	private Scanner sc = new Scanner(System.in);
	

	public furgoni() {
		super();
		System.out.println("inserisci carico:");
		carico=sc.nextInt();
		// TODO Auto-generated constructor stub
	}



	@Override
	public String toString() {
		return "furgoni [carico=" + carico + ", marca=" + marca + ", anno=" + anno + ", cilindrata=" + cilindrata + "]";
	}

	

	
	

}
