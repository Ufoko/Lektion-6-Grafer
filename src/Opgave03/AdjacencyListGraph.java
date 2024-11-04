package Opgave03;

import java.util.*;

/**
 * Adjacency list implementation of the graph interface.
 */
public class AdjacencyListGraph<V> implements Graph<V> {
    // List with all the vertices in the graph.
    private List<V> vertices;
    // Map with pairs containing (vertex, list of edges),
    // where list of edges is the incident edges to the vertex.
    // Note: Each edge is in 2 lists of incident edges.
    private Map<V, List<Edge<V>>> edges;

    //-----------------------------------------------------

    /**
     * Construct an empty AdjacencyListGraph.
     */
    public AdjacencyListGraph() {
        vertices = new ArrayList<>();
        edges = new LinkedHashMap<>();
    }

    /**
     * Return a list with the vertices in the graph.
     */
    @Override
    public List<V> vertices() {
        return new ArrayList<>(vertices);
    }

    /**
     * Return a list with the edges in the graph.
     */
    @Override
    public List<Edge<V>> edges() {


        Set<Edge> edgesSet = new HashSet<Edge>();
        for (List<Edge<V>> value : edges.values()) {
            for (Edge<V> vEdge : value) {
                edgesSet.add(vEdge);
            }
        }

        return new ArrayList<>(edgesSet);
    }

    /**
     * Return a list with the neighbors of the specified vertex.
     * Pre: The vertex is in the graph.
     */
    @Override
    public List<V> neighbors(V v) {
    assert vertices.contains(v);

        List<V> neighbourList = new ArrayList();
        for (Edge<V> incidentEdge : incidentEdges(v)) {
            if(incidentEdge.getU().equals(v)){
                neighbourList.add(incidentEdge.getV());
            }
            else {
                neighbourList.add(incidentEdge.getU());
            }
        }

        return neighbourList;
    }

    /**
     * Return the degree for the specified vertex.
     * Pre: The vertex is in the graph.
     */
    @Override
    public int degree(V v) {
        return incidentEdges(v).size();
    }

    /**
     * Return the incident edges to the specified vertex.
     * Pre: The vertex is in the graph.
     */
    @Override
    public List<Edge<V>> incidentEdges(V v) {
        assert vertices.contains(v);

        List<Edge<V>> edgeList = new ArrayList<>();
        for (Edge<V> edge : edges.get(v)) {
            edgeList.add(edge);
        }
        return edgeList;
    }

    /**
     * Return true, if the specified vertices are neighbors.
     * Pre: The vertices are vertices in the graph.
     */
    @Override
    public boolean areAdjacent(V u, V v) {

        for (Edge<V> incidentEdge : incidentEdges(u)) {
            if(incidentEdge.getU().equals(v)){
                return true;
            }
            else if(incidentEdge.getV().equals(v)){
                return true;
            }
        }
        return false;
    }


    /**
     * Print the vertices and the edges.
     */
    @Override
    public void printGraph() {
        for (V v : vertices) {
            List<Edge<V>> incidentEdges = edges.get(v);
            System.out.print("Vertex: " + v);
            System.out.println("\tIncident edges: " + incidentEdges);
        }
    }

    /**
     * Add a vertex to the graph.
     * Pre: The vertex is not in the graph before this addition.
     */
    @Override
    public void addVertex(V v) {
        assert !vertices.contains(v);

        vertices.add(v);

    }

    /**
     * Add an edge with the specified weight between the specified vertices to the graph.
     * Pre: Before addition, the vertices are in the graph, and the edge is not in the graph.
     * Pre: The weight is not negative.
     */
    @Override
    public Edge<V> addEdge(V u, V v, int weight) {
        // TODO
        return null;
    }

    /**
     * Add an edge with weight 0 between the specified vertices to the graph.
     * Pre: Before addition, the vertices are in the graph, and the edge is not in the graph.
     */
    @Override
    public Edge<V> addEdge(V u, V v) {
        // TODO
        return null;
    }


    /**
     * Remove the specified vertex from the graph.
     * Pre: The vertex is in the graph, and the vertex has no incident edges.
     */
    @Override
    public void removeVertex(V v) {
        // TODO
    }

    /**
     * Remove the edge between the specified vertices from the graph.
     * Pre: The vertices are vertices in the graph,
     * and The graph has an edge between the vertices.
     */
    @Override
    public void removeEdge(V u, V v) {
        // TODO
    }
}
