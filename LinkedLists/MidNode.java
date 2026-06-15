public class MidNode {
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

    public void FindMid(Node head){
        int len = 0;

        Node temp = head;
        
        while(temp != null){
            len++;
            temp = temp.next;
        }

        int mid = len / 2;

        while(mid > 0){
            head = head.next;
            mid--;
        }

        return head.data;
        
    }


    public static void main(String[] args){
        MidNode rr = new MidNode();

        rr.insert(5);
        rr.insert(10);
        rr.insert(15);
        rr.insert(20);
        
        rr.FindMid();
    }
}
