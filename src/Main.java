import Opgave01og02.EdgeListGraph;
import Opgave01og02.Graph;

public class Main {
    public static void main(String[] args) {

        EdgeListGraph graf = new EdgeListGraph();

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

//        System.out.println(graf.degree(6));
//        System.out.println(graf.incidentEdges(6));
//        System.out.println(graf.neighbors(6));
//
//        System.out.println(graf.neighbors(6).contains(66));
//        System.out.println(graf.neighbors(6).contains(38));
//

        System.out.println(findLargest(graf));
    }


    public static int findLargest(Graph graf) {
      return (int) graf.vertices().stream().max((a, b) -> (int) a - (int) b).get();
    }


}