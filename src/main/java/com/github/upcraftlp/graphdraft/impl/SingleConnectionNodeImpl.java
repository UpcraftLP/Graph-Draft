package com.github.upcraftlp.graphdraft.impl;

import com.github.upcraftlp.graphdraft.api.Edge;
import com.github.upcraftlp.graphdraft.util.SingleConnectionNode;

import java.util.Collections;
import java.util.Set;

public class SingleConnectionNodeImpl implements SingleConnectionNode {

    private final Edge connection;
    private final Set<Edge> connectionSet;

    public SingleConnectionNodeImpl(Edge connection) {
        this.connection = connection;
        this.connectionSet = Collections.singleton(connection);
    }

    @Override
    public Edge getConnection() {
        return connection;
    }

    @Override
    public Set<Edge> getEdges() {
        return connectionSet;
    }
}
