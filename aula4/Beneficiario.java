package org.example;

public abstract class Beneficiario {

    protected String nome;
    protected String cpf;
    protected int idade;

    public Beneficiario(
            String nome,
            String cpf,
            int idade
    ) {

        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public abstract double calcularMensalidade();

    public void exibirDados() {

        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
    }
}