package Collections;

// Импортируем
import java.util.ArrayList;
import java.util.LinkedList;
public class Collections {
    public static void main (String[] args) {
        // Итак, так как у нас java ебать какой ооп язык, то все методы, которые сразу доступны в
        // js или python (например метод добавления элемента в массив) в java мы либо сами прописываем, либо импортируем

        // Так как мы работаем с классами, то тип данных переменной будет этот класс
        //У класса ArrayList прописываем в <> тип данных, который будет в массиве
        // тип данных в массиве не должен быть примитивным. Берем класс типа данных
        ArrayList<Integer> numbers = new ArrayList<>(); // В круглых скобках можно указать кол-во элементов, но здесь это не обязательно
        // Теперь нам открыты все методы этого класса, например add
        numbers.add(5);
        numbers.add(50);
        numbers.add(1, 6); //Можно добавлять элемы по индексу
        System.out.println(numbers.size()); //Получкем длину массива. length не работает. Только методы объекта можно через запятую писать
        // думаю ниже все понятно
        numbers.get(1);
        numbers.remove(1);
        numbers.clear();

        //LinkedList
        LinkedList<String> names = new LinkedList<>();
        // Значит различие в том, что в LinkedList отличаются некоторые методы. Но смысл один и тот же
        // LinkedList написан по другому, а именно более оптимизированно для изменения массива
        //LinkedList - для частого изменения массива (удаление или добавление элементов и не ток)
        //ArrayList - для создания листа и чтения данных или обработки
        // Опять же все это делается во благо оптимизации
        names.add("John");
        names.add("Valera");
        for(String elem : names) {
            System.out.println(elem);
        }
    }

}
