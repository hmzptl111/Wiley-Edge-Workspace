package com.graph.prims;

public class Prims {
	public void MST(int[][] graph) {
		int noOfVerticesInGraph = graph.length;
		boolean[] selectedVertices = new boolean[noOfVerticesInGraph];
		
		selectedVertices[0] = true;
		int noOfEdgesSelected = 0;
		
		while(noOfEdgesSelected < (noOfVerticesInGraph - 1)) {
			int min = Integer.MAX_VALUE;
			int row = 0, column = 0;
			
			for(int i = 0; i < noOfVerticesInGraph; i++) {
				if(selectedVertices[i]) {
					for(int j = 0; j < noOfVerticesInGraph; j++) {
						if(!selectedVertices[j] && graph[i][j] != 0) {
							if(min > graph[i][j]) {
								min = graph[i][j];
								row = i;
								column = j;
							}
						}
					}
				}
			}
			
			System.out.println(row + ", " + column + ": " + graph[row][column]);
			selectedVertices[column] = true;
			noOfEdgesSelected++;
		}
	}
}
