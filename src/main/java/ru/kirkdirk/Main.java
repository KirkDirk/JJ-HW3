package ru.kirkdirk;

import java.io.*;
//import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        /*
         * Задание 1:
         * Разработайте класс Student с полями String name, int age, transient double GPA (средний балл).
         * Обеспечьте поддержку сериализации для этого класса.
         * Создайте объект класса Student и инициализируйте его данными.
         * Сериализируйте этот объект в файл.
         * Десериализируйте объект обратно в программу из файла.
         * Выведите все поля объекта, включая GPA, и обсудите почему значение GPA не было
         * сохранено/восстановлено.
         *
         * Задание 2 (не обязательно):
         * ** Выполнить задачу 1 используя другие типы сериализаторов (в xml и json документов).
         */

//        private static final ObjectMapper objectMapper = new ObjectMapper();

        Student student = new Student("Ivan", 19, 0);

        try (FileOutputStream fileOutputStream = new FileOutputStream("db.bin");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            objectOutputStream.writeObject(student);
            System.out.println("Студня записали\n");
        }

        try (FileInputStream fileInputStream = new FileInputStream("db.bin");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
            student = (Student)objectInputStream.readObject();
            System.out.println("Студня считали\n");
            System.out.println(" Name: " + student.getName());
            System.out.println(" Age: " + student.getAge());
            System.out.println(" GPA = " + student.getGPA());
        }


    }
}