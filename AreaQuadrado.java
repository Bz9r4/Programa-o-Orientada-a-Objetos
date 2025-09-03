import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do lado do quadrado: ");
        double lado = scanner.nextDouble();
        
        double area = lado * lado;
        
        System.out.printf("A área do quadrado com lado %.2f é: %.2f\n", lado, area);
        
        scanner.close();
    }
}
