package com.github.upcraftlp.graphdraft.test;

public interface Scorer<T extends GNode> {
    /**
     * compute score for traveling between nodes.
     * this includes edge cost, but also direction
     */
    double computeCost(T from, T to);
}
