package app;

public class MSNMessenger extends ServicoMensagemInstantanea {

	@Override
	public void enviarMensagem() {
		validarConexao();
		confirmarAmizade();
		System.out.println("Enviando mensagens pelo MSN Messenger");
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagens pelo MSN Messenger");
	}

	private void confirmarAmizade() {
		System.out.println("Confirmando amizade");
	}

	@Override
	public void salvarHistorico() {
		// TODO Auto-generated method stub
		
	}
}
