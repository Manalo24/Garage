import java.util.*;
public class auto extends Veicolo {
	private Scanner sc = new Scanner(System.in);
	int porte;
	String alimentazione;
	
	public auto() {
		super();
		System.out.println("Inserisci n porte, alimentazione");
		porte=sc.nextInt();
		alimentazione=sc.next();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "auto [porte=" + porte + ", alimentazione=" + alimentazione + ", marca=" + marca + ", anno=" + anno
				+ ", cilindrata=" + cilindrata + "]";
	}
	
	 
}
