package behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class HTMLDocument {
    private final List<HTMLNode> nodes = new ArrayList<>();

    public void add(HTMLNode node) {
        nodes.add(node);
    }

    public void execute(Operation operation) {
        for (var node : nodes)
            node.execute(operation);
    }
}
