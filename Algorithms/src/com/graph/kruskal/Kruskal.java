package com.graph.kruskal;

import java.util.Arrays;

public class Kruskal {
	private int v, e;
	public Edge[] edges;
	
	public Kruskal(int v, int e) {
		this.v = v;
		this.e = e;
		edges = new Edge[e];
		for(int i = 0; i < e; i++) {
			edges[i] = new Edge();
		}
	}
	
	public class Edge implements Comparable<Edge> {
		public int source, destination, weight;

		@Override
		public int compareTo(Edge otherEdge) {
			return this.weight - otherEdge.weight;
		}
	}
	
	private class Subset {
		int parent, rank;
	}
	
	private int find(Subset[] subsets, int i) {
        if (subsets[i].parent != i) {
        	subsets[i].parent = find(subsets, subsets[i].parent);	        	
        }
  
        return subsets[i].parent;
    }
	
	private void union(Subset[] subsets, int x, int y) {
        int xroot = find(subsets, x);
        int yroot = find(subsets, y);
  
        if (subsets[xroot].rank < subsets[yroot].rank) {
        	subsets[xroot].parent = yroot;
        } else if (subsets[xroot].rank > subsets[yroot].rank) {
        	subsets[yroot].parent = xroot;
        } else {
            subsets[yroot].parent = xroot;
            subsets[xroot].rank++;
        }
    }
	
	public void MST() {
		Edge[] mst = new Edge[v];
		for(int i = 0; i < v; i++) {
			mst[i] = new Edge();
		}
		
		Arrays.sort(edges);
		
		Subset[] subsets = new Subset[v];
		for(int i = 0; i < v; i++) {
			subsets[i] = new Subset();
			subsets[i].parent = i;
			subsets[i].rank = 0;
		}
		
		int i = e = 0;
		while(e < v - 1) {
			Edge currentEdge = edges[i];
			i++;
			
			int x = find(subsets, currentEdge.source);
			int y = find(subsets, currentEdge.destination);
			if(x != y) {
				mst[e] = currentEdge;
				e++;
				union(subsets, x, y);
			}
		}
		
		int minimumCost = 0;
		for(int j = 0; j < e; j++) {
			System.out.println(mst[j].source + ", " + mst[j].destination + ": " + mst[j].weight);
			minimumCost += mst[j].weight;
		}
		System.out.println("Minimum cost: " + minimumCost);
	}
}
