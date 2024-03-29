
package IS_actividad4;
import java.util.Collections;
import java.util.List;

public class Composite extends Component {

    private final List<Component> components;

    public Composite(List<Component> components) {
        this.components = components;
    }

    public List<Component> getComponents() {
        return components;
    }

    public void add(Component component) {
        this.components.add(component);
    }

    @Override
    public void accept(CompVisitor visitor) { visitor.visit(this); }
}
