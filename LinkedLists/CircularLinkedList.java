public class CircularLinkedList {
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
            newNode.next = head;
            return;
        }else{
            Node temp = head;

            while(temp.next != head){
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.next = head;
        }
    }

    public void display(){

    if(head == null){
        System.out.println("List is empty");
        return;
    }

    Node temp = head;

    do{
        System.out.print(temp.data + " -> ");
        temp = temp.next;
    }while(temp != head);

    System.out.println("(head)");
}

    public static void main(String[] args){
        CircularLinkedList cc = new CircularLinkedList();

        cc.insert(10);
        cc.insert(20);
        cc.insert(30);

        cc.display();
    }
}
