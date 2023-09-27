package exercicios;
import java.util.Scanner;
public class Algoritmo348 {

	public static void main(String[] args) {
		int L;
		String nomes [] = new String[15];
		Double pr1 [] = new Double [5];
		Double pr2 [] = new Double [5];
		Double media [] = new Double [5];
		Scanner scan = new Scanner(System.in);
		
		for (L=0; L<=4; L ++) {
			System.out.print("digite " + (L + 1) + " nome: ");
			nomes[L] = scan.nextLine();
			System.out.print("digite 1a nota: ");  
			pr1[L] = scan.nextDouble();
			System.out.print("digite 2a nota: ");
			pr2[L] = scan.nextDouble();
			scan.nextLine();
			media[L] = (pr1[L] + pr2[L])/2;
			}
		System.out.print("\n\n\n\t\t\t\tRELACAO FINAL\n");
		for (L=0; L<=4; L ++) {
			System.out.println("\n" + (L+1) + "-" + nomes[L]);
			System.out.print("\n" + pr1 [L] + "\t" + pr2 [L] + "\t" + media[L]);
			}
		System.out.print("\n");
	}
}
