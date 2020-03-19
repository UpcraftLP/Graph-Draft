package com.github.upcraftlp.graphdraft.impl;

import com.github.upcraftlp.graphdraft.api.Node;
import com.github.upcraftlp.graphdraft.util.Util;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class NodeImpl implements Node {

    @Nullable
    private GraphImpl graph;
    protected Set<EdgeImpl> edges;
    private final Queue<Packet> nextOperationsQueue = new ArrayDeque<>();
    private final Queue<Packet> currentOperationsQueue = new ArrayDeque<>();

    void processQueues() {
        currentOperationsQueue.forEach(packet -> {
            if(packet.waitTime++ >= packet.nextEdge.getWeight()) {
                packet.setNode(getNextNode(packet.end));
            }
        });
        currentOperationsQueue.addAll(nextOperationsQueue);
        nextOperationsQueue.clear();
    }

    List<EdgeImpl> getConnection(NodeImpl start, NodeImpl target, int requiredOperations) {
        throw Util.unfinished();
    }

    private NodeImpl getNextNode(NodeImpl end) {
        throw  Util.unfinished();
    }

    @Nullable
    public GraphImpl getGraph() {
        return graph;
    }

    public void setGraph(@Nullable GraphImpl graph) {
        this.graph = graph;
    }

    @Override
    public Set<EdgeImpl> getEdges() {
        return edges != null ? edges : Collections.emptySet();
    }
}
