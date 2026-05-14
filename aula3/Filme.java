package org.example;

public class Filme extends Midia
        implements Reproduzivel,
        Baixavel {

    private String qualidade;

    public Filme(
            String titulo,
            int duracaoEmMinutos,
            String qualidade
    ) {

        super(
                titulo,
                duracaoEmMinutos
        );

        this.qualidade = qualidade;
    }

    @Override
    public double calcularCusto() {

        double custo = 10.0;

        if (qualidade.equalsIgnoreCase("4K")) {

            custo += 5.0;
        }

        return custo;
    }

    @Override
    public void darPlay() {

        System.out.println(
                "Reproduzindo filme: "
                        + titulo
        );
    }

    @Override
    public void realizarDownload() {

        System.out.println(
                "Baixando filme: "
                        + titulo
        );
    }
}