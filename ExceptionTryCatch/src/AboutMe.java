import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		 try {
	        System.out.print("Por favor digite o seu nome: ");
	        String nomeCliente = sc.nextLine();
	        
	        System.out.print("Por favor digite o seu sobrenome: ");
	        String sobrenomeCliente = sc.next();

	        System.out.print("Por favor digite o : ");
	        int anos = sc.nextInt();

	        System.out.print("Por favor digite o o: ");
	        Double altura = sc.nextDouble();

	        System.out.print("Olá " + nomeCliente +  sobrenomeCliente + ", voce tem " + anos + " anos e " + altura + "metros de altura");

	        sc.close();
		 }
		 catch(InputMismatchException e) {
			 System.out.println("Os campos idade e altura precisam ser númericos");
		 }
		 
		 
	    }
}
