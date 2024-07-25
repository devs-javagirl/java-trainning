package org.example;

import java.util.*;

public class Graph {
    private Map<String, List<String>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addVertex(String vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdges(String vertex, List<String> listOfVertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
        adjList.get(vertex).addAll(listOfVertex);
        //adjList.get(vertex2).add(vertex1); //Para grafos não direcionados
    }
    public Map<String, List<String>> getAdjList() {
        return adjList;
    }

    public void printGraph() {
        for (String vertex : adjList.keySet()) {
            System.out.print(vertex + " -> ");
            for (String neighbor : adjList.get(vertex)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }

    public void breathFirstSearch(String initialVertex) {
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        visited.add(initialVertex);
        queue.add(initialVertex);

        while(!queue.isEmpty()) {
            String vertex = queue.poll();

            if(isMangoSeller(vertex)) {
                System.out.println("Found it: " + vertex);
                return;
            } else {
                queue.addAll(adjList.get(vertex));
            }
        }

        System.out.println("Didnt find it.");
    }

    public boolean isMangoSeller(String vertex) {
        return vertex.endsWith("m");
    }
}
