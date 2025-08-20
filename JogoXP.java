package ExerciciosRevisao;

import java.util.Scanner;

public class JogoXP {

	public static void main(String[] args) {
		
		int XP = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seus pontos de XP: ");
		
		XP = scanner.nextInt();
		
		 if (XP >= 100  ) {
				System.out.println("Noob");}
	            else if (XP >= 500) {
				System.out.println("Aprendiz");}
	            else if (XP >= 1000) {
	            System.out.println("Pro");}
             else if (XP > 1000) {
             System.out.println("Lendario");}
             else { 
            	 System.out.println("Valor Invalido");
             }
		
		

		 scanner.close();
	}

}

