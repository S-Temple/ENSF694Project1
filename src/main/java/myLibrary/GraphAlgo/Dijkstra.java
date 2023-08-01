package myLibrary.GraphAlgo;

import java.util.Arrays;

public class Dijkstra {

	// Apply Dijkstras algorithm
	public void Dijkstra_Algo(int[][] graph, int source) 
	{
		int numNodes = graph.length;
		int[] pathCosts = new int[numNodes];
		boolean[] visited = new boolean[numNodes];
		Arrays.fill(pathCosts, Integer.MAX_VALUE);
		pathCosts[source] = 0;
		visited[source] = true;

		int pointer = source;
		int traveled = 0; // issues here
		while(!areAllTrue(visited)){
			// add neighbours to pathCost
			for(int i = 0; i < numNodes; i++){
				if(graph[pointer][i] != 0 && pathCosts[i] > traveled + graph[pointer][i]){
					pathCosts[i] = traveled + graph[pointer][i];
				}
			}
			// pick lowest non-visited path
			int low = Integer.MAX_VALUE;
			for (int i = 0; i < numNodes; i++){
				if(pathCosts[i] < low && visited[i] == false){
					pointer = i;
					low = pathCosts[i];
				}
			}
			if(low == Integer.MAX_VALUE) break;
			visited[pointer] = true;
			traveled = pathCosts[pointer];
		}
		for(int i = 0; i < numNodes; i++){
			if(pathCosts[i] == Integer.MAX_VALUE) System.out.println(source + " to " + i + " is impossible");
			else System.out.println("Distance from " + source + " to " + i + " is " + pathCosts[i]);
		}


	}
	  
	// Add any other parts needed
	public static boolean areAllTrue(boolean[] array) {
		for (boolean b : array) if (!b) return false;
		return true;
	}
}
