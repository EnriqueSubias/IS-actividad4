
public interface Visitor {
    void visit(Leaf leaf);
    void visit(Composite composite);
}
