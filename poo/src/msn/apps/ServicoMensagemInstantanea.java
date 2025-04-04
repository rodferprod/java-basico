package msn.apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();

    public abstract void receberMensagem();

    protected void validarConexaoInternet() {
        System.out.println("Validando conexão com a internet...");
    }

    protected void salvaHistoricoMensagens() {
        System.out.println("Salvando mensagens no histórico...");
    }
}
