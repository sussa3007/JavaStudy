package InputOutput;

import java.io.*;
import java.util.Arrays;

public class ClassFileStudy {
    public static void main(String args[]) throws IOException {
        File file = new File("./codes.txt");
        file.createNewFile(); // 파일이 없다면 만든다

        System.out.println(file.getPath()); // 파일 위치
        System.out.println(file.getParent()); //  파일의 상위 경로
        System.out.println(file.getCanonicalPath()); // root 경로
        System.out.println(file.canWrite()); // 편집 가능? 파일이 존재하는지?

        // 현재 디렉토리에서 확장자가 TXT 파일만을 대상으로, 파일명 앞에 code라는 문자열을 붙여줌
        File parentDir = new File("./");
        File[] list = parentDir.listFiles();
        System.out.println(Arrays.toString(list));

        String prefix = "code";

        for (File value : list) {
            String fileName = value.getName();

            if (fileName.endsWith("txt") && !fileName.startsWith("code")) {
                value.renameTo(new File(parentDir, prefix + fileName));
            }
        }



    }

}