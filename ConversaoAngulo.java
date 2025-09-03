import java.util.Scanner;

public class ConversaoAngulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o ângulo em graus: ");
        double graus = scanner.nextDouble();
        
        // Converte graus para radianos
        double radianos = Math.toRadians(graus);
        
        // Calcula as funções trigonométricas
        double seno = Math.sin(radianos);
        double cosseno = Math.cos(radianos);
        double tangente = Math.tan(radianos);
        double secante = 1.0 / Math.cos(radianos);
        double cossecante = 1.0 / Math.sin(radianos);
        double cotangente = 1.0 / Math.tan(radianos);
        
        // Exibe os resultados
        System.out.printf("\nÂngulo em radianos: %.4f\n", radianos);
        System.out.printf("Seno: %.4f\n", seno);
        System.out.printf("Cosseno: %.4f\n", cosseno);
        System.out.printf("Tangente: %.4f\n", tangente);
        System.out.printf("Secante: %.4f\n", secante);
        System.out.printf("Cossecante: %.4f\n", cossecante);
        System.out.printf("Cotangente: %.4f\n", cotangente);
        
        scanner.close();
    }
}