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
        this.weight = weight;
        this.color = color;
        this.coordinates = coordinates;
    }
    // Но мы же не дебилы каждый раз прописывать такую функцию. Воспольуемся конструктором, чтобы задавать поля при создании класаа
    public Transport (float speed, float weight, String color, byte[] coordinates) {// Конструктор - то как будут задаваться поля при созданиии объекта класса
        // Название не абы какое, а точно такое как у класса
        this.speed = speed;
        this.weight = weight;
        this.color = color;
        this.coordinates = coordinates;
    }
    // Конструкторов можнос сделать несколько, но они должны отличаться, иначе иде будет ругаться.
    // Нпаример чтобы не все значения можно было задавать при создании объекта
    public Transport(float speed, float weight) {
        this.speed = speed; // напоминаю this это обращение к этому же классу, в котором прописывается этот контекст
        this.weight = weight;
    }
}
