package all;

import all.Node;

public class SinglyLinkedList {
    private Node Head;
    private Node tail;

    public Node getHead() {
        return Head;
    }

    public void addLast(int digit){
        Node node= new Node(digit);
        if (isEmpty()){
            Head=node;
            tail=node;
        }
        else {
            tail.setNext(node);
            tail=node;
        }
    }

    private boolean isEmpty(){
        return Head==null;
    }
}
