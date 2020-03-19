package com.github.upcraftlp.graphdraft.impl;

public class Packet {

    final NodeImpl start;
    int waitTime;
    EdgeImpl nextEdge;
    NodeImpl current;
    NodeImpl end;

    public Packet(NodeImpl start) {
        this.start = start;
    }

    public void setNode(NodeImpl nextNode) {
        current = nextNode;
        waitTime = 0;
    }
}
