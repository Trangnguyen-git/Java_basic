package Bien;

public class BienLocal {
    public void sayHello() {
        int n = 10;
        System.out.println("Gia tri cua n la: " + n);
    }

    public static void main(String[] args) {
        BienLocal bien_local = new BienLocal();
        bien_local.sayHello(); //main sẽ gọi hàm ở trên
    }
}

