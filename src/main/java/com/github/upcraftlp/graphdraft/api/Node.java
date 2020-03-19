package com.github.upcraftlp.graphdraft.api;

import java.util.Set;

public interface Node {

    //FIXME java generics are weird
    Set<? extends Edge> getEdges();

}
