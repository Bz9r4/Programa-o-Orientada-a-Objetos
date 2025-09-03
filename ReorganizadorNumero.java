import java.util.Scanner;

public class ReorganizadorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número de 3 dígitos: ");
        int numeroCDU = scanner.nextInt();
        
        // Extraindo cada dígito
        int centena = numeroCDU / 100;        // Obtém a centena
        int dezena = (numeroCDU % 100) / 10;  // Obtém a dezena
        int unidade = numeroCDU % 10;         // Obtém a unidade
        
        // Reorganizando no formato UCD
        int numeroUCD = unidade * 100 + centena * 10 + dezena;
        
        System.out.printf("Número original (CDU): %d\n", numeroCDU);
        System.out.printf("Número reorganizado (UCD): %d\n", numeroUCD);
        
        scanner.close();
    }
}