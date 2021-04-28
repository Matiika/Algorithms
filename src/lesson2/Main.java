package lesson2;

import java.util.Random;


public class Main {
    static Random rand = new Random();

    public static void main(String[] args) {
//        MyArrayList<Integer> mal = new MyArrayList<>();
//
//        for (int i = 0; i < 5; i++) {
//            mal.add(i+5);
//        }
//
//        mal.add(1, 89);
//        System.out.println(mal);
//
//        mal.remove(3);
//        System.out.println(mal);
//
//        System.out.println(mal.indexOf(6));
//
//        mal.remove(new Integer(8));
//        System.out.println(mal);

//        MySortedArrayList<Integer> msal = new MySortedArrayList<>();
//
//        msal.add(6);
//        msal.add(9);
//        msal.add(2);
//        msal.add(1, 8);
//
//        System.out.println(msal);
//
//        System.out.println(msal.binaryFind(8));

        int a = 100000;

        MyArrayList<Integer> mal1 = new MyArrayList<>( a);
        MyArrayList<Integer> mal2 = new MyArrayList<>( a);
        MyArrayList<Integer> mal3 = new MyArrayList<>( a);

        for (int i = 0; i < a; i++) {
            mal1.add(rand.nextInt(1000));
            mal2.add(rand.nextInt(1000));
            mal3.add(rand.nextInt(1000));
        }

       // System.out.println(mal1);
        long t = System.currentTimeMillis();
        mal1.selectionSort();
        System.out.println(System.currentTimeMillis()-t);
       // System.out.println(mal1);

      //  System.out.println(mal2);
         t = System.currentTimeMillis();
        mal2.insertionSort();
        System.out.println(System.currentTimeMillis()-t);
       // System.out.println(mal2);

      //  System.out.println(mal3);
         t = System.currentTimeMillis();
        mal3.bubbleSort();
        System.out.println(System.currentTimeMillis()-t);
      //  System.out.println(mal3);

    }
}
