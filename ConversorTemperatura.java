import java.util.Scanner;

public class ConversorTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();
        
        // Fórmula de conversão: °F = (°C × 9/5) + 32
        double fahrenheit = (celsius * 9/5) + 32;
        
        System.out.printf("%.2f°C é igual a %.2f°F\n", celsius, fahrenheit);
        
        scanner.close();
    }
}