package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    /*
        ТЕМЫ:
     
        УРОК 3
        A. Областьвидимости
        B. Массивы
        C. Циклыfor,while,do...while,foreach D. Операторыbreak,continue
        
        ДЗ:
         ● Создать массив дробных (не целых) чисел размером 15 элементов и наполнить его положительными и отрицательными числами;
         ● Затем через цикл “for each” посчитать среднее арифметическое положительных чисел расположенных после первого отрицательного числа и вывести его на экран
         
        ДЗ на сообразительность:
         ● Вам необходимо написать следующий алгоритм сортировки массива по возрастанию: каждую итерацию выбирать самый минимальный элемент и смещать его в начало. При этом каждую новую итерацию начинать сдвигаясь вправо, то есть первый проход — с первого элемента, второй проход — со второго и т.д.
         ● И при каждой итерации распечатывать текущее состояние массива

     */
    public static void main(String[] args) {

        int[] nums = {6, 12, 4, -9, 8, 10, -100, 1, 5, -84, 2, -34, 14, 16, -9};
        System.out.println("исходный массив " + Arrays.toString(nums));
        System.out.println("------------------------------------------------------------------------------------------------------");

        double average;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                continue;
                 }
            sum += nums[i];
        }
        average = (double) sum / nums.length;
        System.out.println("средне арифметическое " + average);

        System.out.println("------------------------------------------------------------------------------------------------------");
        for (int i = nums.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                }
            }
        }

        System.out.println("отсоритрованный массив " + Arrays.toString(nums));

        System.out.println("+++++++++++++++++");
        int[] bugs = {8, 76, 87, -9, 6, -56, 100, 1};
        for (int i = 0; i < bugs.length; i++) {
            if (bugs[i] < 0) {
                break;
            }
            System.out.println(bugs[i]);
        }
    }
}


    /*int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
        array[i] = (int) Math.round((Math.random() * 30) - 15);
        System.out.println(array[i]);
*/