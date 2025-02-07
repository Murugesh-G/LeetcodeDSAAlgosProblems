package com.mgleetcode.graph;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    private Map<Integer, List<Integer>> adjList;

    public Graph(){
        adjList=new HashMap<>();
    }

    public void addNode(int node){
        adjList.putIfAbsent(node, new ArrayList<>());
    }




}
