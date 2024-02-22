package Classes;

public class Car extends Transport{
    //Значит у нас будет выдаваться ошибка до тех пор пока мы не пропишем конструктор
    private int powerKW = 200;
    private int consumption = 10;
    public Car (float speed, float weight, String color, byte[] coordinates, int powerKW, int consumption) {
        //Если мы просто пропишем поля и зададим их в конструкторе, то этого недостаточно. Надо еще унаследовать от родителя нужные поля
        // Так как у родителя может быть несколько конструкторов, то будет подстраиваться под тот, который подходит
        // Задаем нужные аргументы для конструктора родителя в этом конструкторе
        super(speed, weight, color, coordinates); // Ключевое слово super используется. Если this - обращение к классу в котором прописывается, то super к классу родителя
        super.coordinates = new byte[]{0, 0, 0}; // Можем сразу задать какое-то значение обратившись к родителю
        this.powerKW = powerKW;
        this.consumption = consumption;
    }
    //Но нам не надо было бы использовать наследование super если бы у нас переменные были бы public
    public Car (float speed, float weight, String color, byte[] coordinates, int powerKW) {
        super(speed, weight, color, coordinates);
        this.powerKW = powerKW;
    }
}
