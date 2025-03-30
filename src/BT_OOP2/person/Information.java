package BT_OOP2.person;

public class Information  {
    public static void main(String[] args) {
        // Tạo đối tượng Person
        Person person = new Person("Nguyen Van A", 30, "Nam", "Ha Noi", "0987654321");
        System.out.println(person.age);
        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.gender);
        System.out.println(person.phone);
    }
}
