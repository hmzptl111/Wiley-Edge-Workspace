//package com.test;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
////comment Vertex class in Kruskal.java to avoid naming clash
////reason: same class name in same package
//class Vertex {
//	private String label;
//	private Map<Vertex, Integer> connectedVertices = new HashMap<>();
//	
//	public Vertex(String label) {
//		this.label = label;
//	}
//	
//	public String getLabel() {
//		return label;
//	}
//	
//	public Map<Vertex, Integer> getConnectedVertices() {
//		return connectedVertices;
//	}
//	
//	public void addEdge(Vertex vertex, int weight) {
//		if(!connectedVertices.containsKey(vertex)) {
//			connectedVertices.put(vertex, weight);
//		}
//	}
//}
//
//public class Prims {
//
//	public static void main(String[] args) {
//		List<Vertex> verticesInGraph = new ArrayList<>();
//		
//		//vertex labels must be unique
//		Vertex A = new Vertex("A");
//		Vertex B = new Vertex("B");
//		Vertex C = new Vertex("C");
//		Vertex D = new Vertex("D");
//		Vertex E = new Vertex("E");
//		
//		verticesInGraph.add(A);
//		verticesInGraph.add(B);
//		verticesInGraph.add(C);
//		verticesInGraph.add(D);
//		verticesInGraph.add(E);
//		
//		A.addEdge(B, 9);
//		A.addEdge(C, 75);
//		
//		B.addEdge(A, 9);
//		B.addEdge(C, 95);
//		B.addEdge(D, 19);
//		B.addEdge(E, 42);
//		
//		C.addEdge(A, 75);
//		C.addEdge(B, 95);
//		C.addEdge(D, 51);
//		C.addEdge(E, 66);
//		
//		D.addEdge(B, 19);
//		D.addEdge(C, 51);
//		D.addEdge(E, 31);
//		
//		E.addEdge(B, 42);
//		E.addEdge(C, 66);
//		E.addEdge(D, 31);
//		
//		int noOfVerticesInGraph = 5;
//		int noOfEdgesInMST = 0;
//		Map<Vertex, Integer> verticesInMST = new HashMap<>();
//		verticesInMST.put(A, 0);
//		
//		while(noOfEdgesInMST < noOfVerticesInGraph - 1) {
//			int minimumWeight = Integer.MAX_VALUE;
//			Vertex connectedVertexWithMinimumWeightedEdge = null;
//			
//			for(Vertex vertex: verticesInMST.keySet()) {
//				for(Vertex connectedVertex: vertex.getConnectedVertices().keySet()) {
//					if(!verticesInMST.keySet().contains(connectedVertex) && vertex.getConnectedVertices().get(connectedVertex) < minimumWeight) {
//						minimumWeight = vertex.getConnectedVertices().get(connectedVertex);
//						connectedVertexWithMinimumWeightedEdge = connectedVertex;
//					}
//				}
//			}
//			verticesInMST.put(connectedVertexWithMinimumWeightedEdge, minimumWeight);
//			noOfEdgesInMST++;
//		}
//		
//		for(Vertex vertex: verticesInMST.keySet()) {
//			System.out.println(vertex.getLabel() + " " + verticesInMST.get(vertex));
//		}
//	}
//}