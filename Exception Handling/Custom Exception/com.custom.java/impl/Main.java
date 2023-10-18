package impl;

import java.util.Scanner;
import domain.Pessoa;
import exceptions.IdadeInvalidaException;

public class Main {

    public static void main(String[] args) {

        System.out.println("Iniciando criação de uma pessoa... 💁");
        System.out.println("Digite o nome:");
        Pessoa pessoa = new Pessoa();
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        System.out.println("Digite a idade:");
        Short idade = scanner.nextShort();
        scanner.close();

        try {
            pessoa.setNome(nome);
            pessoa.setIdade(idade);
            pessoa.verificaIdade();
            System.out.println("A pessoa com nome: " + nome + " e idade: " + idade + " foi criada com sucesso!");
        } catch (IdadeInvalidaException e) {
            e.printStackTrace();
        }
    }

}
