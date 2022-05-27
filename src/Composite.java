import java.util.Collections;
import java.util.List;

public class Composite extends Component {

    protected List<Component> components; // = new ArrayList<>();

    public Composite(List<Component> components) {
        this.components = components;
    }

    public List<Component> getComponents() {
        return Collections.unmodifiableList(components);
    }

    public void add(Component component) {
        this.components.add(component);
    }

    @Override
    public void accept(CompVisitor visitor) {
        visitor.visit(this);
    }
}
