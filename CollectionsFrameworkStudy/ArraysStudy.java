package CollectionsFrameworkStudy;

import java.util.*;

class ArraysStudy {
    public static void main(String[] args) {
        int[]	   arr   = {0,1,2,3,4};
        int[][]	arr2D = {{11,12,13}, {21,22,23}};

        System.out.println("arr="+Arrays.toString(arr));
        System.out.println("arr2D="+Arrays.deepToString(arr2D));

        int[] arr2 = Arrays.copyOf(arr, arr.length); // 모든 배열 복사
        int[] arr3 = Arrays.copyOf(arr, 3); // 3개의 배열 복사 인덱스 값 아님.
        int[] arr4 = Arrays.copyOf(arr, 7); // 기존 배열보다 크기가 크면 0으로 채움
        int[] arr5 = Arrays.copyOfRange(arr, 2, 4); // 인덱스 값이고 index 2,3의 값이 복사됨
        int[] arr6 = Arrays.copyOfRange(arr, 0, 7); // 인덱스 값, index 0부터 6까지 길이만큼 복사됨

        System.out.println("arr2="+Arrays.toString(arr2));
        System.out.println("arr3="+Arrays.toString(arr3));
        System.out.println("arr4="+Arrays.toString(arr4));
        System.out.println("arr5="+Arrays.toString(arr5));
        System.out.println("arr6="+Arrays.toString(arr6));

        int[] arr7 =  new int[5];
        Arrays.fill(arr7, 9);  // 9로 채운다
        System.out.println("arr7="+Arrays.toString(arr7));

        Arrays.setAll(arr7, i -> (int)(Math.random()*6)+1); // 1부터 6까지 임의 정수로 채움
        System.out.println("arr7="+Arrays.toString(arr7));

        for(int i : arr7) {
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            System.out.println(new String(graph)+i);
        }

        String[][] str2D  = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};
        String[][] str2D2 = new String[][]{{"aaa","bbb"},{"AAA","BBB"}};

        System.out.println(Arrays.equals(str2D, str2D2));     // false
        System.out.println(Arrays.deepEquals(str2D, str2D2)); // true

        char[] chArr = { 'A', 'D', 'C', 'B', 'E' };

        System.out.println("chArr="+Arrays.toString(chArr));
        System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B')); // 정렬하지 않으면 정상 작동 하지않는다.
        System.out.println("= After sorting =");
        Arrays.sort(chArr); // 기본 정렬해준다
        System.out.println("chArr="+Arrays.toString(chArr));
        System.out.println("index of B ="+Arrays.binarySearch(chArr, 'B'));

//        List a = Arrays.asList(1,2,3,4,5,6);
//        a.add("a");  UnsupportedOperationException 발생 객체를 추가할수 없다.
        List b = new ArrayList(Arrays.asList(1,2,3,4,5,6));
        b.add("a");
        System.out.println(b);
    }


}