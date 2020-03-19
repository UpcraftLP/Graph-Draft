package com.github.upcraftlp.graphdraft.impl;

import com.github.upcraftlp.graphdraft.api.Edge;
import com.github.upcraftlp.graphdraft.util.SingleConnectionNode;

import java.util.Collections;
import java.util.Set;

public class SingleConnectionNodeImpl extends NodeImpl implements SingleConnectionNode {

    private final Edge connection;
    private final Set<EdgeImpl> connectionSet;

    public SingleConnectionNodeImpl(EdgeImpl connection) {
        this.connection = connection;
        this.connectionSet = Collections.singleton(connection);
    }

    @Override
    public Edge getConnection() {
        return connection;
    }

    @Override
    public Set<EdgeImpl> getEdges() {
        return connectionSet;
    }
}
