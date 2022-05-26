
public class Leaf extends Component {
    private final int info;
    //private boolean visited = false;

    public Leaf(int info) {
        this.info = info;
    }

    public int getInfo() {
        return this.info;
    }

    //public boolean isVisited(){
    //    return visited;
    //}

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
