package org.logical.numbers;

public class Fibonacci  {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, i, count = 51;
        System.out.print(n1 + " " + n2);//printing 0 and 1

        for (i = 2; i < count; ++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
       // withRecursion(51-2);
    }

//    static void withRecursion(int count) {
//        int n1 = 0, n2 = 1, n3 = 0;
//        if (count > 0) {
//            n3 = n1 + n2;
//            n1 = n2;
//            n2 = n3;
//            System.out.print(" " + n3);
//            withRecursion(count - 1);
//
//        }
//    }
}
