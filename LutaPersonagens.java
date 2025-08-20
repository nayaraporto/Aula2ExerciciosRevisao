package ExerciciosRevisao;
import java.util.Random;
public class LutaPersonagens {

	public static void main(String[] args) {
		
        Random random = new Random();

        int vidaPersonagem1 = 100;
        int vidaPersonagem2 = 100;
        int rodada = 1;

        do {
            System.out.println("Rodada " + rodada + ":");
			
            int dano1 = 5 + random.nextInt(16); 
            int dano2 = 5 + random.nextInt(16);

            vidaPersonagem2 -= dano1;
            vidaPersonagem1 -= dano2;

            if (vidaPersonagem1 < 0) vidaPersonagem1 = 0;
            if (vidaPersonagem2 < 0) vidaPersonagem2 = 0;

            System.out.println("Personagem 1 causa " + dano1 + " de dano Vida do Personagem 2: " + vidaPersonagem2);
            System.out.println("Personagem 2 causa " + dano2 + " de dano Vida do Personagem 1: " + vidaPersonagem1 + "\n");

            rodada++;
        } while (vidaPersonagem1 > 0 && vidaPersonagem2 > 0);

        if (vidaPersonagem1 > 0) {
            System.out.println(" Personagem 1 é o vencedor!");
        } else if (vidaPersonagem2 > 0) {
            System.out.println(" Personagem 2 é o vencedor!");
        } else {
            System.out.println(" Empate! Ambos caíram ao mesmo tempo!");
        }
    }
}


	





