import java.util.HashSet;
import java.util.Set;

public class SumVisitor implements Visitor {
    protected int sumLeaves = 0;
    protected int timesRevisited = 0;
    protected Set<Component> visited = new HashSet<>();

    // protected  void doVisit(Leaf leaf);

    @Override
    public void visit(Leaf leaf) {
        if (visited.add(leaf)) {
            System.out.println(" + Leaf Visited");
            //doVisit(leaf);
            sumLeaves += leaf.getInfo();
        }
    }

    @Override
    public void visit(Composite composite) {
        if (visited.add(composite)) {
            System.out.println(" * Component Visited");
            for (Component comp : composite.getComponents()) {
                if (comp instanceof Leaf && !visited.contains(comp) || comp instanceof Composite) {
                    comp.accept(this);
                } else {
                    System.out.println("Already Visited");
                    timesRevisited++;
                }
            }
        }
    }

    /*
    // Check if the leaf has been visited before
    public boolean isVisited(Component component) {
        // Check if the component is a leaf
        if(component instanceof Leaf){
            System.out.println("        isVisited() - Leaf");
            return visited.contains(component);
        }else {
            System.out.println("        isVisited() - Composite");
            return false;
        }
    }*/

    public int getSum(){
        return sumLeaves;
    }

    public int getRevisited(){
        return timesRevisited;
    }
}
