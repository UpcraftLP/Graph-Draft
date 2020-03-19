package com.github.upcraftlp.graphdraft.impl;

import com.github.upcraftlp.graphdraft.api.Edge;
import com.github.upcraftlp.graphdraft.api.Graph;
import com.github.upcraftlp.graphdraft.api.Node;
import com.github.upcraftlp.graphdraft.util.Util;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class GraphImpl implements Graph {

    private final Set<Node> nodes = new LinkedHashSet<>();
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

    @Override
    public List<Edge> findConnection(NodeImpl start, NodeImpl target, int requiredCapacity) {
        throw Util.unfinished();
    }

    @Override
    public void processQueue() {
        for(Node node : nodes) {
            ((NodeImpl) node).processQueues();
        }
    }
}
