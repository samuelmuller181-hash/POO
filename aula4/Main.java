package org.example;

public class Main {

    public static void main(String[] args) {

        Titular titular =
                new Titular(
                        "Samuel",
                        "111111111",
                        30
                );

        Dependentes dependente =
                new Dependentes(
                        "Lucas",
                        "222222222",
                        15
                );

        Aposentado aposentado =
                new Aposentado(
                        "Carlos",
                        "333333333",
                        65
                );

        titular.exibirDados();

        System.out.println(
                "Mensalidade: R$ "
                        + titular.calcularMensalidade()
        );

        titular.acionarInternacao();

        System.out.println();

        dependente.exibirDados();

        System.out.println(
                "Mensalidade: R$ "
                        + dependente.calcularMensalidade()
        );

        dependente.acionarInternacao();

        System.out.println();

        aposentado.exibirDados();

        System.out.println(
                "Mensalidade: R$ "
                        + aposentado.calcularMensalidade()
        );

        aposentado.acionarInternacao();
    }
}