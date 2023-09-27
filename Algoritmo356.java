package exercicios;
import java.util.Scanner;
public class Algoritmo356 {

	public static void main(String[] args) {
		int L ,c ,t;
		int media [] = new int [15];
		String nomes [] = new String [15];
		String sit [] = new String [15];
		double pr1[] = new double [15];
		double pr2[] = new double [15];
		Scanner scan = new Scanner(System.in);
		for (L=0; L<=14; L++){
			System.out.println("\n\nDigite " + (L + 1) + " nome: ");
			nomes[L] = scan.nextLine();
			while (nomes[L].length()>30) {
				System.out.println("\nNomes com até 30 caracteres!");
				System.out.println("\n\nDigite " + (L + 1) + " nome: ");
				nomes[L] = scan.nextLine();
			}
			t = 30 - nomes[L].length();
			for ( c = 1; c <= t; c++) {
                nomes[L] += " ";
            }
			System.out.print("\nDigite 1 nota: ");
            pr1[L] = scan.nextDouble();
            System.out.print("\nDigite 2 nota: ");
            pr2[L] = scan.nextDouble();
            media[L] = (int) ((pr1[L] + pr2[L]) / 2 + 0.0001);

            if (media[L] >= 5) {
                sit[L] = "AP";
            } else {
                sit[L] = "RP";
            }
            scan.nextLine();
		}
		 System.out.println("\n\n\t\t\t\tRELACAO FINAL");
	        for (L = 0; L <= 14; L++) {
	        	System.out.println(" \n " + (L+1) + "- " + nomes [L]  + "\t" + pr1[L] + "\t" + pr2[L] + "\t" + media[L] + "\t" + sit[L]);
	        }
	}

}
