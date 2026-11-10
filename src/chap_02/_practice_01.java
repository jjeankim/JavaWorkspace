package chap_02;

public class _practice_01 {
    public static void main(String[] args){
        int startTime = 7;
        String activity = "기상, 아침식사";
        System.out.println("---나의 하루 계획---");
        System.out.println(startTime + "시:" + activity);
        startTime += 1;
        activity = "자바 학습";
        System.out.println(startTime + "시:" + activity);
        startTime += 3;
        activity = "휴식";
        System.out.println(startTime + "시:" + activity);
    }
}
