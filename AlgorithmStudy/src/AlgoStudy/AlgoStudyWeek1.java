package AlgorithmStudy.src.AlgoStudy;

import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class AlgoStudyWeek1 {

    public static void main(String[] args) throws IOException {

    }
    public static void B1920_TimeOut () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine().trim());
        int count;
        int[] intArr = new int[input];
        int[] compArr;
        int[] result;
        String[] strArr;
        strArr = br.readLine().trim().split(" ");
        for (int i=0; i<input; i++){
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        count = Integer.parseInt(br.readLine().trim());
        compArr = new int[count];
        result = new int[count];
        strArr =br.readLine().trim().split(" ");
        for (int i=0; i<count; i++){
            compArr[i] = Integer.parseInt(strArr[i]);
        }
        Arrays.fill(result,0);
        for(int i=0;i<compArr.length; i++){
            for (int t : intArr){
                if(compArr[i]==t){
                    result[i] = 1;
                    break;
                }
            }
        }
        for (int a : result) System.out.println(a);
    }
    public static void B1920 () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();
        int count;
        int[] intArr;
        int[] compArr;
        int[] result;
        intArr = Arrays.stream(br.readLine().trim().split(" "))
                .mapToInt(Integer::parseInt)
                .distinct()
                .sorted()
                .toArray();
        count = Integer.parseInt(br.readLine().trim());
        result = new int[count];
        compArr = Arrays.stream(br.readLine().trim().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        Arrays.fill(result,0);
        for(int comp=0;comp<compArr.length;comp++){
            if(Arrays.binarySearch(intArr,compArr[comp])>=0) {
                result[comp]=1;
            }
        }
        for (int a : result) bw.write(a+"\n");
        bw.flush();
    }
    // 1부터 num 까지 카드가 있다.
    // 1은 버리고 n+1카드는 num카드 뒤로 옮긴다.
    // 위 과정을 반복하다 마지막 남은 카드 출력.
    public static void B2164_outmemory () throws IOException {
        // 메모리초과
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        Queue cardQ = new LinkedList();
        for(int i = 1; i<=num; i++){
            cardQ.add(i);
        }
        while (true){ // 왜 메모리 초과가 나지?
            cardQ.poll();
            if (cardQ.size()==1) break;
            cardQ.add(cardQ.poll());
        }
        bw.write(cardQ.poll().toString());
        bw.flush();

    }
    public static void B2164 () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        Queue cardQ = new LinkedList();
        for(int i = 1; i<=num; i++){
            cardQ.add(i);
        }
        for (int i = 0; i < num-1; i++) {
            cardQ.poll();
            cardQ.add(cardQ.poll());
        }
        bw.write(cardQ.poll().toString());
        bw.flush();

    }


}
