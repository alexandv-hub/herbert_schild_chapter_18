package com.victor.chapter18;

import java.util.Properties;
import java.util.Set;

public class PropDemo {
    // Продемонстрировать применение списка свойств

    public static void main(String[] args) {
        Properties capitals = new Properties();
        capitals.put("Иллинойс", "Спрингфилд");
        capitals.put("Миссури", "Джефферсон-Сити");
        capitals.put("Вашингтон", "Олимпия");
        capitals.put("Калифорния", "Сакраменто");
        capitals.put("Индиана", "Индианаполис");

        // получить множество ключей
        Set<?> states = capitals.keySet();

        // показать все штаты и их столицы
        for (Object name : states) {
            System.out.println("Столица штата " + name + " - " + capitals.getProperty((String) name) + ".");
        }
        System.out.println();

        // найти штат, отсутствующий в списке, указав значения,
        // выбираемые по умолчанию
        String str = capitals.getProperty("Флopидa", "не найдена");
        System.out.println("Столица штата Флорида " + str + ".");
    }
}
