package com.graph.bfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class BFS {
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