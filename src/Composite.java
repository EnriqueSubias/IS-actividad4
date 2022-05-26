import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {

    protected List<Component> components; // = new ArrayList<>();

    public Composite(List<Component> components){
        this.components = components;
    }

    public List<Component> getComponents() {
        return components;
    }

    // Método para añadir componentes a un Composite
    public void add(Component component) {
        this.components.add(component);
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
