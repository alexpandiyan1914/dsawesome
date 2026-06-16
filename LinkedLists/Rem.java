public class Rem {
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

    public void remove(int n){
        int len = 0;

        Node temp = head;
        while(temp != null){
            len++;
            temp = temp.next;
        }

        int pos = len - (n+1);

        

        temp = head;

        while(temp.next != null && pos != n ){
            temp = temp.next;
        }


        temp.next = temp.next.next;

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
        Rem rr = new Rem();

        rr.insert(5);
        rr.insert(10);
        rr.insert(15);
        rr.insert(20);
        rr.insert(25);

        rr.remove(2);
        rr.display();
 
    }
}
