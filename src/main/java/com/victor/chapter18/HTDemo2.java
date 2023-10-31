package com.victor.chapter18;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HTDemo2 {
    // Применить итераторы вместе с классом Hashtable

    public static void main(String[] args) {
        Hashtable<String, Double> balance = new Hashtable<>();

        String str;
        double bal;

        balance.put("Джон Доу", new Double(3434.34));
        balance.put("Toм Смит", new Double(123.22));
        balance.put("Джейн Бейкер", new Double( 1378.00));
        balance.put("Toд Холл", new Double(99.22));
        balance.put("Ральф Смит", new Double(-19.08));

        // Показать все счета в хеш-таблице. Сначала получить
        // представление всех ключей в виде множества
        Set<String> set = balance.keySet();

        // получить итератор
        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {
            str = itr.next();
            System.out.println(str + ": " + balance.get(str));
        }
        System.out.println();

        // внести сумму 1000 на счет Джона Доу
        bal = balance.get("Джон Доу");
        balance.put("Джон Доу", bal + 1000);
        System.out.println("Новый остаток на счете Джона Доу: " +
                balance.get("Джон Доу"));
    }
}
