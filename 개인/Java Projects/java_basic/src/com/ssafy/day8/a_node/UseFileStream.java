package com.ssafy.day8.a_node;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class UseFileStream {
    public static void main(String[] args) throws IOException {
        UseFileStream st = new UseFileStream();
        
        // 무작정 크게한다고, OS의 리소스를 사용하는거기 때문에 적당히 해야한다.
        // IO는 조금만할수록 성능이 좋다.
//        System.out.printf("buffer size: %d, time: %d%n", 100, st.fileMove(100));
        // System.out.printf("buffer size: %d, time: %d%n", 1000, st.fileMove(1000));
         System.out.printf("buffer size: %d, time: %d%n", 10000, st.fileMove(10000));
        // System.out.printf("buffer size: %d, time: %d%n", 100000,
        // st.fileMove(100000));
        // System.out.printf("buffer size: %d, time: %d%n", 1000000,
        // st.fileMove(1000000));
    }

    public long fileMove(int bufferSize) {
        long start = System.currentTimeMillis();
        // TODO: 본인의 컴퓨터에서 크기가 큰 파일을 선택하세요.
        File src = new File("C:\\Users\\SSAFY\\Desktop\\1학기\\Java\\spring-tool-suite-4-4.21.0.RELEASE-e4.30.0-win32.win32.x86_64.self-extracting.jar");
        File target = new File("c:\\Temp\\sts.jar");
        // 데이터를 이동시킬 버퍼
        byte[] buffer = new byte[bufferSize];
        // TODO: bufferSize 크기의 byte []을 이용해서 src를 target에 복사하시오.
        try(FileInputStream input = new FileInputStream(src);
        	FileOutputStream output = new FileOutputStream(target);) {
        	int read = 0;
        	while((read = input.read(buffer)) > 0) {
        		output.write(buffer, 0, read);
        	}
        } catch(IOException e) {
        	e.printStackTrace();
        }
        // END
        return System.currentTimeMillis() - start;
    }
}
