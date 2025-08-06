public class ReverseLinkedList {
    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void reverse(){
        Node curr = head;
        Node prev = null;
        Node next;


        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public void display(){
        Node temp  = head;
        while(temp != null){
            System.out.print(temp.data +" -> ");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args){
        ReverseLinkedList rr = new ReverseLinkedList();

        rr.insert(5);
        rr.insert(10);
        rr.insert(15);
        rr.insert(20);
        System.out.println("LinkedList:");
        rr.display();
        rr.reverse();
        System.out.println("\nReversed LinkedList:");
        rr.display();

    }
}
