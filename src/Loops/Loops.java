package Loops;


import java.util.Arrays;

public class Loops {
    //Значит в Java синтаксис циклов точно такой же как и в js, поэтому особо распинатсья не буду просто запишу некоторые особенности

    public static void main(String[] args) {
        char[] array = new char[] {'a', 'b', 'c', 'd', 'e'};
        // Итак есть у нас массив его можно перебрать в таком урощеном виде цикла for (то есть без переменной i)
        for(char elem : array) {
            System.out.println(elem);
        }
        int[] numbers = new int[] {1, 2, 3, 4, 5};
        // А можно использовать метод forEach (работает с цифрами)
        Arrays.stream(numbers).forEach(elem -> System.out.println(elem));
        // Для массивов с другими типами данных по другому пишем код (гуглим)
        // но это не обязательно так как проще использовать цикл for как выше написал
    }
}
