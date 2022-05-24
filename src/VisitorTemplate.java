import java.util.HashSet;
import java.util.Set;

public abstract class VisitorTemplate implements Visitor {

    protected int numLeaves = 0;

    protected int sumLeaves = 0;
    protected Set<Component> visited = new HashSet<>();

    protected abstract void doVisit(Leaf leaf);

    @Override
    public void visit(Leaf leaf) {
        if (visited.add(leaf)) {
            System.out.println("3 Visited");
            doVisit(leaf);
        }
    }

    @Override
    public void visit(Composite composite) {
        if (visited.add(composite)) {
            for (Component comp : composite.getComponents()) {
                System.out.println("1 - Visit Child");
                if (!isVisited(comp)) {
                    comp.accept(this);
                } else {
                    System.out.println("Already Visited");
                }

            }
        }
    }

    // Check if the leaf has been visited before
    public boolean isVisited(Component component) {
        // Check if the component is a leaf
        if(component instanceof Leaf){
            System.out.println("isVisited - Leaf");
            return visited.contains(component);
        }else {
            System.out.println("isVisited - Composite");
            return false;
        }
    }
}
