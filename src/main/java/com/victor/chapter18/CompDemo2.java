package com.victor.chapter18;

import java.util.TreeSet;

class CompDemo2 {
    public static void main(String[] args) {
        // передать компаратор с обратным упорядочением
        // древовидному множеству типа TreeSet
        TreeSet<String> ts = new TreeSet<>((aStr, bStr) -> bStr.compareTo(aStr));

        // ввести элементы в древовидное множество
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        // вывести элементы из древовидного множества
        for (String element :ts) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}


