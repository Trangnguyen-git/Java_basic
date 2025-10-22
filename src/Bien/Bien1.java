package Bien;

public class Bien1 {
    public void sayHello() {
        int n = 10;
        System.out.println("Gia tri cua n la: " + n);
    }

    public static void main(String[] args) { //hàm main dùng để thực thi code -> bắt buộc có trong class JAVA
//
//        //biến kiểu chuối
//        String email = "admin@example.com";
//
//        //biến kiểu số
//        int age = 24;
//        int year = 2025;
//
//        System.out.println(email);
//        System.out.println(age);
//        System.out.println(year);
        Bien1 bienLocal = new Bien1();
        bienLocal.sayHello();
    }

}
