package ExerciciosRevisao;
import java.util.Scanner;
public class ChatBotAmor {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);

        System.out.print("Você é legal? (responda 'sim' ou 'não'): ");
        String resposta = sc.nextLine().toLowerCase();

        if (resposta.equals("sim")) {
            System.out.println("Você merece um bombom ");
        } else if (resposta.equals("não") || resposta.equals("nao")) {
            System.out.println("Todo mundo tem seus dias ");
        } else {
            System.out.println("Resposta inválida! Tente responder apenas 'sim' ou 'não'.");
        }

        sc.close();
    }
}


	}

}


