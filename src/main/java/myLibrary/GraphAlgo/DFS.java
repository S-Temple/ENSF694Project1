package myLibrary.GraphAlgo;

import java.util.Arrays;

public class DFS {

    AdjacencyMatrix adjMatrix;
	// Define BFS
    DFS(int size){
        adjMatrix = new AdjacencyMatrix(size);
    }
	 
	// You can use either adjacency matrix or adjacency list to keep track of the graph
		
	// Add edge to graph
    void addEdge(int v, int w)
    {
        adjMatrix.addEdge(v, w, 1);
    }
 
    // Apply DFS algorithm and display the nodes visited and the visit array values
    // See the sample output to create a proper format
    void DFS_Algo(int v)
    {
        myStack stack = new myStack(adjMatrix.size);
        myStack visited = new myStack(adjMatrix.size);
        boolean[] isVisited = new boolean[adjMatrix.size];

        stack.push(v);
        visited.push(v);
        isVisited[v] = true;

        while (!stack.isEmpty()) {
            int currentNode = stack.pop();

            for (int i = 0; i < adjMatrix.size; i++) {
                if (adjMatrix.matrix[currentNode][i] == 1 && !isVisited[i]) {
                    stack.push(i);
                    visited.push(i);
                    isVisited[i] = true;
                }
            }
        }

        visited.display();
        System.out.println("Visited Nodes: " + Arrays.toString(isVisited));

    }
    
    // Add any other parts needed
}
