package com.victor.chapter18;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class AlgorithmsDemo {
    // Продемонстрировать применение различных алгоритмов коллекций

    public static void main(String[] args) {
        // создать неинициализированный связный список
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(-8);
        ll.add(20);
        ll.add(-20);
        ll.add(8);
        
        // создать компаратор с обратным упорядочением
        Comparator<Integer> c = Collections.reverseOrder();
        
        // отсортировать список с помощью этого компаратора
        Collections.sort(ll, c);
        System.out.print("Список отсортирован в обратном порядке: "); 
        for (int i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();

        // перетасовать список
        Collections.shuffle(ll);
        
        // вывести перетасованный список
        System.out.print("Список перетасован: ");
        for (int i : ll) {
            System.out.print(i + " ");
        }
        System.out.println();
        
        System.out.println("Минимум: " + Collections.min(ll));
        System.out.println("Максимум: " + Collections.max(ll));
    }
}
