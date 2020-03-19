package com.github.upcraftlp.graphdraft.api;

import org.jetbrains.annotations.Range;

/**
 * a connection between two {@link Node}s
 */
public interface Edge {

    /**
     * @return the weight of this edge
     */
    @Range(from = 0, to = Integer.MAX_VALUE)
    int getWeight();

    /**
     * @return the maximum capacity of this edge
     */
    @Range(from = 0, to = Integer.MAX_VALUE)
    int getCapacity();

    Node getLeft();

    Node getRight();

    /**
     * @return {@code true} when this edge can be traversed from right to left
     */
    boolean isBidirectional();
}
