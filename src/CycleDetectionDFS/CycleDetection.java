package CycleDetectionDFS;

import java.util.List;

public class CycleDetection {
   
	public void detectCycle(List<Vertex> vertexList) {

		for(Vertex v : vertexList)
			if( !v.isVisited())
				dfs(v);
		
	}

	private void dfs(Vertex vertex) {
		// TODO Auto-generated method stub
		
		System.out.println("DFS on vertex"+vertex);
		vertex.setBeingVisited(true);
		
		System.out.println("Visiting the neighbours of vertex "+vertex);

		for(Vertex v : vertex.getAdjacenciesList()) {
			
			
			if(v.isBeingVisited()) {
				System.out.println("There is a backward edge: so there is a cycle!!!!");
				return;
			}

			if(!v.isVisited()){
				System.out.println("Visiting vertex "+v+" recursively.");
				v.setVisited(true);
				dfs(v);
			}
			
		}
		
		System.out.println("Set vertex "+vertex+" setBeingVisited(false) and visited(true)...");
		vertex.setBeingVisited(false);
		vertex.setVisited(true);		
	}
	
	
	
}
