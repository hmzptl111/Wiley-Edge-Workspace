package com.graph.kruskal;

public class Main {

	public static void main(String[] args) {
		Kruskal kruskal = new Kruskal(4, 5);
		
		//0 - 1 <-> 10
		kruskal.edges[0].source = 0;
		kruskal.edges[0].destination = 1;
		kruskal.edges[0].weight = 10;
  
        //0 - 2 <-> 6
		kruskal.edges[1].source = 0;
		kruskal.edges[1].destination = 2;
		kruskal.edges[1].weight = 6;
  
        //0 - 3 <->5
		kruskal.edges[2].source = 0;
		kruskal.edges[2].destination = 3;
		kruskal.edges[2].weight = 5;
  
        //1 - 3 <-> 15
		kruskal.edges[3].source = 1;
		kruskal.edges[3].destination = 3;
		kruskal.edges[3].weight = 15;
  
        //2 - 3 <-> 4
		kruskal.edges[4].source = 2;
		kruskal.edges[4].destination = 3;
		kruskal.edges[4].weight = 4;
		
		kruskal.MST();
	}
}