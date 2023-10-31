package com.victor.chapter18;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
    // Продемонстрировать применение класса LinkedHashSet

    public static void main(String[] args) {
        // создать хеш-множество
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        
        // ввести элементы в хеш-множество
        lhs.add("Бета");
        lhs.add("Альфа");
        lhs.add("Этa");
        lhs.add("Гамма");
        lhs.add("Эпсилон");
        lhs.add("Омега");
        System.out.println(lhs);
    }
}
