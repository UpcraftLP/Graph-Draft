import com.github.upcraftlp.graphdraft.api.Graph;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GraphTest {

    Graph graph = Graph.create();

    @Test
    void createGraph() {
        Assertions.assertNotNull(graph);
    }

    @Test
    void getGraphID() {
        Assertions.assertNotNull(graph.getId());
    }
}
