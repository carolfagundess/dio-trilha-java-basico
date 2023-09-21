package entities;

import java.util.Scanner;

import app.FacebookMessenger;
import app.MSNMessenger;
import app.ServicoMensagemInstantanea;
import app.Telegram;

public class computadorPedrinho {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		ServicoMensagemInstantanea smi = null;
		
		System.out.println("Escolha um app: (fbm) (tlg) (msn)");
		String appEscolhido = scan.nextLine() ;
		
		if(appEscolhido.equals("msn")) {
			smi = new MSNMessenger();
		}else if(appEscolhido.equalsIgnoreCase("fbm")) {
			smi = new FacebookMessenger();
		}else if (appEscolhido.equals("tlg")){
			smi = new Telegram();
		}
		
		smi.enviarMensagem();
		smi.receberMensagem();		
		
		
		scan.close();
	}
}
