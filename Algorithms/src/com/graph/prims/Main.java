package com.graph.prims;

public class Main {

	public static void main(String[] args) {
		int[][] graph = {{0, 19, 3, 0, 0},
						{19, 0, 9, 19, 39},
						{3, 9, 0, 6, 66},
						{0, 19, 6, 0, 56},
						{0, 39, 66, 56, 0}};
		
		Prims prims = new Prims();
		prims.MST(graph);
	}
}