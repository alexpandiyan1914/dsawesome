import java.util.*;

public class  SinglyLinkedList {

    Node head;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertVal(int data){
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

    public void insertAtbeg(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void insertAtPos(int data,int pos){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
        }else{
            Node temp = head;
            while(temp.next != null && temp.data != pos){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
    }
    public void dltAtBeg(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
    }

    public void dltAtPos(int data){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        if(head.data == data){
            head = head.next;
            return;
        }

        Node temp = head;
        while(temp.next != null && temp.next.data != data){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    public void dltAtEnd(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node temp  = head;
        while(temp.next.next != null ){
            temp = temp.next;
        }
        temp.next = null;

    }

    public void display(){
        if(head == null){
            System.out.println("List is Empty");
            return;
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args){
        SinglyLinkedList list = new SinglyLinkedList();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.print("Enter you choice :");
            int choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.print("Enter the val to be insert:");
                    int data = sc.nextInt();
                    list.insertVal(data);
                    break;
                case 2:
                    System.out.print("Enter the val to be insert(at beginning):");
                    data = sc.nextInt();
                    list.insertAtbeg(data);
                    break;
                case 3:
                    System.out.print("Enter the val:");
                    data = sc.nextInt();
                    System.out.print("Enter the pos:");
                    int pos = sc.nextInt();
                    list.insertAtPos(data,pos);
                    break;
                case 4:
                    System.out.println("Node dlted at beginning!");
                    list.dltAtBeg();
                    break;
                case 5:
                    System.out.print("Enter the val to be deleted:");
                    data = sc.nextInt();
                    list.dltAtPos(data);
                    System.out.println("val deleted!!");
                    break;
                case 6:
                    System.out.println("Node dlted at end!");
                    list.dltAtEnd();
                    break;
                case 7:
                    list.display();
                    break;
                default:
                    System.out.println("invalid choice !!");
                    break;
            }
        }
    }
}
