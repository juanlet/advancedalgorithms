package DepthFirstSearch;

import java.util.List;
import java.util.Stack;

public class DFS {
	
	Vertex root;
	Stack<Vertex> stack = new Stack<Vertex>();

	
	public DFS(List<Vertex> list) {
		//I need this for for when I have disconnected multiple graphs to be able to visit all the vertexes of the different groups on a single run
		for(Vertex vertex: list) {
			if(!vertex.isVisited()) {
				execute(vertex);
			}
		}
	}
	
	public void execute(Vertex currVertex) {
		
		  currVertex.setVisited(true);
		  
		  System.out.println(currVertex.toString());
		  
		   List<Vertex> neighbourList = currVertex.getNeighbourList();

			 if(!neighbourList.isEmpty()) {

				  for(Vertex vertex: currVertex.getNeighbourList()) {
						 if(!vertex.isVisited()) {
							 
							 this.execute(vertex);
							 
						 }
					  }
		  
			 }
		
		
	}
	


}

