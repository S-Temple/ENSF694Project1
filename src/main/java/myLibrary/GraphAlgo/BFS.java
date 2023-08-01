package myLibrary.GraphAlgo;

import java.util.Arrays;

public class BFS
{
    AdjacencyMatrix adjMatrix;
	// Define BFS
    BFS(int size){
        adjMatrix = new AdjacencyMatrix(size);
    }
 
	// You can use either adjacency matrix or adjacency list to keep track of the graph
	
	// Add edge to graph
    public void addEdge(int v,int w)
    {
        adjMatrix.addEdge(v, w, 1);
    }
 
    // Apply BFS algorithm and display the nodes visited and the visit array values
    // See the sample output to create a proper format
    public void BFS_Algo(int n)
    {
        myQueue queue = new myQueue(adjMatrix.size);
        myQueue visited = new myQueue(adjMatrix.size);
        boolean[] isVisited = new boolean[adjMatrix.size];

        queue.enqueue(n);
        visited.enqueue(n);
        isVisited[n] = true;

        while (!queue.isEmpty()) {
            int currentNode = queue.dequeue();

            for (int i = 0; i < adjMatrix.size; i++) {
                if (adjMatrix.matrix[currentNode][i] == 1 && !isVisited[i]) {
                    queue.enqueue(i);
                    visited.enqueue(i);
                    isVisited[i] = true;
                }
            }
        }

        visited.display();
        System.out.println("Visited Nodes: " + Arrays.toString(isVisited));

    }
	
	// Add any other parts needed
}
