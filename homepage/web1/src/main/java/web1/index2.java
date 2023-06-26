package web1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

public class index2 {

	public static void main(String[] args) throws Exception {
		File f = new File("test.txt");	//경로 선언 (web1에다가 바로 생성)		
		
		InputStream is = new FileInputStream(f);
		InputStreamReader isr = new InputStreamReader(is,Charset.forName("UTF8"));	//Charset.forName : InputStream,BufferedReader에 사용 X
		BufferedReader br = new BufferedReader(isr);
		
		String result;
		while((result=br.readLine())!=null) {
			System.out.println(result);
		}
		is.close();
		isr.close();
		br.close();
		
	}

}
