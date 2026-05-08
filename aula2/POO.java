package org.example;

public class Main {

    public static void main(String[] args) {

        Cartao cartao = new Cartao(
                "1234-5678-9012-3456",
                "Samuel",
                5000.0,
                "123"
        );

        ProcessadorPagamento processador = new ProcessadorPagamento(cartao);

        processador.executarVenda(2000);
        System.out.println("Limite atual: " + cartao.getLimiteDisponivel());

        processador.executarVenda(4000);
        System.out.println("Limite atual: " + cartao.getLimiteDisponivel());
