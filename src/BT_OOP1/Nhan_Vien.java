package BT_OOP1;

public class Nhan_Vien {
    String name;
    String address;
    int age ;

    public Nhan_Vien(String name, String address, int age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public void showInfo(){
      System.out.println("name: "+name);
      System.out.println("address: "+address);
      System.out.println("age: "+age);
  }
}
