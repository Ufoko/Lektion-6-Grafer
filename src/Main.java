import opgaver.Graf;
import opgaver.Opgave01og02.EdgeListGraph;
import opgaver.Opgave01og02.Graph;
import opgaver.Opgave03.AdjacencyListGraph;

public class Main {
    public static void main(String[] args) {

      //  opgave1og02();

      //  opgave3();

        opgave3String();

    }

    private static void opgave3String() {
        AdjacencyListGraph graf =  new AdjacencyListGraph();

        graf.addVertex("Pølsemanden");
        graf.addVertex("Aarhus");
        graf.addVertex("Århus");
        graf.addVertex("66");
        graf.addVertex("6");

        graf.addEdge("Pølsemanden", "Aarhus", 10);
        graf.addEdge("Pølsemanden", "6", 23);
        graf.addEdge("Pølsemanden", "66", 90);
        graf.addEdge("6", "66", 8);
        graf.addEdge("6", "Århus", 7);
        graf.addEdge("66", "Århus", 76);
        graf.addEdge("Århus", "Aarhus", 55);
        graf.addEdge("Aarhus", "66", 2);


//        graf.removeEdge("66","Pølsemanden");
//        graf.removeEdge("Pølsemanden","6");
//        graf.removeEdge("Pølsemanden","Aarhus");
//     //   graf.removeVertex("Pølsemanden");

        graf.printGraph();


        System.out.println(graf.degree("6"));
        System.out.println(graf.incidentEdges("6"));
        System.out.println(graf.neighbors("6"));

        System.out.println(graf.neighbors("6").contains("66"));
        System.out.println(graf.neighbors("6").contains("Aarhus"));


        System.out.println(findLargest(graf));



    }

    private static void opgave3() {
        AdjacencyListGraph<Integer> graf = new AdjacencyListGraph();

        graf.addVertex(15);
        graf.addVertex(38);
        graf.addVertex(123);
        graf.addVertex(66);
        graf.addVertex(6);

        graf.addEdge(15, 38, 10);
        graf.addEdge(15, 6, 23);
        graf.addEdge(15, 66, 90);
        graf.addEdge(6, 66, 8);
        graf.addEdge(6, 123, 7);
        graf.addEdge(66, 123, 76);
        graf.addEdge(123, 38, 55);
        graf.addEdge(38, 66, 2);


        graf.removeEdge(66,15);
        graf.removeEdge(15,6);
        graf.removeEdge(15,38);
        graf.removeVertex(15);

        graf.printGraph();


        System.out.println(graf.degree(6));
        System.out.println(graf.incidentEdges(6));
        System.out.println(graf.neighbors(6));

        System.out.println(graf.neighbors(6).contains(66));
        System.out.println(graf.neighbors(6).contains(38));


        System.out.println(findLargest(graf));


    }

    private static void opgave1og02() {
        EdgeListGraph<Integer> graf = new EdgeListGraph();

        graf.addVertex(15);
        graf.addVertex(38);
        graf.addVertex(123);
        graf.addVertex(66);
        graf.addVertex(6);

        graf.addEdge(15, 38, 10);
        graf.addEdge(15, 6, 23);
        graf.addEdge(15, 66, 90);
        graf.addEdge(6, 66, 8);
        graf.addEdge(6, 123, 7);
        graf.addEdge(66, 123, 76);
        graf.addEdge(123, 38, 55);
        graf.addEdge(48, 66, 2);


        graf.removeEdge(66,15);
        graf.removeEdge(15,6);
        graf.removeEdge(15,38);
        graf.removeVertex(15);

        graf.printGraph();

        System.out.println(graf.degree(6));
        System.out.println(graf.incidentEdges(6));
        System.out.println(graf.neighbors(6));

        System.out.println(graf.neighbors(6).contains(66));
        System.out.println(graf.neighbors(6).contains(38));


        System.out.println(findLargest(graf));
    }


//    public static int findLargest(Graf graf) {
//      return (int) graf.vertices().stream().max(Comparable::compareTo).get();
//    }

    public static <V extends Comparable<V>> V findLargest(Graf<V> graf){
        return graf.vertices().stream().max((a, b) -> a.compareTo(b)).get();
    }


}