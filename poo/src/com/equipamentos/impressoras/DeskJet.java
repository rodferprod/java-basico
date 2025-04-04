package com.equipamentos.impressoras;

import com.fabrica.impressoras.Impressora;

public class DeskJet implements Impressora {
    public void imprimir() {
        System.out.println("Imprimindo documento...");
    }
}
