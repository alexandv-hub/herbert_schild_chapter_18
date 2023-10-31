package com.victor.practice_1_2;

import java.util.HashSet;

/**
 Практика:
 Задание 2

 Дан массив целых чисел.
 Необходимо реализовать метод, который определяет, содержит ли данный массив дубликаты

 Пример:
 Array: [4,5,6,6,8]
 Result: true
 Число 6 повторяется 2 раза

 Array: [4,5,6,7,8]
 Result: false
 Дубликатов нет
 */
public class PracticeTask2 {

    public static void main(String[] args) {
        int[] intArray = {4, 5, 6, 6, 8};

        System.out.println(checkIfArrayContainsDuplicates(intArray));
    }

    private static boolean checkIfArrayContainsDuplicates(int[] intArray) {
        HashSet<Integer> numbersSet = new HashSet<>();

        for (int num : intArray) {
            // Если число уже содержится в HashSet, то это дубликат!
            if (numbersSet.contains(num)) {
                return true;
            }
            // добавляем значение в HashSet
            numbersSet.add(num);
        }
        return false;
    }
}
