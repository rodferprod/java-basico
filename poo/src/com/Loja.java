package com;

import com.equipamentos.multifuncional.ScanJetCp;

import com.fabrica.copiadoras.Copiadora;
import com.fabrica.impressoras.Impressora;
import com.fabrica.digitalizadora.Digitalizadora;

public class Loja {
    public static void main(String[] args) {

        ScanJetCp mf = new ScanJetCp();

        Copiadora copiadora = mf;
        Impressora impressora = mf;
        Digitalizadora digitalizadora = mf;

        copiadora.copiar();
        digitalizadora.digitalizar();
        impressora.imprimir();
    }
}
