import java.util.*;

public class Queue_prog {
    public static void main(String[] args){
        Queue<Integer> q = new LinkedList<>();

        q.add(20);
        q.add(30);
        q.add(40);

        if(q.isEmpty()){
            System.out.println("Queue is empty");
        }else{
            System.out.println("Queue s not empty");
            System.out.println("Peek element :"+q.peek());
        }
    }
}

//implemntation of queue using JAVA COLLECTIONS
