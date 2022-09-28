package RecursiveFunction;

public class RecursiveFunction {
    private static int countFibTail =0;
    private static int countFib =0;
    private static int countFactTail =0;
    private static int countFact =0;
    public static void main(String[] args) {
        System.out.println("30 th fibonacci Tail : "+fibonacciTail(30,0,1));
        System.out.println("fibonacciTail : "+ countFibTail);
        System.out.println("30 th fibonacci : "+fibonacci(30));
        System.out.println("fibonacci : "+ countFib);
        System.out.println("30 th fibonacci Memo: "+fibonacci(30));
        System.out.println("fibonacci : "+ countFib);

//        long beforeTime = System.currentTimeMillis();
//        System.out.println(factorialTail(55,1));
//        System.out.println("factorialTail : "+ countFactTail);
//        long afterTime = System.currentTimeMillis();
//        long secDiffTime = (afterTime - beforeTime)*100;
//        System.out.println("시간차이1 : "+secDiffTime);

//        long beforeTime2 = System.currentTimeMillis();
//        System.out.println(factorial(55));
//        System.out.println("factorial : "+ countFact);
/*        long afterTime2 = System.currentTimeMillis();
        long secDiffTime2 = (afterTime2 - beforeTime2)*100;
        System.out.println("시간차이2 : "+secDiffTime2);*/

    }

    public static int fibonacci(int number) {
        countFib++;
        if(number <=1) return number;
        else return fibonacci(number-2)+ fibonacci(number-1);
    }
    public static int fibonacciTail(int input, int before, int after) {
        countFibTail++;
        if(input <=1) return after;
        else return fibonacciTail(input-1,after,before+after);
    }
    public static long factorialTail(long n, long acc){
        countFactTail++;
        if(n == 1) return acc;
        return factorialTail(n - 1, acc * n);
    }
    public static long factorial(long num){ // 재귀 함수
        countFact++;
        if(num == 1)return 1;
            // num의 값이 1일때도 예상하기 쉬운 케이스 이므로 1을 반환한다.
        else return num*factorial(num-1);
    }


//     5! = 5*4*4*3*1 = 120
//    public static int factorialFor(int num){ // 반복함수
//        int sum = 1;
//        for(int i = 2; i<=num; i++){
//            sum*=i;
//        }
//        return sum;
//    }
//
//    public static int factorial(int num){ // 재귀 함수
//        if(num == 1)return 1;
//        // num의 값이 1일때도 예상하기 쉬운 케이스 이므로 1을 반환한다.
//        else return num*factorialRecursion(num-1);
//    }

//    public static int fibonacci(int number){
//        int one = 1;
//        int two = 1;
//        int result = -1;
//        if(number==1) return one;
//        else if (number==2) return two;
//        else {
//            for(int i=2; i<=number; i++){
//                result = one+two;
//                one= two;
//                two=result;
//            }
//        }
//        return result;
//    }



}
