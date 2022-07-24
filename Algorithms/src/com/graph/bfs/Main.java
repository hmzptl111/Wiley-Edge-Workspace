package com.graph.bfs;

public class Main {

	public static void main(String[] args) {
		BFS bfs = new BFS();
		
		bfs.addEdge("A", "B");
		bfs.addEdge("A", "C");
		bfs.addEdge("A", "D");
		
		bfs.addEdge("B", "A");
		bfs.addEdge("B", "E");
		bfs.addEdge("B", "F");
		
		bfs.addEdge("C", "A");
		bfs.addEdge("C", "F");
		
		bfs.addEdge("D", "A");
		
		bfs.addEdge("E", "B");
		
		bfs.addEdge("F", "B");
		bfs.addEdge("F", "C");
		
		bfs.BFS("A");
	}
}