import java.util.Scanner;

public class MediaAritmedica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite três números reais:");
        
        System.out.print("Primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Terceiro número: ");
        double num3 = scanner.nextDouble();
        
        double soma = num1 + num2 + num3;
        double media = soma / 3;
        
        System.out.printf("\nA soma dos números é: %.2f\n", soma);
        System.out.printf("A média aritmética é: %.2f\n", media);
        
        scanner.close();
    }
}
