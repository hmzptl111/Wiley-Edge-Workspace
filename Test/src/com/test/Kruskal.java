package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//comment Vertex class in Kruskal.java to avoid naming clash
//reason: same class name in same package
class Vertex {
	String label;

	public Vertex(String label) {
		this.label = label;
	}
	
	@Override
	public String toString() {
		return label;
	}
}

class Edge implements Comparable<Edge> {
	private Vertex vertex1, vertex2;
	int weight;

	public Edge(Vertex vertex1, Vertex vertex2, int weight) {
		this.vertex1 = vertex1;
		this.vertex2 = vertex2;
		this.weight = weight;
	}
	
	public Vertex getVertex1() {
		return vertex1;
	}

	public Vertex getVertex2() {
		return vertex2;
	}
	
	@Override
	public int compareTo(Edge otherEdge) {
		if(this.weight <= otherEdge.weight) return -1;
		return 1;
	}
	
	@Override
	public String toString() {
		return vertex1.label + " - " + vertex2.label + "(" + weight + ")";
	}
}

class DisjointSet {
	private Vertex parent;
	private int rank;
	
	public DisjointSet(Vertex parent) {
		setParent(parent);
	}
	
	public Vertex getParent() {
		return parent;
	}

	public int getRank() {
		return rank;
	}
	
	public void setParent(Vertex parent) {
		this.parent = parent;
		this.rank = 0;
	}
	
	public void incrementRank() {
		rank++;
	}
}

public class Kruskal {
	private int noOfVerticesInGraph, noOfEdgesInGraph;
	private List<Vertex> verticesInGraph = new ArrayList<>();
	private List<Edge> edgesInGraph = new ArrayList<>();
	private List<DisjointSet> verticesInDisjointSet = new ArrayList<>();

	public Kruskal(int noOfVerticesInGraph, int noOfEdgesInGraph) {
		this.noOfVerticesInGraph = noOfVerticesInGraph;
		this.noOfEdgesInGraph = noOfEdgesInGraph;
	}
	
	public List<Edge> getEdges() {
		return edgesInGraph;
	}
	
	public Vertex addVertex(String label) {
		Vertex vertex = new Vertex(label);
		verticesInGraph.add(vertex);
		verticesInDisjointSet.add(new DisjointSet(vertex));
		return vertex;
	}

	public Edge addEdge(Vertex v1, Vertex v2, int weight) {
		Edge edge = new Edge(v1, v2, weight);
		edgesInGraph.add(edge);
		return edge;
	}
	
	public void sortEdges() {
		Collections.sort(edgesInGraph);
	}
	
	public Vertex findRoot(Vertex vertex) {
		int index = verticesInGraph.indexOf(vertex);
		Vertex parent = verticesInDisjointSet.get(index).getParent();
		if(parent.equals(vertex)) {
			return parent;
		} else {
			findRoot(parent);
		}
		return null;
	}
	
	public Vertex pathCompressedFindRoot(Vertex vertex) {
		int index = verticesInGraph.indexOf(vertex);
		DisjointSet currentVertexInDisjointSet = verticesInDisjointSet.get(index);
		Vertex parent = currentVertexInDisjointSet.getParent();
		if(parent.equals(vertex)) {
			return parent;
		} else {
			Vertex root = findRoot(parent);
			currentVertexInDisjointSet.setParent(root);
			return root;
		}
	}
	
	public void unionByRank(Vertex rootOfGroup1, Vertex rootOfGroup2) {
		int index1 = verticesInGraph.indexOf(rootOfGroup1);
		int index2 = verticesInGraph.indexOf(rootOfGroup2);

		DisjointSet disjointSetOfRoot1 = verticesInDisjointSet.get(index1);
		DisjointSet disjointSetOfRoot2 = verticesInDisjointSet.get(index2);
		
		int rankOfDisjointSet1 = disjointSetOfRoot1.getRank();
		int rankOfDisjointSet2 = disjointSetOfRoot1.getRank();
		
		if(rankOfDisjointSet1 < rankOfDisjointSet2) {
			disjointSetOfRoot1.setParent(rootOfGroup2);
		} else {
			disjointSetOfRoot2.setParent(rootOfGroup1);
			if(rankOfDisjointSet1 == rankOfDisjointSet2) {
				disjointSetOfRoot1.incrementRank();
			}
		}
	}
	
	public boolean detectCycle(Vertex vertex1, Vertex vertex2) {
		int index1 = verticesInGraph.indexOf(vertex1);
		int index2 = verticesInGraph.indexOf(vertex2);
		Vertex root1 = verticesInDisjointSet.get(index1).getParent();
		Vertex root2 = verticesInDisjointSet.get(index2).getParent();
		
		if(root1.equals(root2)) {
			return true;
		} else {
			unionByRank(root1, root2);
			return false;
		}
	}
	
	public void MST() {
		for(int i = 0; i < noOfVerticesInGraph; i++) {
			System.out.println(verticesInDisjointSet.get(i).getParent());
		}
	}

	public static void main(String[] args) {
		int noOfVerticesInGraph = 5, noOfEdgesInGraph = 8;
		Kruskal kruskal = new Kruskal(noOfVerticesInGraph, noOfEdgesInGraph);
		
		Vertex A = kruskal.addVertex("A");
		Vertex B = kruskal.addVertex("B");
		Vertex C = kruskal.addVertex("C");
		Vertex D = kruskal.addVertex("D");
		Vertex E = kruskal.addVertex("E");
		
		kruskal.addEdge(A, B, 9);
		kruskal.addEdge(A, C, 75);

		kruskal.addEdge(B, C, 95);
		kruskal.addEdge(B, D, 19);
		kruskal.addEdge(B, E, 42);

		kruskal.addEdge(C, D, 51);
		kruskal.addEdge(C, E, 66);

		kruskal.addEdge(D, E, 31);


		kruskal.sortEdges();
		
		List<Edge> MST = new ArrayList<>();
		int indexForEdges = 0;
		int noOfEdgesInMST = 0;
		while(noOfEdgesInMST < noOfVerticesInGraph - 1) {
			Edge edge = kruskal.edgesInGraph.get(indexForEdges++);
			
			Vertex vertex1 = kruskal.pathCompressedFindRoot(edge.getVertex1());
			Vertex vertex2 = kruskal.pathCompressedFindRoot(edge.getVertex2());
			if(!kruskal.detectCycle(vertex1, vertex2)) {
				MST.add(edge);
				noOfEdgesInMST++;
			}
		}
		
		for(Edge edge: MST) {
			System.out.println(edge);
		}
	}
}