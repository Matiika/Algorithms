package lesson3_Stack;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        MyStack<Integer> stack = new MyStack<>();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(stack.pop());
//        }
//
//        Expression e = new Expression("(asda[asda]asada)asda[[]]asd[s{]");
//        System.out.println(e.checkBracket());
//
//        MyQueue<Integer> queue = new MyQueue<>();
//        queue.insert(1);
//        queue.insert(2);
//        queue.insert(3);
//        queue.insert(4);
//        queue.insert(5);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(queue.remove());
//        }
//
//        MyPriorityQueue<Integer> pq = new MyPriorityQueue<>(10, Comparator.reverseOrder());
//        pq.insert(7);
//        pq.insert(2);
//        pq.insert(8);
//        pq.insert(9);
//        pq.insert(3);
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println(pq.remove());
//        }

        MyDeque<Integer> deque = new MyDeque<>();
        deque.addRight(1);
        deque.addRight(2);
        deque.addRight(3);
        deque.addRight(4);
        deque.addRight(5);
        deque.addLeft(6);
        deque.addLeft(7);
        deque.addLeft(8);
        deque.addLeft(9);
        deque.addLeft(10);


        for (int i = 0; i < 10; i++) {
            System.out.println(deque.removeLeft());
        }

    }
}
