package com.example.north_exe.trabalhofinalmobile.br.ufc.qxd.enums;

/**
 * Created by north-exe on 23/11/17.
 */

public enum Denuncia {
    VIAS_PUBLICAS(1), EQUIPAMENTOS_COMUNITARIOS(2), LIMPEZA_URBANA(3);

    private final int valor;
    Denuncia(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
