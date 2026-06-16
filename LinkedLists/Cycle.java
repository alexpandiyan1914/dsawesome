public class Cycle {
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

    public boolean hasCycle(){
        Node slowptr = head;
        Node fastptr = head;

        while(fastptr != null && fastptr.next != null){
            slowptr = slowptr.next;

            fastptr = fastptr.next.next;

            if(slowptr == fastptr){
                return true;
            }
        }

        return false;
    }

    

    public static void main(String[] args){
        Cycle rr = new Cycle();

        rr.insert(5);
        rr.insert(10);
        rr.insert(15);
        rr.insert(20);
        rr.insert(25);

        rr.head.next.next.next.next = rr.head.next.next; //create cycle manualy

        if(rr.hasCycle()){
            System.out.print("Cycle exist");
        }else{
            System.out.println("Cycle doesn't exist");
        }

 
    }
}
