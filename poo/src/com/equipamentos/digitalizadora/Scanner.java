package com.equipamentos.digitalizadora;

import com.fabrica.digitalizadora.Digitalizadora;

public class Scanner implements Digitalizadora {
    public void digitalizar() {
        System.out.println("Escaneando documento...");
    }
}
