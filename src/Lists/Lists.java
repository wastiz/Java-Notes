package Lists;

import java.util.*;

public class Lists {
    public static void main (String[] args) {
        // Рассмотрим здесь List, ArrayList, LinkedList, Set

        //List
        // Это интерфейс, в котором могут быть упорядоченные элементы
        // ArrayList и LinkedList это уже классы от этого интерфейса
        // В чем отличие? Есть много одинаковых методов по типу добавления удаления. Но они реализованы по разному
        // В LinkedList - двусвязная цепочка элементов. То есть быстрые вставки или удаления в середине списка
        // В ArrayList - наоборот

        List<String> newArray = new ArrayList<>();// Создание
        List<String> newArray2 = List.of("Stmh", "Smth"); // Создание неизменяемого списка
        //newArray2.add("Smth"); // Immutable object is modified
        List<String> newArray3 = new ArrayList<>(List.of("Stmh", "Smth"));// Создание изменяемого списка
        newArray3.add("new Smth");
        System.out.println(newArray3);
        // тоже самое можно и с LinkedList. Но он реже используется в принципе в практике


        //Set
        // Тоже интерфейс на котором разработаны несколько классов (HashSet, LinkedHashSet, TreeSet)
        Set<String> newSet = new HashSet<>(); // Наиболее быстрый из всех
        newSet.add("Smth");
        newSet.add("New");
        newSet.add("Set");
        newSet.add("Smth");
        System.out.println(newSet); // Напоминаю прикол множеств в том, что дубликаты не добавляются

        Set<String> newSet2 = new LinkedHashSet<>(); // Привязаный сет к порядку
        newSet2.add("Smth");
        newSet2.add("New");
        newSet2.add("Set");
        newSet2.add("Smth");
        System.out.println(newSet2); // Обратите внимание на порядок в обеих сетах
        // В привязаном просто отбрасываюстя дубликаты, а в обычном добавляются заново

        Set<String> newSet3 = new TreeSet<>(); // Сет, у которого особая структура данных в виде бинарного дерева(вспоминаем компмайнс), что дает быстрее отсортировывать данные
        newSet3.add("Smth");
        newSet3.add("New");
        newSet3.add("Set");
        newSet3.add("Smth");
        System.out.println(newSet2); // Обратите внимание что порядок отсортирован сразу
        // В случае с цифрами порядок по возрастанию. А с бувами по алфавиту
        // Добавление элемента происходит дороже, потому что надо сразу отсортировать все

        //Map переводят обычно как отображение. Прикол в том, что как словари содержит ключ и значение
        // Также три реализации интерфейса
        HashMap<String, Integer> newMap = new HashMap<>();
        newMap.put("Apple", 5);
        newMap.put("Orange", 6);
        newMap.put("Banana", 6);
        newMap.put("Apple", 4);
        System.out.println(newMap); // Обращаем внимание что если ввели такой же ключ, то значение перезапишется
        // вдруг если такого надо избежать(чтобы значение у сущетсвуюшего ключе не перезаписывалось), то используем putIfAbsent

        // С Linked и Tree тоже самое. В Linked по другому методы реализованы, а в Tree словарь будет сортироваться


        // Дополнительно. Если вдруг нужен список с разными типов данных, то:
        List<Object> newArray4 = new ArrayList<>(List.of("String", 4, 3.23, true));
        System.out.println(newArray4); // и логично мы просто берем объекты типов String Integer, Boolean и тд
    }

}
