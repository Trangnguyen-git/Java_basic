package KieuDuLieu;

public class ThongTin {
    public static void main(String[] args) {
        Company.getInfoCompany();

        String company_name = Company.getCompanyName(); //cùng là kiểu String nên gán được biến với String company_name
        System.out.println("\nThông tin công ty " + company_name);
        //thông tin cần sử dụng luôn, không cần dùng đi dùng lại -> dùng void
        //thông tin cần sử dụng nhiều lần, ở nhiều chỗ khác nhau -> khai báo giá trị 1 lần sau đó trả về giá trị đó để dùng -> khai báo hàm có kiểu trả về


    }
}
