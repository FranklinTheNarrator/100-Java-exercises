package algorithms;

public class DijkstraAlgorithm {
    static int V = 9;

    public int minDistance(int[] dist, Boolean[] sptSet) {
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }

    public void printSolution(int[] dist, int n) {
        System.out.println("Vertex || Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i + "      ||      " + dist[i]);
    }

    public void dijkstra(int[][] graph, int src) {
        int[] dist = new int[V];

        Boolean[] sptSet = new Boolean[V];

        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        dist[src] = 0;

        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, sptSet);

            sptSet[u] = true;

            for (int v = 0; v < V; v++) {
                if (!sptSet[v] && graph[u][v] != 0 &&
                        dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
            }
        }

        printSolution(dist, V);
    }
}
