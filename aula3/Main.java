package org.example;

public class Main {

    public static void main(String[] args) {

        Filme filme = new Filme(
                "Batman",
                125,
                "4K"
        );

        Musica musica = new Musica(
                "Numb",
                4,
                "Linkin Park"
        );

        filme.exibirDetalhes();

        System.out.println(
                "Custo filme: R$ "
                        + filme.calcularCusto()
        );

        System.out.println(
                ConversorTempo
                        .formatarMinutos(125)
        );

        filme.realizarDownload();

        System.out.println();

        musica.exibirDetalhes();

        System.out.println(
                "Custo música: R$ "
                        + musica.calcularCusto()
        );

        System.out.println();

        processarPlayer(filme);

        processarPlayer(musica);
    }

    public static void processarPlayer(
            Reproduzivel item
    ) {

        item.darPlay();
    }
}