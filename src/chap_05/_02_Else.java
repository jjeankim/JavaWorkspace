package chap_05;

public class _02_Else {
    public static void main(String[] args){
        int hour = 10;
        boolean morningCoffee = true;

        if (hour >= 14 || morningCoffee) {
            System.out.println("아메리카노(디카페인) + 1");
        }else {
            System.out.println("아메리카노 + 1");
        }
        System.out.println("주문 완료");
    }
}
