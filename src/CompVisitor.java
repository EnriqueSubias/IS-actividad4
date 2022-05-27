
public interface CompVisitor {
    void visit(Leaf leaf);
    void visit(Composite composite);
}
