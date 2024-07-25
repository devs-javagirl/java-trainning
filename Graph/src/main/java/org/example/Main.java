package org.example;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Graph graph = new Graph();
        graph.addEdges("voce", List.of("alice", "bob", "claire"));
        graph.addEdges("bob", List.of("anuj", "peggy"));
        graph.addEdges("claire", List.of("thom", "jonny"));
        graph.addEdges("alice", List.of("peggy"));
        graph.addVertex("anuj");
        graph.addVertex("peggy");
        graph.addVertex("thom");
        graph.addVertex("jonny");

        graph.printGraph();

        graph.breathFirstSearch("voce");
    }
}