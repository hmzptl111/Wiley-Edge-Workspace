package com.graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Graph {
	private int edges = 0;
	private Map<String, List<String>> map=new HashMap<String, List<String>>();
	
	public void addNewVertex(String str) {
		map.put(str, new LinkedList<String>());
	}
	
	public void addNewEdge(String source,String destination, boolean bidirectional) {
		if(!map.containsKey(source))
			addNewVertex(source);
		if(!map.containsKey(destination))
			addNewVertex(destination);
		map.get(source).add(destination);
		if(bidirectional)
			map.get(destination).add(source);
			edges++;
		edges++;
	}
	
	public int getNumberOfVertices() {
		return map.size();
	}
	
	public int getNumberOfEdges(String source) {
		return map.get(source).size();
	}
	
	public List<String> getConnectedEdges(String source) {
		return map.get(source);
	}
	
	//incorrect implementation
	public int getTotalNumberOfEdges() {
		return edges;
//		int count = 0;
//		for(String source: map.keySet()) {
//			count += map.get(source).size();
//		}
//		
//		return (count / 2);
	}
	
	@Override
	public String toString() {
		StringBuilder stringBuilder=new StringBuilder();
		for(String vertex:map.keySet()) {
			stringBuilder.append(vertex.toString()+" : ");
			for(String connectedVertex:map.get(vertex)) {
				stringBuilder.append(connectedVertex.toString()+" -> ");
			}
			stringBuilder.append("\n");
		}
		return(stringBuilder.toString());
	}	
}