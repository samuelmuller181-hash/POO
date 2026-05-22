package org.example;

public class Musica extends Midia
        implements Reproduzivel {

    private String autor;

    public Musica(
            String titulo,
            int duracaoEmMinutos,
            String autor
    ) {

        super(
                titulo,
                duracaoEmMinutos
        );

        this.autor = autor;
    }

    @Override
    public double calcularCusto() {

        return 2.0;
    }

    @Override
    public void darPlay() {

        System.out.println(
                "Reproduzindo música: "
                        + titulo
                        + " - "
                        + autor
        );
    }
}