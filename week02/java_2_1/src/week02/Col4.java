package week02;

import java.util.LinkedList;
import java.util.Queue;

public class Col4 {
    public static void main(String[] args) {
        // Queue : FIFO
        // add, peek, poll
        // Queue : 생성자가 없는 인터페이스

        Queue<Integer> intQueue = new LinkedList<>(); // queue 선언, 생성

        intQueue.add(1);
        intQueue.add(2);
        intQueue.add(5);
        intQueue.add(9);

        while(!intQueue.isEmpty()){
            System.out.println(intQueue.poll());
        }

        intQueue.add(1);
        intQueue.add(2);
        intQueue.add(5);
        intQueue.add(9);

        System.out.println(intQueue.peek());
        System.out.println(intQueue.size());
    }
}
