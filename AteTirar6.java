package ExerciciosRevisao;
		import java.util.Random;
public class AteTirar6 {

	public static void main(String[] args) {

        Random random = new Random();
        int tentativa = 0;
        int resultado;

        System.out.println("Rolando o dado até sair 6\n");

        do {
            resultado = 1 + random.nextInt(6); 
            tentativa++;
            System.out.println("Tentativa " + tentativa + " saiu " + resultado);
        } while (resultado != 6);

        System.out.println("\n O número 6 saiu após " + tentativa + " tentativas!");
    }
}


	






