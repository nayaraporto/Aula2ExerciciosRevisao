package ExerciciosRevisao;
import java.util.Random;
public class Rapunzel {

	public static void main(String[] args) {

        Random random = new Random();
        int totalDegraus = 10;
        int degrauRapunzel = 1 + random.nextInt(totalDegraus); 

        int degrauAtual = 0;

        while (degrauAtual < totalDegraus) {
            degrauAtual++;
            System.out.println("Subindo degrau " + degrauAtual + "...");

            if (degrauAtual == degrauRapunzel) {
                System.out.println("Você encontrou Rapunzel no degrau " + degrauAtual + "!");
                break;
            }
        }

        if (degrauAtual < degrauRapunzel) {
            System.out.println("O personagem chegou ao topo, mas Rapunzel não estava lá.");
        }
    }
}


	}

}

