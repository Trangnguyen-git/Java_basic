package KieuDuLieu;

public class TinhToan {

    //hàm trả về
    public static int cong2SoNguyen() {
        return 10 + 20;
    }

    //không có hàm trả về
    public static void cong3SoNguyen() {
        System.out.println(10 + 20 + 30);
    }
//    public static void main(String[] args) {
//        System.out.println(cong2SoNguyen());
//        System.out.println("Tăng thêm 10 = " + (cong2SoNguyen()+10));
//
//        cong3SoNguyen();
//
//    }


    static void welcome(String name) {
        System.out.println("Xin chào " + name);
    }

    public static void main(String[] args) {
        welcome("Triều");
        welcome("Như");
        welcome("Mẫn");
    }

}
