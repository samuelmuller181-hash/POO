package org.example;

public class Dependentes
        extends Beneficiario {

    public Dependentes(
            String nome,
            String cpf,
            int idade
    ) {

        super(nome, cpf, idade);
    }

    @Override
    public double calcularMensalidade() {

        double valorBase;

        if (idade <= 18) {

            valorBase = 180;

        } else if (idade <= 59) {

            valorBase = 340;

        } else {

            valorBase = 620;
        }

        return valorBase * 0.7;
    }

    public void acionarInternacao() {

        System.out.println(
                "Dependente não possui cobertura."
        );
    }
}