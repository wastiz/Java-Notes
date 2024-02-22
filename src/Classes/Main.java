package Classes;

public class Main {
    public static void main (String[] args) {
        // Итак перезодим к нашему любимому ООП
        // Для начала помним что класс это чертеж чего-то (так скажем), а объект - что-то, что было сделано по чертежу
        // Инкапсуляция - доступ контента класса. Что-то доступно может быть, что-то нет
        // Также один класс - один файл
        // переменные класса - поля
        // Пакет - папка с файлами

        // Для того чтобы создать поле нам надо кроме типа данных указать модификатор доступа
        // Модификаторы которые рассмотрим ниже могу применяться и к функциям и к классам и к полям
        // public - досуп везде, даже которые в других пакетах
        // protected - доступ только в самом классе и классе наследнике
        // private - доступ только в самом классе

        // Итак, вроде все уяснили. Переходим в класс транспорта
        Transport bmw = new Transport();
        bmw.color = "red";
        System.out.println(bmw.color);
    }
}