package AlgorithmStudy.src.AlgoStudy;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

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
        /* 첫번째 수를 입력받음 */
        br.readLine();
        /* 비교 대상 수들을 입력받아 배열에 저장 */
        int[] intArr= Arrays.stream(br.readLine().trim().split(" "))
                            .mapToInt(Integer::parseInt)
                            .distinct()
                            .sorted()
                            .toArray();
        /* 비교할 수들의 갯수 저장*/
        int count= Integer.parseInt(br.readLine().trim());
        /* 비교할 수들을 입력받아 배열에 저장 */
        int[] compArr= Arrays.stream(br.readLine().trim().split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();
        /* 결과를 저장할 count 크기로 배열 초기화 하고 0으로 채움*/
        int[] result= new int[count];
        Arrays.fill(result,0);
        /* 비교할 수들을 순회하며 이진 탐색을 진행해서 존재한다면 결과 배열의 비교할 수 인덱스 값에 1저장*/
        for(int comp=0;comp<compArr.length;comp++){
            if(Arrays.binarySearch(intArr,compArr[comp])>=0) {
                result[comp]=1;
            }
        }
        /* 결과 순회하며 출력 */
        for (int i : result) bw.write(i+"\n");
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
        /*카드들을 큐에 넣어줌*/
        for(int i = 1; i<=num; i++){
            cardQ.add(i);
        }
        /*카드 하나는 빼고 하나는 뒤로 추가
        * 마지막 카드번호를 알아야 되기 때문에 길이 보다 적게 순회해준다*/
        for (int i = 0; i < num-1; i++) {
            cardQ.poll();
            cardQ.add(cardQ.poll());
        }
        /* 마지막 카드 출력*/
        bw.write(cardQ.poll().toString());
        bw.flush();

    }
    public static void B10816 () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        /* 주어진 N개의 갯수*/
        br.readLine();
        /* 비교 대상 수들을 입력받아 정렬 후 리스트로 변환*/
        List<Integer> intArr = Arrays.stream(br.readLine().trim().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted().boxed().collect(Collectors.toList());
        /* 주어진 N개의 갯수*/
        br.readLine();
        /* 비교할 수를 입력 받아 리스트로 변환*/
        List<Integer> compArr= Arrays.stream(br.readLine().trim().split(" "))
                .mapToInt(Integer::parseInt)
                .boxed().collect(Collectors.toList());
        /* 순서를 유지하고 Map을 생성해 비교할 수를 key 기본 value를 0으로 셋팅 */
        LinkedHashMap<Integer,Integer> compMap = new LinkedHashMap<>();
        for (Integer i : compArr) compMap.put(i, 0);
        /* 비교 대상 수들을 순회하면서 Map에 존재여부를 확인하고 존재한다면 해당 키에 대한 value를 1씩 증가*/
        for (Integer integer : intArr) if (compMap.containsKey(integer)) compMap.put(integer,compMap.get(integer)+1);
        /* 비교할 수들을 순회하며 value를 출력 */
        for (Integer i : compArr) bw.write(compMap.get(i)+" ");
        bw.flush();
    }


}
