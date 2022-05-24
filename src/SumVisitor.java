
public class SumVisitor extends VisitorTemplate implements Visitor {

    int sumLeaves = 0;
    int timesVisited = 0;
    @Override
    protected void doVisit(Leaf leaf) {
        sumLeaves += leaf.getInfo();
        timesVisited++;
    }

    public int getSum(){
        return  sumLeaves;
    }

    public int getRevisited(){
        return timesVisited;
    }

}
