package chap_06;

public class _02_While {
    public static void main(String[] args) {
        int distance = 25;
        int move = 0;

        while (move < distance) {
            System.out.println("발차기를 합니다.");
            System.out.println("현재 이동 거리:" + move + "m");
            move += 3;
        }
        System.out.println("도착했습니다.");
    }
}
