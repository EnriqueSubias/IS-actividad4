
public class Leaf extends Component {
    private final int info;

    public Leaf(int info) {
        this.info = info;
    }

    public int getInfo() {
        return this.info;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
