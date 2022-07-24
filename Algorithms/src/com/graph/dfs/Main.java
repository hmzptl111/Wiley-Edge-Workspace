package com.graph.dfs;

public class Main {

	public static void main(String[] args) {
		DFS dfs = new DFS();
		
		dfs.addEdge("A", "B");
		dfs.addEdge("A", "C");
		dfs.addEdge("A", "D");
		
		dfs.addEdge("B", "A");
		dfs.addEdge("B", "E");
		dfs.addEdge("B", "F");
		
		dfs.addEdge("C", "A");
		dfs.addEdge("C", "F");
		
		dfs.addEdge("D", "A");
		
		dfs.addEdge("E", "B");
		
		dfs.addEdge("F", "B");
		dfs.addEdge("F", "C");
		
		dfs.DFS("A");
	}
}