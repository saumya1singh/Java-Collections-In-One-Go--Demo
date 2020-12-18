import java.util.LinkedList;
import java.util.Queue;

public class Queues {

    public static void main(String[] args){

        //Queue instance created using LinkedList
        //It offers almost features of LinkedList

        //---------FIFO IMPLEMENTATION---------//
        Queue<Integer> queue= new LinkedList<>();

        queue.add(8);
        queue.add(90);
        queue.add(25);
        queue.add(95);

        System.out.println(queue.peek());

        System.out.println(queue.poll());

        System.out.println(queue.isEmpty());

        System.out.println(queue.size());

        System.out.println(queue.offer(97));

        System.out.println(queue.toString());

        System.out.println(queue);
    }
}
