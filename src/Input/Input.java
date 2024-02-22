package Input;

//Для того, чтобы начать пользоваться с вводами нам надо испортировать этот модуль
// Разумеется можем импортировать как свои модули так и встроенные как в python
import java.util.Scanner;
public class Input {
    public static void input(String[] args) {
        // Создадим сразу объект от класса, чтобы было проще
        Scanner scan = new Scanner(System.in); // Подмечаю что используем тип данных в виде этого класса
        System.out.print("Введите ваше имя: ");
        String username = scan.nextLine(); // Сразу запишем в переменную и внутри просто используем метод nextLine()
        System.out.println("Привет, " + username);
        // Готово. Базовый ввод вот такой

        // Но мы значем что просто так тип данных не можем менять, а в предыдущем инпуте мы в любом случае получаем строку, то для получения других типов данных используем другие инпуты
        int number = scan.nextInt();
        byte byt = scan.nextByte();
        boolean bool = scan.nextBoolean();
        // И так далее

        //Математические действия
        short num1 = 50, num2 = 10, result; // Да даные можно так записывать
        //result = num1 + num2;
        // Такой код будет выдавать ошибку, потому что можем выйти за пределы short, поэтому в таких случаях надо использовать тип данных выше
        int res = num1 + num2;

        //Другие мат действия
//        int res = num1 / num2;
//        int res = num1 * num2;
//        int res = num1 % num2;
        // Видим что все тоже самое. Не боимся пробовать использовать тоже самое из других языков, а если не получается то гуглим
    }
}
