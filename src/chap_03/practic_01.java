package chap_03;

public class practic_01 {
    public static void main(String[] args) {
        int a = 68;
        int b = 75;
        int c = 72;
        int max = (a > b) && (a > c) ? a : (b > c)? b: c;
        System.out.println("꼴찌의 몸무게는 " + max + "kg입니다.");
    }
}
