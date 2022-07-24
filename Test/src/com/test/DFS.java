//package com.test;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//class Graph {
//	Map<String, List<String>> adjacencyList = new HashMap<>();
//	List<String> visitedVertices = new ArrayList<>();
//	
//	private void addVertex(String vertex) {
//		if(adjacencyList.containsKey(vertex)) return;
//		
//		adjacencyList.put(vertex, new ArrayList<>());
//	}
//	
//	public void addEdge(String source, String destination) {
//		if(!adjacencyList.containsKey(source)) {
//			addVertex(source);
//		}
//		if(!adjacencyList.containsKey(destination)) {
//			addVertex(destination);
//		}
//		
//		adjacencyList.get(source).add(destination);
//	}
//	
//	private void depthFirstSearch(String vertex) {
//		visitedVertices.add(vertex);
//		
//		for(String connectedVertex: adjacencyList.get(vertex)) {
//			if(!visitedVertices.contains(connectedVertex)) {
//				depthFirstSearch(connectedVertex);
//			}
//		}		
//	}
//	
//	public void DFS(String vertex) {
//		depthFirstSearch(vertex);
//		
//		for(String vertexInDFS: visitedVertices) {
//			System.out.print(vertexInDFS + " ");
//		}
//	}
//}
//
//
//public class DFS {
//
//	public static void main(String[] args) {
//		Graph graph = new Graph();
//		
//		graph.addEdge("A", "B");
//		graph.addEdge("A", "C");
//		graph.addEdge("A", "D");
//		
//		graph.addEdge("B", "A");
//		graph.addEdge("B", "E");
//		graph.addEdge("B", "F");
//		
//		graph.addEdge("C", "A");
//		graph.addEdge("C", "F");
//		
//		graph.addEdge("D", "A");
//		
//		graph.addEdge("E", "B");
//		
//		graph.addEdge("F", "B");
//		graph.addEdge("F", "C");
//		
//		graph.DFS("A");
//	}
//}