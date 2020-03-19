package com.github.upcraftlp.graphdraft.impl;

import com.github.upcraftlp.graphdraft.api.Edge;
import com.github.upcraftlp.graphdraft.api.Node;

public class EdgeImpl implements Edge {

    private final int weight;
    private final boolean bidirectional;
    private final int maxOperations;
    private final Node left;
    private final Node right;

    public EdgeImpl(Node left, Node right, int maxOperations) {
        this(left, right, true, maxOperations);
    }

    public EdgeImpl(Node left, Node right, boolean bidirectional, int maxOperations) {
        this(left, right, bidirectional, maxOperations, 1);
    }

    public EdgeImpl(Node left, Node right, boolean bidirectional, int maxOperations, int weight) {
        this.left = left;
        this.right = right;
        this.bidirectional = bidirectional;
        this.maxOperations = maxOperations;
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

    @Override
    public int getCapacity() {
        return maxOperations;
    }

    @Override
    public Node getLeft() {
        return left;
    }

    @Override
    public Node getRight() {
        return right;
    }

    @Override
    public boolean isBidirectional() {
        return bidirectional;
    }
}
