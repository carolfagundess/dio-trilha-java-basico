package cotroleFluxo;

import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o primeiro parâmetro: ");
		int x = sc.nextInt();
		System.out.print("Digite o segundo parâmetro: ");
		int y = sc.nextInt();

		try {
			contar(x, y);

		} catch (ParametrosInvalidosException e) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		sc.close();
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) throw new ParametrosInvalidosException();

        int contagem = parametroDois - parametroUm;
        for (int i = parametroUm; i <= parametroDois; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
