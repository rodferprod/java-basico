package com.equipamentos.multifuncional;

import com.fabrica.copiadoras.Copiadora;
import com.fabrica.digitalizadora.Digitalizadora;
import com.fabrica.impressoras.Impressora;

public class ScanJetCp implements Copiadora, Impressora, Digitalizadora {
    public void copiar() {
        System.out.println("Copiando documento...");
    }

    public void imprimir() {
        System.out.println("Imprimindo documento...");
    }

    public void digitalizar() {
        System.out.println("Digitalizando documento...");
    }
}
