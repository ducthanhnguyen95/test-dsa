import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        linkedList.addFirst(3);
        linkedList.addFirst(1);


//        System.out.println(linkedList.getHead().getValue());
//        System.out.println(linkedList.getHead().getNext().getValue());
//        System.out.println(linkedList.getHead().getNext().getNext().getValue());

        List<Node> nodes = linkedList.checkCycle(linkedList.getHead());
        int isCycle = 0;
        List<Integer> list = new ArrayList<>();
        List<Integer> distinct = new ArrayList<>();
        for (Node item : nodes) {
            list.add(item.getValue());
        }
        distinct = list;

        if (list.size() != distinct.stream().distinct().collect(Collectors.toList()).size()) isCycle = 1;

        System.out.println(isCycle);
    }
}