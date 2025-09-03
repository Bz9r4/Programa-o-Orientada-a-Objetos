import java.util.Scanner;

public class ConversorTempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o número de minutos: ");
        int totalMinutos = scanner.nextInt();
        
        // Cálculo dos dias, horas e minutos
        int dias = totalMinutos / (24 * 60);  // Minutos em um dia: 24 * 60
        int restante = totalMinutos % (24 * 60);
        
        int horas = restante / 60;
        int minutos = restante % 60;
        
        // Exibição do resultado
        System.out.printf("%d minutos = %d dias, %d horas e %d minutos\n", 
                         totalMinutos, dias, horas, minutos);
        
        scanner.close();
    }
}