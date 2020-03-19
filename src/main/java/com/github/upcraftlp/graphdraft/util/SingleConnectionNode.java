package com.github.upcraftlp.graphdraft.util;

import com.github.upcraftlp.graphdraft.api.Edge;
import com.github.upcraftlp.graphdraft.api.Node;

public interface SingleConnectionNode extends Node {

    Edge getConnection();

}
