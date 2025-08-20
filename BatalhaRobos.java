package ExerciciosRevisao;
import java.util.Scanner;
public class BatalhaRobos {

	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a força do Robô 1 (1 a 100): ");
        int forcaRobo1 = sc.nextInt();

        System.out.print("Digite a força do Robô 2 (1 a 100): ");
        int forcaRobo2 = sc.nextInt();

        int pontosRobo1 = 0;
        int pontosRobo2 = 0;

        
        for (int rodada = 1; rodada <= 5; rodada++) {
            System.out.println("\nRodada " + rodada + ":");

            if (forcaRobo1 > forcaRobo2) {
                System.out.println("Robô 1 venceu a rodada!");
                pontosRobo1++;
            } else if (forcaRobo2 > forcaRobo1) {
                System.out.println("Robô 2 venceu a rodada!");
                pontosRobo2++;
            } else {
                System.out.println("Empate nesta rodada!");
            }
        }

        
        System.out.println("Robô 1: " + pontosRobo1 + " pontos");
        System.out.println("Robô 2: " + pontosRobo2 + " pontos");

        if (pontosRobo1 > pontosRobo2) {
            System.out.println(" Robô 1 é o grande campeão! ");
        } else if (pontosRobo2 > pontosRobo1) {
            System.out.println(" Robô 2 é o grande campeão! ");
        } else {
            System.out.println(" A batalha terminou empatada! ");
        }

        sc.close();
    }
}


	





