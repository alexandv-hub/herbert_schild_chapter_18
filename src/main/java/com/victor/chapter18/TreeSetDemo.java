package com.victor.chapter18;

import java.util.TreeSet;

public class TreeSetDemo {
    // Продемонстрировать применение класса TreeSet
    
    public static void main(String[] args) {
        // создать древовидное множество типа TreeSet 
        TreeSet<String> ts = new TreeSet<>();

        // ввести элементы в древовидное множество типа TreeSet 
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E"); 
        ts.add("F"); 
        ts.add("D");
        System.out.println(ts);
    }
}
