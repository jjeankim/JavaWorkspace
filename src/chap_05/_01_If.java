package chap_05;

public class _01_If {
    public static void main(String[] args) {
        int hour = 15;
//        if (hour < 14) {
//            System.out.println("샷 추가");
//            System.out.println("아메리카노 + 1");
//        }
//        System.out.println("주문 완료");
        boolean morningCoffee = false;
        if (hour < 14 || morningCoffee) {
            System.out.println("아메리카노" + 1);
        }
        System.out.println("주문 완료");
    }
}
