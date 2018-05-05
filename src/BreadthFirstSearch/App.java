package BreadthFirstSearch;


import java.util.ArrayList;
import java.util.List;

public class App {
	
	  public static void main(String[] args){
		  
	
		  
		//creating the tree  
		  
		//ROOT LEVEL  
		  Vertex aNode = new Vertex(1);  
	  
 
		  
		  Vertex bNode = new Vertex(2);
		  
		  Vertex cNode = new Vertex(3);
		  
		  aNode.addNeighbourVertex(bNode);
		  aNode.addNeighbourVertex(cNode);
		 
		  
		  //SECOND LEVEL
		  //b node own list
		  
		  
		  //CREATING THIRD LEVEL NODES for b
		  Vertex dNode = new Vertex(4);
		  
		  Vertex eNode = new Vertex(5);
		  
		  Vertex fNode = new Vertex(6);
		  
		  bNode.addNeighbourVertex(dNode);
		  bNode.addNeighbourVertex(eNode);
		  bNode.addNeighbourVertex(fNode);
		  
		  //c node own list
		  
		  		  
		  //CREATING THIRD LEVEL NODES for c
		  
		  Vertex gNode = new Vertex(7);
		  
		  Vertex hNode = new Vertex(8);
		  
		  Vertex iNode = new Vertex(9);
		  
		  cNode.addNeighbourVertex(gNode);
		  cNode.addNeighbourVertex(hNode);
		  cNode.addNeighbourVertex(iNode);
		  
		  
			//instantiating BFS algorithm class with the created tree structure
		  
		 BFS bfs= new BFS(aNode);  
		   //execute bfs algorithm
		 bfs.execute();	 
		  
	    }
	
}
