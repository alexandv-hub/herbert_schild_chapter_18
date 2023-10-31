package com.victor.practice_1_2;

import java.util.Arrays;
import java.util.HashMap;

/**
 Практика:
 Задание 1

 Дан массив целых чисел. Необходимо реализовать метод,
 который возвращает индексы массива, значения которых в сумме
 дают число переданное в массив.

 Предполагается, что массив содержит только уникальные числа и
 всегда имеет искомые числа.
 Один и тот же элемент не может быть использован дважды.

 array = [3, 8, 15, 17], Number = 23
 result = [1,2]

 Т.е. индексы 1 и 2 (значение 8 и 15) в сумме дают искомое число 23

 Уточнение - result всегда содержит только 2 элемента
 */
public class PracticeTask1 {

    public static void main(String[] args) {
        int[] givenArray = {3, 8, 15, 17};
        int sumOf2Numbers = 23;

        int[] arrayOfFoundIndexes = get2IndexesFromArrayGiven(givenArray, sumOf2Numbers);

        System.out.println(Arrays.toString(arrayOfFoundIndexes));
    }

    private static int[] get2IndexesFromArrayGiven(int[] arrayGiven, int sumOf2Numbers) {
        int[] returnArray = new int[2];

        // Т.к. по условию задачи предполагается, что массив содержит только уникальные числа,
        // преобразуем наш массив в HashMap<Число_из_элемента_массива, Индекс_элемента_массива>
        HashMap<Integer, Integer> numberToIndexMap = new HashMap<>();
        for (int i = 0; i < arrayGiven.length; i++) {
            numberToIndexMap.put(arrayGiven[i], i);
        }

        for (int i = 0; i < arrayGiven.length; i++) {
            // находим разницу между заданной суммой и значением текущего элемента в цикле
            int currNum = arrayGiven[i];
            int diffNum = sumOf2Numbers - currNum;

            // если разница найдена, добавляем индексы в массив
            if (numberToIndexMap.containsKey(diffNum)) {
                returnArray[0] = i;
                int diffNumIndex = numberToIndexMap.get(diffNum);
                returnArray[1] = diffNumIndex;
                break;
            }
        }
        return returnArray;
    }
}
