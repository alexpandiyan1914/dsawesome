public class DoublyLinked {
    Node head;

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void Insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.print("null");
    }

    public void displayBackward() {

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }                                                                                  

        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinked dd = new DoublyLinked();
        dd.Insert(10);
        dd.Insert(20);
        dd.Insert(30);

        dd.display();
        dd.displayBackward();

    }
}
