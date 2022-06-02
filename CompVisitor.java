package IS_actividad4;

public interface CompVisitor {
    void visit(Leaf leaf);
    void visit(Composite composite);
}
