package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

class Graph {
	Map<String, List<String>> adjacencyList = new HashMap<>();
	
	private void addVertex(String vertex) {
		if(adjacencyList.containsKey(vertex)) return;
		
		adjacencyList.put(vertex, new ArrayList<>());
	}
	
	public void addEdge(String source, String destination) {
		if(!adjacencyList.containsKey(source)) {
			addVertex(source);
		}
		if(!adjacencyList.containsKey(destination)) {
			addVertex(destination);
		}
		
		adjacencyList.get(source).add(destination);
	}
	
	public void BFS(String vertex) {
		Stack<String> visitedVertices = new Stack<String>();
		Queue<String> connectedVertices = new LinkedList<>();
		visitedVertices.add(vertex);
		connectedVertices.add(vertex);
		
		while(!connectedVertices.isEmpty()) {
			vertex = connectedVertices.poll();
			
			for(String connectedVertex: adjacencyList.get(vertex)) {
				if(!visitedVertices.contains(connectedVertex)) {
					visitedVertices.add(connectedVertex);
					connectedVertices.add(connectedVertex);
				}
			}
		}
		
		for(String vertexInBFS: visitedVertices) {
			System.out.print(vertexInBFS + " ");
		}
	}
}

public class BFS {

	public static void main(String[] args) {
		Graph graph = new Graph();
		
		graph.addEdge("A", "B");
		graph.addEdge("A", "C");
		graph.addEdge("A", "D");
		
		graph.addEdge("B", "A");
		graph.addEdge("B", "E");
		graph.addEdge("B", "F");
		
		graph.addEdge("C", "A");
		graph.addEdge("C", "F");
		
		graph.addEdge("D", "A");
		
		graph.addEdge("E", "B");
		
		graph.addEdge("F", "B");
		graph.addEdge("F", "C");
		
		graph.BFS("A");
	}
}