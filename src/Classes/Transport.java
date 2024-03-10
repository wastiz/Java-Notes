package Classes;

public abstract class Transport {
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


    // Абстрактные классы
    // Суть абстрактных классов заключается в том, что нельзя создать объекты этих классов
    // Для чего они тогда. Для прописания основных полей и методов. Чтобы это использовать логично надо обязательно прописать классы наследники
    // Но почему абстрактные, а не обычные? Для лучшего структурирования и инкапсуляции

    // Для того, чтобы создать абстрактный класс нам надо просто прописать перед class abstract

    // Есть еще абстрактные функции. Это функции, которые можно просто объявить в абстрактнои классе. Но логику ты внутри никакую не пропишешь
    // Собственно в чем смысл тогда? Так как чтобы от абстрактного класса появилчся смысл надо создать класс наследник,то и функции эти тоже надо переписать
    // в наследниках. В общем, абстрактные функции нужны для напоминания что надо их переписать в наследниках
}
