package com.github.upcraftlp.graphdraft.impl;

import com.github.upcraftlp.graphdraft.api.Edge;
import com.github.upcraftlp.graphdraft.api.Graph;
import com.github.upcraftlp.graphdraft.api.Node;
import com.github.upcraftlp.graphdraft.util.Pair;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class GraphImpl implements Graph {

    private final Set<Node> nodes = new LinkedHashSet<>();
    private final Map<Pair<Node, Node>, List<Edge>> connectionCache = new HashMap<>();
    private UUID id;

    @Override
    public UUID getId() {
        if(id == null) {
            id = UUID.randomUUID();
        }
        return id;
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public Set<Node> getNodes() {
        return nodes;
    }

    public Set<Edge> getConnections(Node n, boolean bidirectional) {
        return n.getEdges();
    }

    @Override
    public void processQueue() {
        for(Node node : nodes) {
            ((NodeImpl) node).processQueues();
        }
    }

    public List<Edge> findConnection(Node start, Node target, int requiredCapacity) {
        return Collections.emptyList(); //no connection found
    }

//    @Override
//    public boolean findConnection(List<Edge> path, Node start, Node target, int requiredCapacity) {
//        Pair<Node, Node> pair = new Pair<>(start, target);
//        if(connectionCache.containsKey(pair)) {
//            path.addAll(connectionCache.get(pair));
//            return true;
//        }
//        else {
//            for(Edge edge : start.getEdges()) {
//                Node currentTarget = edge.getLeft() == start ? edge.getRight() : edge.isBidirectional() ? edge.getLeft() : null;
//                if(currentTarget != null && !path.contains(edge)) {
//                    if(currentTarget == target || findConnection(path, currentTarget, target, requiredCapacity)) {
//                        path.add(edge);
//                        connectionCache.put(pair, new ArrayList<>(path));
//                        return true;
//                    }
//                }
//            }
//        }
//        return false;
//    }

    protected void mergeWith(Graph other) {
    }
}
