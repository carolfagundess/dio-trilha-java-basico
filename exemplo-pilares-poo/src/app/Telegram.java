package app;

public class Telegram extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConexao();
		System.out.println("Enviando mensagens pelo Telegram");
		critpografarMensagens();
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagens pelo Telegram");
		critpografarMensagens();
	}
	
	private void critpografarMensagens() {
		System.out.println("Criptografando mensagens");
	}

	@Override
	public void salvarHistorico() {
		// TODO Auto-generated method stub
		
	}

}
