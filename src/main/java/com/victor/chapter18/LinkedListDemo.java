package com.victor.chapter18;

import java.util.LinkedList;

public class LinkedListDemo {
    // Продемонстрировать применение класса LinkedList

    public static void main(String[] args) {
        // создать связный список
        LinkedList<String> ll = new LinkedList<>();

        // ввести элементы в связный список
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("Е");
        ll.add("C");
        ll.addLast("Z");

        ll.addFirst( "A");
        ll.add(1, "А2");
        System.out.println(
                    "Исходное содержимое связного списка ll: " + ll);

        // удалить элементы из связного списка
        ll.remove("F");
        ll.remove(2);
        System.out.println(
                "Содержимое связного списка ll после удаления элементов: " + ll);

        // удалить первый и последний элементы из связного списка
        ll.removeFirst();
        ll.removeLast();
        System.out.println(
                "Содержимое связного списка ll после удаления первого и последнего элементов: " + ll);

        // получить и присвоить значение
        String val = ll.get(2);
        ll.set(2, val + " изменено");
        System.out.println(
                "Содержимое связного списка ll после изменения: " + ll);
    }
}
