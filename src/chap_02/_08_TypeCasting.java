package chap_02;

public class _08_TypeCasting {
    public static void main(String[] args){
//        int score = 93 + (int) 98.8;
//        System.out.println(score);
//        double convertedScoreDouble = score;
//
////        System.out.println(score);
////        System.out.println((float) score);
////        System.out.println((double) score);
////        float score_f = 93.3F;
//        double score_d =(double) 93 + 98.8;
//        System.out.println(score_d);
//        int convertedScoreInt = (int) score_d;
////        System.out.println((int) score_f);
////        System.out.println((int) score_d);
//        // 문자열로 형변환
//        String s1 = String.valueOf(93);
//        System.out.println(s1);
//        String s2 = String.valueOf(98.8);
//        System.out.println(s2);
//        System.out.println("당신의 점수는 " + s1 + "점입니다.");

        // 숫자로 형변환 Integer.parseInt(),Double.parseDouble()
        int i = Integer.parseInt("93");
        System.out.println(i);
        double d = Double.parseDouble("98.8");
        System.out.println(d);
        System.out.println(i + 1);
        System.out.println(d + 1);
    }
}
