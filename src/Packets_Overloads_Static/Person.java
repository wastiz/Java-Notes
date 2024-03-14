package Packets_Overloads_Static;

public class Person {
    public int counter;

    public Person () {
        counter++;
    }

    public void getCount() {
        System.out.println(counter);
    }
}
