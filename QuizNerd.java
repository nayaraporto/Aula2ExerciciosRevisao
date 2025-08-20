package ExerciciosRevisao;
import java.util.Scanner;
public class QuizNerd {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int pontos = 0;

       
        System.out.println("Responda digitando a alternativa correta (a, b ou c).\n");

        System.out.println("1) Em 'O Verão que Mudou a Minha Vida', qual é o nome da pessoa que fica com dois irmãos?");
        System.out.println("a) Belly\nb) Sarah\nc) Emily");
        String r1 = sc.nextLine();
        if (r1.equals("a")) {
            System.out.println("Resposta correta!");
            pontos++;
        } else {
            System.out.println("Resposta errada! Era 'Belly'.");
        }

        System.out.println("\n2) Na série 'Wandinha', qual é o nome da colega de quarto da Wandinha?");
        System.out.println("a) Enid\nb) Mortícia\nc) Bianca");
        String r2 = sc.nextLine();
        if (r2.equals("a")) {
            System.out.println("Resposta correta!");
            pontos++;
        } else {
            System.out.println(" Resposta errada! Era 'Enid'.");
        }
        System.out.println("\n3) Em 'A Promessa do Golfe', qual é o nome do personagem principal ?");
        System.out.println("a) Todoin\nb) Gawain\nc) Tristan");
        String r3 = sc.nextLine();
        if (r3.equals("b")) {
            System.out.println(" Resposta correta!");
            pontos++;
        } else {
            System.out.println("Resposta errada! Era 'Gawain'.");
        }

        System.out.println("Você fez " + pontos + " de 3 pontos!");

        sc.close();
    }
}


	




