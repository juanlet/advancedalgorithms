package DIjkstraAlgorithm;

public class App {
	
public static void main(String[] args) {
	
	Vertex vertex0 = new Vertex("A");
	Vertex vertex1 = new Vertex("B");
	Vertex vertex2 = new Vertex("C");
	Vertex vertex3 = new Vertex("D");
	Vertex vertex4 = new Vertex("E");

	vertex0.addNeighbour(new Edge(3, vertex0,vertex1));
	vertex0.addNeighbour(new Edge(1, vertex0,vertex2));
	vertex0.addNeighbour(new Edge(4, vertex0,vertex3));
	vertex1.addNeighbour(new Edge(1, vertex1,vertex4));
	vertex2.addNeighbour(new Edge(2, vertex2,vertex4));
	vertex3.addNeighbour(new Edge(100, vertex3,vertex4));

	DIjkstraAlgorithm algorithm = new DIjkstraAlgorithm();
	algorithm.computePaths(vertex0);
	
	System.out.println(algorithm.getShortestPathTo(vertex4));
	
	
}
	
	

}
