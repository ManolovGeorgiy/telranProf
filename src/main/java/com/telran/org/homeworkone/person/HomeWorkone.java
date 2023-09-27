package com.telran.org.homeworkone;

public class HomeWorkone {

    public static void main (String[] args) {
        // Создание объектов с использованием конструкторов
        Person person1 = new Person(); // Объект созданный с помощью Person()
        Person person2 = new Person("Georgiy", "Georgiy Manolov", 38); // Объект созданный с параметрами

        // Заполнение полей объекта person1 с помощью сеттеров
        person1.setName("Anna");
        person1.setFullName("Anna Nesterenko");
        person1.setAge(32);

        // Вызов методов move() и talk() для объектов
        person1.move();
        person1.talk();
        person2.move();
        person2.talk();
    }
}


