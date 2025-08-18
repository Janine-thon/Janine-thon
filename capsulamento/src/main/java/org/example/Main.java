package org.example;

public class Main {
    public static void main(String[] args) {
        // Istanciar a classe.
        Cliente c1 = new Cliente();
        Mercado m1 = new Mercado();

        // Atrinbuindo valores.
        // c1.nome = "Marta";
        c1.setNome("Marta");
        m1.setProduto("Arroz");
        // c1.idade = 25;
        c1.setIdade(25);
        m1.setPreco(5000);

        // Exibindo dados.
        System.out.println("Nome: " + c1.getNome());
        System.out.println("Idade: " + c1.getIdade());
        System.out.println("\nProduto: " + m1.getProduto());
        System.out.println("Preço: " + m1.getPreco());
    }
}