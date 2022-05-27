import java.util.HashSet;
import java.util.Set;

public class SumVisitor implements CompVisitor {
    private int sumLeaves = 0;
    private int timesRevisited = 0;
    private final Set<Component> visited = new HashSet<>();

    @Override
    public void visit(Leaf leaf) {
        if (!visited.add(leaf)) {
            timesRevisited++;
            return;
        }
        sumLeaves += leaf.getInfo();
    }

    @Override
    public void visit(Composite composite) {
        if (!visited.add(composite))  {
            timesRevisited++;
            return;
        }
        for (Component component : composite.getComponents()) {
            component.accept(this);
        }
    }

    public int getSum() {
        return sumLeaves;
    }

    public int getRevisited() {
        return timesRevisited;
    }
}
