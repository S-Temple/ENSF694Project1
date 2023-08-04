package myLibrary.GraphAlgo;

public class AdjacencyMatrix {
    int[][] matrix;
    int size;

    // Define adjacency matrix
    AdjacencyMatrix(int size) {
        this.size = size;
        matrix = new int[size][size];
    }

    // Add new edges
    public void addEdge(int source, int destination, int cost) {
        matrix[source][destination] = cost;
        matrix[destination][source] = cost;
    }

    // return adjacency matrix
    public int[][] getAdjacencyMatrix() {
        return matrix;
    }

    // Display adjacency matrix
    public void displayAdjacencyMatrix() {
        for (int i = 0; i < this.size; i++) {
            for (int j = 0; j < this.size; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Add any other parts needed

}

