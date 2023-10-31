package com.victor.chapter18;

import java.util.HashSet;

public class HashSetDemo {
    // Продемонстрировать применение класса HashSet

    public static void main(String[] args) {
        // создать хеш-множество
        HashSet<String> hs = new HashSet<>();
        
        // ввести элементы в хеш-множество 
        hs.add("Бета");
        hs.add("Альфа");
        hs.add("Этa");
        hs.add("Гамма"); 
        hs.add("Эпсилон"); 
        hs.add("Омега");
        System.out.println(hs);
    }
}
