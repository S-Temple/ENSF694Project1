package myLibrary.GraphAlgo;

import java.util.Arrays;

public class Dijkstra {

    // Apply Dijkstra's algorithm
    public void Dijkstra_Algo(int[][] graph, int source) {
        int numNodes = graph.length;
        int[] pathCosts = new int[numNodes];
        boolean[] visited = new boolean[numNodes];
        Arrays.fill(pathCosts, Integer.MAX_VALUE);
        pathCosts[source] = 0;
        visited[source] = true;

        int pointer = source;
        while (true) {
            visited[pointer] = true;

            // Update neighboring nodes' path costs
            for (int i = 0; i < numNodes; i++) {
                if (graph[pointer][i] != 0 && !visited[i]) {
                    int newCost = pathCosts[pointer] + graph[pointer][i];
                    if (newCost < pathCosts[i]) {
                        pathCosts[i] = newCost;
                    }
                }
            }

            // Find the next unvisited node with the lowest path cost
            int minCost = Integer.MAX_VALUE;
            pointer = -1;
            for (int i = 0; i < numNodes; i++) {
                if (!visited[i] && pathCosts[i] < minCost) {
                    minCost = pathCosts[i];
                    pointer = i;
                }
            }

            if (pointer == -1) break;
        }

        for (int i = 0; i < numNodes; i++) {
            if (pathCosts[i] == Integer.MAX_VALUE) {
                System.out.println(source + " to " + i + " is impossible");
            } else {
                System.out.println("Distance from " + source + " to " + i + " is " + pathCosts[i]);
            }
        }
    }
}
