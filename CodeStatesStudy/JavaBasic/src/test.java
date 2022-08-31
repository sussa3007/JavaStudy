public class test {
    public static void main(String[] args) {
        System.out.println(isPrime(97));
        int a = (int) Math.sqrt(97);
        System.out.println(a);
    }

    static boolean isPrime(int num) {
        // TODO:
        if(num<2) return false;
        if(num == 2) return true;
        if(num%2 == 0) return false;
        int a = (int) Math.sqrt(num);
        for (int i = 3; i<a; i += 2){
            if(num%i == 0){
                return false;
            }
        } return true;
    }
}


//        public static String convertScoreToGradeWithPlusAndMinus(int score) {
//        //
//        String grade="";
//        if (score>100 || score<0) return "INVALID SCORE";
//        else if (score>=90){
//            grade = "A";
//            if (score>=98) return grade + "+";
//            if (score<=97) return grade + "-";
//            return grade;
//        } else if (score>=80){
//            grade = "B";
//            if (score>=88) return grade + "+";
//            if (score<=87) return grade + "-";
//            return grade;
//        } else if (score>=70){
//            grade = "C";
//            if (score>=78) return grade + "+";
//            if (score<=77) return grade + "-";
//            return grade;
//        }else if (score>=60){
//            grade = "D";
//            if (score>=68) return grade + "+";
//            if (score<=67) return grade + "-";
//            return grade;
//        } else return grade= "F";
//    }
//}
