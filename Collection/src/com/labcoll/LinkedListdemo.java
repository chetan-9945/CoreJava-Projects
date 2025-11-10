package com.labcoll;

import java.util.*;

public class LinkedListdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        LinkedList<String> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(sc.next());
        }
        
        //Stack<String> stack = null;

        list.reversed();
//     ListIterator<String> it = list.listIterator();
//        while (it.hasPrevious()) {
//            System.out.println(it.previous());
//        }
//     
//     while(it.hasNext())
//     {
//    	 System.out.println(it.next());
//     }
        
        list.forEach(list1 -> System.out.println(list1));
        

        sc.close();
    }
}