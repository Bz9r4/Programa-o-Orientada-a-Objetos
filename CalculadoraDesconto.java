import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o código do setor (111 - Cama, mesa e banho, 222 - Eletros): ");
        int codigoSetor = scanner.nextInt();
        
        System.out.print("Digite o valor do produto: R$ ");
        double valorOriginal = scanner.nextDouble();
        
        double valorComDesconto = 0.0;
        String nomeSetor = "";
        boolean setorValido = true;
        
        switch (codigoSetor) {
            case 222: // Setor de Eletros
                nomeSetor = "Eletros";
                if (valorOriginal > 500) {
                    valorComDesconto = valorOriginal * 0.9; // 10% de desconto
                } else {
                    valorComDesconto = valorOriginal;
                }
                break;
                
            case 111: // Setor de Cama, mesa e banho
                nomeSetor = "Cama, mesa e banho";
                if (valorOriginal > 100) {
                    valorComDesconto = valorOriginal * 0.6; // 40% de desconto
                } else if (valorOriginal >= 50) {
                    valorComDesconto = valorOriginal * 0.8; // 20% de desconto
                } else {
                    valorComDesconto = valorOriginal * 0.9; // 10% de desconto
                }
                break;
                
            default:
                setorValido = false;
        }
        
        if (setorValido) {
            System.out.printf("\nSetor: %s\n", nomeSetor);
            System.out.printf("Valor original: R$ %.2f\n", valorOriginal);
            System.out.printf("Valor com desconto: R$ %.2f\n", valorComDesconto);
        } else {
            System.out.println("\nSetor Inválido");
        }
        
        scanner.close();
    }
}