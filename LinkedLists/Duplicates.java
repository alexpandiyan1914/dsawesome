public class Duplicates {
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

    public void duplicates(){
        Node temp = head;

        while(temp != null && temp.next != null){
            if(temp.data == temp.next.data){
                temp.next = temp.next.next;
            }else{
                
            temp = temp.next;

            }

        }    
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
        Duplicates rr = new Duplicates();

        rr.insert(5);
        rr.insert(10);
        rr.insert(10);
        rr.insert(15);
        rr.insert(15);
        rr.insert(15);
        rr.insert(20);
        rr.insert(20);
        System.out.println("LinkedList:");
        rr.display();
        rr.duplicates();
        System.out.println("\n without duplicate:");
        rr.display();
    }
}
