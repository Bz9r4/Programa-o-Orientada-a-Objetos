import java.util.Scanner;

public class CartaBaralho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor da carta (1 a 13): ");
        int valor = scanner.nextInt();
        
        System.out.print("Digite o naipe (1-ouros, 2-paus, 3-copas, 4-espadas): ");
        int naipe = scanner.nextInt();
        
        String nomeCarta = "";
        String nomeNaipe = "";
        
        // Determina o nome da carta
        switch (valor) {
            case 1:
                nomeCarta = "Ás";
                break;
            case 11:
                nomeCarta = "Valete";
                break;
            case 12:
                nomeCarta = "Dama";
                break;
            case 13:
                nomeCarta = "Rei";
                break;
            default:
                nomeCarta = String.valueOf(valor);
                break;
        }
        
        // Determina o naipe
        switch (naipe) {
            case 1:
                nomeNaipe = "Ouros";
                break;
            case 2:
                nomeNaipe = "Paus";
                break;
            case 3:
                nomeNaipe = "Copas";
                break;
            case 4:
                nomeNaipe = "Espadas";
                break;
            default:
                nomeNaipe = "Naipe inválido";
                break;
        }
        
        // Verifica se os valores são válidos
        if (valor >= 1 && valor <= 13 && naipe >= 1 && naipe <= 4) {
            System.out.printf("Carta: %s de %s\n", nomeCarta, nomeNaipe);
        } else {
            System.out.println("Valores inválidos! Por favor, digite valores válidos.");
        }
        
        scanner.close();
    }
}