package com.equipamentos.copiadoras;

import com.fabrica.copiadoras.Copiadora;

public class Xerox implements Copiadora {
    public void copiar() {
        System.out.println("Copiando documento...");
    }
}