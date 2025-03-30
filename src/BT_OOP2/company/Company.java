package BT_OOP2.company;

import BT_OOP2.person.Person;

public class Company {
    public static void main(String[] args) {
        // Tạo đối tượng Person
        Person person = new Person("Nguyen Van A", 30, "Nam", "Ha Noi", "0987654321");// Hiển thị thông tin (chỉ hiển thị name, age, gender)
        System.out.println("Name: " + person.name);
        System.out.println("Age: " + person.age);
        System.out.println("Gender: " + person.gender);
    }
}
