package BreadthFirstSearch;


import java.util.ArrayList;
import java.util.List;

public class App {
	
	  public static void main(String[] args){
		  
	
		  
		//creating the tree  
		  
		//ROOT LEVEL  
		  Vertex aNode = new Vertex(1);  
	  
		  List<Vertex> aList = new ArrayList<Vertex>();
		  
		  
		  Vertex bNode = new Vertex(2);
		  
		  Vertex cNode = new Vertex(3);
		  
		  aList.add(bNode);
		  aList.add(cNode);
		  
		  aNode.setNeighbourList(aList);
		  
		  //SECOND LEVEL
		  //b node own list
		  
		  List<Vertex> bList = new ArrayList<Vertex>();
		  
		  //CREATING THIRD LEVEL NODES for b
		  Vertex dNode = new Vertex(4);
		  
		  Vertex eNode = new Vertex(5);
		  
		  Vertex fNode = new Vertex(6);
		  
		  bList.add(dNode);
		  
		  bList.add(eNode);
		  
		  bList.add(fNode);
		  
		  bNode.setNeighbourList(bList);
		  
		  //c node own list
		  
		  List<Vertex> cList = new ArrayList<Vertex>();
		  
		  //CREATING THIRD LEVEL NODES for c
		  
		  Vertex gNode = new Vertex(7);
		  
		  Vertex hNode = new Vertex(8);
		  
		  Vertex iNode = new Vertex(9);
		  
		  cList.add(gNode);
		  
		  cList.add(hNode);
		  
		  cList.add(iNode);
		  
		  cNode.setNeighbourList(cList);
		  
			//instantiating BFS algorithm class with the created tree structure
		  
		 BFS bfs= new BFS(aNode);  
		   //execute bfs algorithm
		 bfs.execute();	 
		  
	    }
	
}
