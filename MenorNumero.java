import java.util.Scanner;

public class MenorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite três números:");
        
        System.out.print("Primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Segundo número: ");
        double num2 = scanner.nextDouble();
        
        System.out.print("Terceiro número: ");
        double num3 = scanner.nextDouble();
        
        double menor = num1;
        
        if (num2 < menor) {
            menor = num2;
        }
        
        if (num3 < menor) {
            menor = num3;
        }
        
        System.out.printf("\nO menor número é: %.2f\n", menor);
        
        scanner.close();
    }
}