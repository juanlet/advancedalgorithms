package DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		Vertex vertex1 = new Vertex("1");
		Vertex vertex2 = new Vertex("2");
		Vertex vertex3 = new Vertex("3");
		Vertex vertex4 = new Vertex("4");
		Vertex vertex5 = new Vertex("5");

		Vertex vertex6 = new Vertex("6");
		Vertex vertex7 = new Vertex("7");
		Vertex vertex8 = new Vertex("8");
		Vertex vertex9 = new Vertex("9");
		Vertex vertex10 = new Vertex("10");


		//these is an unconnected graph with 2 clusters, it will print first the first set with 1 on the root and then the second set with 6 on the root
		//prints 1,2,3,4,5
		vertex1.addNeighbour(vertex2);
		vertex1.addNeighbour(vertex3);
		vertex3.addNeighbour(vertex4);
		vertex4.addNeighbour(vertex5);
		//prints 6,8,10,7,9
		vertex6.addNeighbour(vertex8);
		vertex6.addNeighbour(vertex9);
		vertex8.addNeighbour(vertex10);
		vertex10.addNeighbour(vertex7);
		
		List<Vertex> rootsList =  new ArrayList<Vertex>();
		
		rootsList.add(vertex1);
		rootsList.add(vertex6);
		
		DFS dfs = new DFS(rootsList);
	
	}
	
}
