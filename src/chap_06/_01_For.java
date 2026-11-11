package chap_06;

public class _01_For {
    public static void main(String[] args) {
//        for(int i = 0; i < 10; i++) {
//            System.out.println("어서오세요. 나코입니다.");
//        }
//        for (int i = 1; i < 10; i+=2) {
//            System.out.print(i + " ");
//        }
//        for (int i = 5; i > 0; i--) {
//            System.out.println(i + " ");
//        }
        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}
