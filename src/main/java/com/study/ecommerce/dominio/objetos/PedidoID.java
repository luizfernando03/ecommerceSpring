package com.study.ecommerce.dominio.objetos;

public class PedidoID {

    private static Integer id = 0;

    private Integer valor;

    private PedidoID() {
        id++;
        this.valor = id;
    }

    public static PedidoID criar() {
        return new PedidoID();
    }

    @Override
    public Integer valor() {
        return valor;
    }
}
