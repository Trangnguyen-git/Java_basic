package KieuDuLieu;

public class KieuDuLieu1 {
    public static void main(String[] args) { // hàm

        //kiểu dữ liệu nguyên thủy
        String description = "※カードの絵柄は重複する場合がありますが、それぞれ異なったシリアルナンバーが付与されます。\n" +
                "※購入後のキャンセルはできません。\n" +
                "※ご購入後、「未開封パック」に反映されているかご確認お願いいたします。反映されていない場合、決済エラーの場合がございます。\n" +
                "※一度決済エラー発生後、15分間は決済が行えません。お時間をおいて再度決済をお試しください。\n" +
                "※獲得できるポイントは、カードのレアリティごとに異なります。\n" +
                "※本パックは再販される場合がございます。\n" +
                "※販売期間及び内容は予告なく変更される場合がございます。";
        System.out.println(description);

        byte number = -12;
        System.out.println("Số được nhập là: " + number);

        boolean checkValue = false;   //true hoặc false
        System.out.println(checkValue);

        short number1 = 32767;
        System.out.println(number1);

        int number2 = 2000000111;
        System.out.println(number2);

        float number3 = 2.5F;
        System.out.println(number3);

        double number4 = 555555555d;
        System.out.println(number4);

        //hàm không có kết quả trả về


    }
}
