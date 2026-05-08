package org.example;

public class Cartao {

    private String numeroCartao;
    private String titular;
    private double limiteDisponivel;
    private String cvv;

    public Cartao(String numeroCartao, String titular, double limiteInicial, String cvv) {
        this.numeroCartao = numeroCartao;
        this.titular = titular;
        this.limiteDisponivel = limiteInicial;
        this.cvv = cvv;
    }

    public String getTitular() {
        return titular;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void alterarLimite(double valor) {
        if (valor >= 0) {
            this.limiteDisponivel = valor;
        } else {
            System.out.println("Limite não pode ser negativo");
        }
    }
}