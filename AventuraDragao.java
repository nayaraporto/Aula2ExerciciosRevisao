package ExerciciosRevisao;
import java.util.Random;
public class AventuraDragao {

	public static void main(String[] args) {
		

        Random random = new Random();
        int vida = 100;
        int rodada = 1;

        System.out.println("O jogador começa com " + vida + " de vida.\n");

        while (vida > 0) {
            int dano = 5 + random.nextInt(16); 
            vida -= dano;

            if (vida < 0) vida = 0; 

            System.out.println("Rodada " + rodada + " O dragão causou " + dano + " de dano!");
            System.out.println("Vida restante do jogador: " + vida + "\n");

            rodada++;
        }

        System.out.println(" O dragão venceu! ");
    }
}


	






