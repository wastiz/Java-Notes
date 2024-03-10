package Classes;

public class Truck extends Transport{

    private boolean isLoaded;

    public Truck(float speed, float weight, String color, byte[] coordinates, boolean isLoaded) {
        // при создании класса наследника, в конструкторе первым делом надо указать super() и параметры которые конструктор родителя будет принимать
        // Напоминаю что super это просто название класса родителя
        // В этом классе this - Truck, super - Transport
        super(speed, weight, color, coordinates);
        this.isLoaded = isLoaded;
    }
    // Полиморфизм в Java

    // За счет полиморфизма можно переписывать методы классов родителей
    // Прописываем @Override и один в один аргументы и поля доступа
    @Override
    public void setValues(float speed, float weight, String color, byte[] coordinates) {
        this.speed = speed + 1;
        this.weight = weight + 100;
        this.color = color + "dark";
        this.coordinates = new byte[]{1, 1};
    }
    // К примеру вот так

}
