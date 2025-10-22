package Bien;


public class BienInstance {
    String name = "Phương";
    int age = 32;
    String address = "Ha Noi";

    public void getInfo() {
        System.out.println("Name: " + name + ", Age: " + age + "Address: " + address);
    }

    public void getInfo1() {
        System.out.println("Name: " + name + ", Age: " + age + "Address: " + address);
    }

    public static void main(String[] args) {
        BienInstance bientoancuc = new BienInstance(); // khởi tạo đối tượng 1 class
        System.out.println("Name: " + bientoancuc.name); //lấy tên đại diện để gọi biến
    }
}
