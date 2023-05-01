import java.util.*;

public class DijkstraAlgorithm {

    private int numVertices;
    private int dist[];
    private Set<Integer> visited;
    private PriorityQueue<Node> priorityQueue;
    private List<List<Node>> adjacencyList;

    public DijkstraAlgorithm(int numVertices) {
        this.numVertices = numVertices;
        dist = new int[numVertices];
        visited = new HashSet<Integer>();
        priorityQueue = new PriorityQueue<Node>(numVertices, new Node());
        adjacencyList = new ArrayList<List<Node>>(numVertices);

        for (int i = 0; i < numVertices; i++) {
            List<Node> list = new ArrayList<Node>();
            adjacencyList.add(list);
        }
    }

    public void addEdge(int src, int dest, int weight) {
        adjacencyList.get(src).add(new Node(dest, weight));
        adjacencyList.get(dest).add(new Node(src, weight));
    }

    public void dijkstra(int src) {
        for (int i = 0; i < numVertices; i++) {
            dist[i] = Integer.MAX_VALUE;
        }

        priorityQueue.add(new Node(src, 0));
        dist[src] = 0;

        while (visited.size() != numVertices) {
            int u = priorityQueue.remove().node;
            visited.add(u);
            neighbours(u);
        }
    }

    private void neighbours(int u) {
        int edgeDistance = -1;
        int newDistance = -1;

        for (int i = 0; i < adjacencyList.get(u).size(); i++) {
            Node v = adjacencyList.get(u).get(i);

            if (!visited.contains(v.node)) {
                edgeDistance = v.cost;
                newDistance = dist[u] + edgeDistance;

                if (newDistance < dist[v.node]) {
                    dist[v.node] = newDistance;
                }

                priorityQueue.add(new Node(v.node, dist[v.node]));
            }
        }
    }

    private class Node implements Comparator<Node> {
        public int node;
        public int cost;

        public Node() {}

        public Node(int node, int cost) {
            this.node = node;
            this.cost = cost;
        }

        @Override
        public int compare(Node node1, Node node2) {
            if (node1.cost < node2.cost) {
                return -1;
            }
            if (node1.cost > node2.cost) {
                return 1;
            }
            return 0;
        }
    }

    public static void main(String[] args) {
        DijkstraAlgorithm graph = new DijkstraAlgorithm(10);

        System.out.println("Dijkstra Result: ");
        graph.addEdge(0, 1, 5);
        graph.addEdge(0, 2, 1);
        graph.addEdge(1, 2, 2);
        graph.addEdge(1, 3, 4);
        graph.addEdge(2, 3, 1);
        graph.addEdge(2, 4, 3);
        graph.addEdge(3, 4, 2);
        graph.addEdge(3, 5, 5);
        graph.addEdge(4, 5, 6);

        graph.dijkstra(0);

        System.out.println("The shortest path from node 0 to node 5 is: " + graph.dist[5]);
    }
}
