package exercicios;
import java.util.Scanner;
public class Algoritmo351 {
	public static void main(String[] args) {
		int L, num;
		String nomes[] = new String [5];
		Scanner scan = new Scanner(System.in);
		for (L=0; L<=4; L ++) {
			System.out.print("\nnome " + (L + 1) + ": ");
			nomes [L] = scan.nextLine();
			}
			System.out.println("\nDigite o numero da pessoa : ");
			num = scan.nextInt();
			while (num < 1 || num > 5) {
				System.out.println("\n Numero fora do intervalo");
				System.out.println("\n Digite o numero da pessoa: ");
				num = scan.nextInt();
			}
		System.out.println("\n" + nomes[ num -1]);
		System.out.println();
		}
	}
