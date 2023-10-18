package Algoritmos.LIFO.com.lifo.java;

import java.util.Stack;

public class Lifo {

    public static void main(String[] args) {
         // Instancia a classe Stack
        Stack<Ball> tube = new Stack<>();

        // Verifica se a pilha está vazia
        tube.empty();

        // Empilha item na pilha
        tube.push(new Ball("Vermelha"));
        tube.push(new Ball("Amarela"));
        Ball blueBall = new Ball("Azul");
        tube.push(blueBall);
        tube.push(new Ball("Verde"));
        
        // Conta o número de itens na pilha
        tube.size();
        
        // Desempilha item na pilha 
        System.out.println(tube.pop());  // Retorna: Verde

        // Informa quem está no topo da pilha
        System.out.println(tube.peek()); // Retorna: Azul

        // Informa a posição que o item está na pilha
        System.out.println(tube.search(blueBall)); // Retorna: 1
    }
    
}
