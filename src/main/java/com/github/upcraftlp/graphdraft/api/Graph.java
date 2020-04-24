package com.github.upcraftlp.graphdraft.api;

import com.github.upcraftlp.graphdraft.impl.GraphImpl;
import org.jetbrains.annotations.ApiStatus;

import java.util.List;
import java.util.Set;
import java.util.UUID;

public interface Graph {
    UUID getId();

    void setId(UUID id);

    Set<Node> getNodes();

    /**
     * process the action queue and remove finished elements
     */
    void processQueue();

    static Graph create() {
        return new GraphImpl();
    }

    /**
     * tries to find the cheapest connection from start to target node, that has at least the specified capacity
     */
    @ApiStatus.Experimental
    List<Edge> findConnection(Node start, Node target, int requiredCapacity);
}
