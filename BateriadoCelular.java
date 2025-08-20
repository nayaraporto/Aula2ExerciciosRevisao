package ExerciciosRevisao;

public class BateriadoCelular {

	public static void main(String[] args) {
		
        int bateria = 100;
        int minutos = 0;
        int gastoPorMinuto = 7;

        System.out.println("Simulador de Bateria do Celular");
        System.out.println("Usando TikTok...");

        while (bateria > 0) {
            minutos++;
            bateria -= gastoPorMinuto;

            if (bateria < 0) bateria = 0; 
            System.out.println("Minuto " + minutos + " Bateria: " + bateria + "%");
        }

        System.out.println("\n A bateria acabou após " + minutos + " minutos usando TikTok!");
    }
}


	





