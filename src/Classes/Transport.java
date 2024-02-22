package Classes;

public class Transport {
    public float speed, weight;
    public String color;
    public byte[] coordinates;

    //Давайте создадим метод, через который будем устанавливать значения, чтобы было проще создавать объект, а именно простым вызовом этой функции с параметрами
    // то есть сделаем некий конструктор класса
    public void setValues (float speed, float weight, String color, byte[] coordinates) {
        //speed = speed;
        // В этом случае видим что не понятно какая переменная используется, вроде поле класса,а вроде аргумент функции
        // Для этого и был создан наш любимый контекст this
        this.speed = speed;
    }
}
