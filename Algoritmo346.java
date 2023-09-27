package exercicios;
import java.util.Scanner;
public class Algoritmo346 {
	public static void main(String[] args) {
		String frase;
		int op, x, tam;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("\nMENU");
			System.out.println("\nl - Imprime o comprimento da frase");
			System.out.println("\n2 - Imprime os dois primeiros e os dois ultimos caracteres da frase");
			System.out.println("\n3 - Imprime a frase espelhada");
			System.out.println("\n4 - Termina o algoritmo");
			System.out.println("\nOPCAO: ");
			op = scan.nextInt();
			if (op==1) {
				System.out.println("\nDigite uma frase: ");
				scan.nextLine();
				frase = scan.nextLine();
				System.out.println("\nnumero de caracteres da frase: " + frase.length());
			}
			else if (op == 2) {
                System.out.print("\nDigite uma frase: ");
                scan.nextLine();
                frase = scan.nextLine();
                System.out.println("os dois primeiros caracteres: " + frase.substring(0, 2));
                tam = frase.length() - 2;
                System.out.println("os dois ultimos caracteres: " + frase.substring(tam));
				}
			else if (op==3) {
				System.out.print("\nDigite uma frase: ");
				scan.nextLine();
				frase = scan.nextLine();
				for (x = frase.length() - 1; x >= 0; x--) {
                    System.out.print(frase.charAt(x));}
				System.out.println();
			} else if (op == 4) {
	                System.out.println("\nFim do algoritmo");
	            } else {
	                System.out.println("\nopcao nao disponivel");
	            }
			} while (op != 4);
        
				scan.close();
				
	}
}
