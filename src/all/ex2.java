package all;

public class ex2 {

    public static void main(String[] args) {
        ex2 obj =new ex2();
        SinglyLinkedList sll=new SinglyLinkedList();
        sll.addLast(1);
        sll.addLast(2);
        sll.addLast(3);
        sll.addLast(4);
        sll.addLast(5);
        System.out.println(obj.getNumber(sll));
    }

    public int getNumber(SinglyLinkedList list){
        int response =0;
        Node temp= list.getHead();
        String number ="";
        while(temp!=null){
            number=number+temp.getData();
            temp=temp.getNext();
        }
        response=Integer.parseInt(number);
        return response;

    }

}