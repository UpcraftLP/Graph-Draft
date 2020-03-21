package com.github.upcraftlp.graphdraft.impl;

import com.github.upcraftlp.graphdraft.api.Edge;
import com.github.upcraftlp.graphdraft.api.Node;
import com.github.upcraftlp.graphdraft.util.Util;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class NodeImpl implements Node {

    protected final Set<Edge> edges = new HashSet<>();
    private final Queue<Packet> nextOperationsQueue = new ArrayDeque<>();
    private final Queue<Packet> currentOperationsQueue = new ArrayDeque<>();
    @Nullable
    private GraphImpl graph;

    void processQueues() {
        currentOperationsQueue.forEach(packet -> {
            if(packet.waitTime++ >= packet.nextEdge.getWeight()) {
                packet.setNode(getNextNode(packet.end));
            }
        });
        currentOperationsQueue.addAll(nextOperationsQueue);
        nextOperationsQueue.clear();
    }

    private NodeImpl getNextNode(NodeImpl end) {
        throw Util.unfinished();
    }

    List<EdgeImpl> getConnection(NodeImpl start, NodeImpl target, int requiredOperations) {
        throw Util.unfinished();
    }

    @Nullable
    public GraphImpl getGraph() {
        return graph;
    }

    public void setGraph(@Nullable GraphImpl graph) {
        this.graph = graph;
    }

    @Override
    public Set<Edge> getEdges() {
        return edges;
    }
}
