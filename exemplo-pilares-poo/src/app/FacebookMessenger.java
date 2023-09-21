package app;

public class FacebookMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConexao();
		validarMensagem();
		System.out.println("Enviando mensagens pelo FacebookMessenger");
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagens pelo FacebookMessenger");
	}
	
	private void validarMensagem() {
		System.out.println("Validando mensagem");
	}

	@Override
	public void salvarHistorico() {
		// TODO Auto-generated method stub
		
	}
	
}
