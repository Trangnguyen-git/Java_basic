package KieuDuLieu;

public class Company {
    public static String Company_name = "Padi";
    public static String Address = "Vu Tong Phan";
    public static String Phone = "0222222222";
    public static String Email = "padi@gmail.com";

    public static void getInfoCompany(){
        System.out.println("Company name: " + Company_name);
        System.out.println("Address: " + Address);
        System.out.println("Phone: " + Phone);
        System.out.println("Email: " + Email);
    }

    public static String getCompanyName(){
        return Company_name;
    }
    public static String getEmail(){
        return Email;
    }
}
