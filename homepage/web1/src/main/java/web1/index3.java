package web1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class index3 {
	//output - FileWriter 기본
	//BufferedWriter
	//PrintWriter
	//FileOutputStream
	//DataOutputStream
	
	public static void main(String[] args) throws Exception {
		File f = new File("write.txt");
		OutputStream os = new FileOutputStream(f);
		/*
		//OutputStream os = new FileOutputStream(f); 까지만 썼을때는 아래 코드 사용해야함
		byte a[] = {1,2,3,4,5};
		os.write(a[2]);
		os.close();
		 */
		
		OutputStreamWriter ow = new OutputStreamWriter(os,Charset.forName("UTF8"));
		/*
		//OutputStreamWriter ow = new OutputStreamWriter(os,Charset.forName("UTF8")); 까지만 썼을때는 아래 코드 사용해야함
		String data = "홍길동";
		ow.write(data);
		ow.close();
		 */
		
		BufferedWriter bw = new BufferedWriter(ow);
		String data = "강감찬 고객님 정보 파일!!!!!!!!!!!!";
		bw.write(data);			//기존 데이터 삭제 후 데이터 입력됨
		bw.append("\n");
		String data2 = "홍길동 정보도 확인";
		bw.write(data2);
		//bw.append("홍길동");		//append : 기존 데이터에 간단한 데이터 추가 가능
		bw.flush();				//메모리로 남아있는 데이터 출력(환원)
		bw.close();
		
		}

}
