package application;

import java.util.Locale;
import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculadoraJuroCompostos {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        
        double valorInicial = scanner.nextDouble();
        
        double taxaJuros = scanner.nextDouble();
        
        int periodo = scanner.nextInt();
        
        double valorFinal = valorInicial;
        
        double x = Math.pow(1 + taxaJuros, periodo);
        valorFinal = valorInicial * x;
        

        // Cria um objeto DecimalFormat
        DecimalFormat format = new DecimalFormat("#.##");

        // Formata o número
        String formattedValue = format.format(valorFinal);;
        
        System.out.println("Valor final do investimento: R$ " + formattedValue);
        
        scanner.close();
	}
}	
