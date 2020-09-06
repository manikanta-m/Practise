package com.problemsolving.practise.graph;

import java.util.LinkedList;

public class Graph {

	int v;
	LinkedList<Integer> adj[];

	Graph(int v) {
		this.v = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i) {
			
		}
	}

	void addNode(int value) {
		LinkedList<Integer> node = new LinkedList<Integer>();
		node.add(value);
	}

	public static void main(String[] args) {

	}
}
