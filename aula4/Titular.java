package org.example;

public class Titular extends Beneficiario {

    public Titular(
            String nome,
            String cpf,
            int idade
    ) {

        super(nome, cpf, idade);
    }

    @Override
    public double calcularMensalidade() {

        if (idade <= 18) {

            return 180;
        }

        if (idade <= 59) {

            return 340;
        }

        return 620;
    }

    public void acionarInternacao() {

        System.out.println(
                nome + " acionou internação."
        );
    }
}