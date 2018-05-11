package DIjkstraAlgorithm;

public class App {
	
public static void main(String[] args) {
	
	Vertex vertex0 = new Vertex("A");
	Vertex vertex1 = new Vertex("B");
	Vertex vertex2 = new Vertex("C");
	Vertex vertex3 = new Vertex("D");
	Vertex vertex4 = new Vertex("E");
	Vertex vertex5 = new Vertex("F");
	Vertex vertex6 = new Vertex("G");
	Vertex vertex7 = new Vertex("H");

	vertex0.addNeighbour(new Edge(3, vertex0,vertex1));
	vertex0.addNeighbour(new Edge(1, vertex0,vertex2));
	vertex0.addNeighbour(new Edge(2, vertex0,vertex3));
	vertex1.addNeighbour(new Edge(200, vertex1,vertex4));
	vertex2.addNeighbour(new Edge(100, vertex2,vertex5));
	vertex3.addNeighbour(new Edge(2, vertex3,vertex6));
	vertex4.addNeighbour(new Edge(30, vertex1,vertex7));
	vertex5.addNeighbour(new Edge(10, vertex1,vertex7));
	vertex6.addNeighbour(new Edge(5, vertex1,vertex7));

	DIjkstraAlgorithm algorithm = new DIjkstraAlgorithm();
	algorithm.computePaths(vertex0);
	
	System.out.println(algorithm.getShortestPathTo(vertex7));
	
	
}
	
	

}
