import java.util.*;
public class Veicolo {
	private Scanner sc=new Scanner(System.in);
	String marca;
	int anno;
	int cilindrata;
	public Veicolo() {
		System.out.println("Inserisci marca, anno , cilindrata");
		marca = sc.next();
		anno = sc.nextInt();
		cilindrata = sc.nextInt();
	}
	public Veicolo(String marca, int anno, int cilindrata) {
		this.marca = marca;
		this.anno = anno;
		this.cilindrata = cilindrata;
	}
	@Override
	public String toString() {
		return " ";
	}
	
	
}
