package app;

public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();

	public abstract void receberMensagem();

	public abstract void salvarHistorico();

	protected void validarConexao() {
		System.out.println("Validando conexão");
	}
}
