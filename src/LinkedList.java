import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LinkedList {

    private Node head;
    private Node tail;

    public LinkedList() {
    }

    public LinkedList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }


    public void addFirst(int value) {
        Node nodeAdd = new Node();
        nodeAdd.setValue(value);
        nodeAdd.setNext(head);
        head = nodeAdd;
    }

    public List<Node> checkCycle(Node node) {
        List<Node> nodeList = new ArrayList<>();
        nodeList.add(head);
        Node next = head.getNext();

        while (true) {
            nodeList.add(next);
            if (Objects.isNull(next.getNext())) break;
            next = next.getNext();

        }
        return nodeList;
    }
}
