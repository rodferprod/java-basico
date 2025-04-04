package msn;

import msn.apps.ServicoMensagemInstantanea;
import msn.apps.Telegram;

public class Usuario {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        smi = new Telegram();
        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
