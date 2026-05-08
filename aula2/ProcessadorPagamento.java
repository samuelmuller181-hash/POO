package org.example;

public class ProcessadorPagamento {

    private Cartao cartao;

    public ProcessadorPagamento(Cartao cartao) {
        this.cartao = cartao;
    }

    public void executarVenda(double valor) {
        if (cartao.getLimiteDisponivel() >= valor) {

            double novoLimite = cartao.getLimiteDisponivel() - valor;

            cartao.alterarLimite(novoLimite);

            System.out.println("Venda aprovada: " + valor);

        } else {

            System.out.println("Transação negada");
        }
    }

    public void estornarVenda(double valor) {

        double novoLimite = cartao.getLimiteDisponivel() + valor;

        cartao.alterarLimite(novoLimite);

        System.out.println("Estorno realizado: " + valor);
    }
}