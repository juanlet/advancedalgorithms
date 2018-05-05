package BreadthFirstSearch;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

	private Queue<Vertex> queue = new LinkedList<Vertex>();
	
	private Vertex treeRoot;

	public BFS(Vertex rootNode) {
		this.treeRoot = rootNode;
	}
	
	
	public void execute() {
		
		//do it for the first time on the root
		
		//add root node to queue
		
		this.queue.add(this.treeRoot);
		
		while (!this.queue.isEmpty()) {
			//take one element from the queue
			Vertex currNode = this.queue.remove();
			
			//mark node as visited
			currNode.setVisited(true);
			
			
			//add root neighbours to queue
			this.addAllCurrentNodeNeighboursToQueue(currNode.getNeighbourList());	
			
			System.out.println(currNode.toString());
						
            
        }
		

	}
	
	private void addAllCurrentNodeNeighboursToQueue(List<Vertex> vertexList) {
		  
		for(Vertex vertex: vertexList) {
			if(!vertex.isVisited()) {
			this.queue.add(vertex);
			vertex.setVisited(true);
			}
		}
	}
	
	

}
