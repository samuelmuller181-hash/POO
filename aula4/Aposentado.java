package org.example;

public class Aposentado
        extends Titular {

    public Aposentado(
            String nome,
            String cpf,
            int idade
    ) {

        super(nome, cpf, idade);
    }

    @Override
    public double calcularMensalidade() {

        return super.calcularMensalidade()
                * 0.8;
    }
}