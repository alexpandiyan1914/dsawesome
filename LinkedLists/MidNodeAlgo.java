public class MidNodeAlgo {
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

    public int FindMid(){
        Node fastptr = head;
        Node slowptr = head;

        while(fastptr != null && fastptr.next != null){
            fastptr = fastptr.next.next;

            slowptr = slowptr.next;
        }

        return slowptr.data;
    }

    

    public static void main(String[] args){
        MidNodeAlgo rr = new MidNodeAlgo();

        rr.insert(5);
        rr.insert(10);
        rr.insert(15);
        rr.insert(20);
        rr.insert(25);

        int mid = rr.FindMid();
        System.out.println(mid);
 
    }
}
