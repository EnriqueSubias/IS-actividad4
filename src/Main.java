import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Component> list = new ArrayList<>();
        var sumVisitor = new SumVisitor();
        Leaf leaf1 = new Leaf(4);
        Leaf leaf2 = new Leaf(3);
        list.add(leaf1);
        //leaf1.accept(sumVisitor);
        //leaf2.accept(sumVisitor);
        list.add(leaf2);

        var component = new Composite(list);
        //component.accept(sumVisitor);
        //int sum = sumVisitor.getSum();
        //int revisited = sumVisitor.getRevisited();
        //System.out.println("Sum: " + sum);
        //System.out.println("Revisited: " + revisited);


        ArrayList<Component> list2 = new ArrayList<>();
        Leaf leaf3 = new Leaf(2);
        Leaf leaf4 = new Leaf(1);
        list.add(leaf3);
        list.add(leaf4);

        var component2 = new Composite(list2);
        component2.add(component);
        component2.accept(sumVisitor);
        int sum2 = sumVisitor.getSum();
        int revisited2 = sumVisitor.getRevisited();

        System.out.println("Sum2: " + sum2);
        System.out.println("Revisited2: " + revisited2);

    }
}