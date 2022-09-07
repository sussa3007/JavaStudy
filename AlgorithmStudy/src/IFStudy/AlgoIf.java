package IFStudy;

import java.io.*;
import java.util.StringTokenizer;

public class AlgoIf {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a, b, c;
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

            // 모두 다른경우
        if (a!=b && b!=c && a!=c){
            int max = Math.max(a,Math.max(b,c));
            System.out.println(max*100);
        } else if (a==b && a==c) { // 모두 같은경우
            System.out.println(10000+a*1000);
        } else if (a==b || a==c) { // a랑 하나가 같은경우
            System.out.println(1000+a*100);
        } else System.out.println(1000+b*100); // b랑 c가 같은 경우


    }
}
class Test1000 { // 나눠지는 최소값
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<n; i++){
            if(n%i==1){ answer=i; break; }
        }
        return answer;
    }
}
class Test1001 { // 123 -> 6 자리수 모두 더하기
    public int solution1(int n) {
        int answer = 0;
        String a = ""+n;
        for(int i=0; i<a.length(); i++){
            answer += Integer.parseInt(String.valueOf(a.charAt(i)));
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}
class B1330 {
    void study () throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String b = bf.readLine();
        String[] arr = b.split(" ");
        Integer.parseInt(arr[0]);
        if(Integer.parseInt(arr[0])>Integer.parseInt(arr[1])){
            System.out.println(">");
        } else if(Integer.parseInt(arr[0])<Integer.parseInt(arr[1])){
            System.out.println("<");
        } else System.out.println("==");

    }
}
class B9498 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        String b;
        if(a>=90){
            b = "A";
        } else if (a>=80) {
            b= "B";
        } else if (a>=70) {
            b= "C";
        } else if (a>=60) {
            b= "D";
        } else b="F";
        System.out.println(b);

    }
}

class B2753 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        if (a%4==0 && (a%100!=0 || a%400==0)){
            System.out.println(1);
        } else System.out.println(0);
    }
}
class B14681 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(bf.readLine());
        int y = Integer.parseInt(bf.readLine());
        int q = 0;
        if(x>0&&y>0) {q=1;}
        else if (x<0&&y>0) {q=2;}
        else if (x<0&&y<0) {q=3;}
        else if (x>0&&y<0) {q=4;}
        System.out.println(q);
    }
}
class B2884 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String x = bf.readLine();
        String[] str = x.split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        if(b<45){
            str[1] = 60-(45-b)+"";
            if(a==0){
                str[0] = 23+"";
            }else str[0] = a-1+"";
        } else str[1] = b-45+"";
        System.out.println(str[0]+" "+str[1]);
    }
}
class B2525 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String x = bf.readLine();
        String[] str = x.split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = Integer.parseInt(bf.readLine());
        if((b+c)>=60){
            int t = (b+c)/60;
            b = (b+c)%60;
            if((a + t)>23){
                a = ((a+t)-24);
            }else a=(a +t);
        } else b= b+c;
        System.out.println(a+" "+b);
    }
}
class B2480 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int a, b, c;
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        // 모두 다른경우
        if (a!=b && b!=c && a!=c){
            int max = Math.max(a,Math.max(b,c));
            System.out.println(max*100);
        } else if (a==b && a==c) { // 모두 같은경우
            System.out.println(10000+a*1000);
        } else if (a==b || a==c) { // a랑 하나가 같은경우
            System.out.println(1000+a*100);
        } else System.out.println(1000+b*100); // b랑 c가 같은 경우


    }
}