package web1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;

public class index4 {
	//input&output 응용편
	/*
	 test.txt에 있는 내용을 write.txt로 내용이 복사되도록 하시오. 
	*/
	public static void main(String[] args) throws Exception{
		File a1 = new File("test.txt");
		File a2 = new File("write.txt");
		
		InputStream is = new FileInputStream(a1);
		InputStreamReader isr = new InputStreamReader(is,Charset.forName("UTF8"));
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream os = new FileOutputStream(a2);
		OutputStreamWriter ow = new OutputStreamWriter(os,Charset.forName("UTF8"));
		BufferedWriter bw = new BufferedWriter(ow);
		String data;
		
		while((data=br.readLine())!=null){
			bw.write(data+"\n");
			bw.flush();
		}
		os.close();
		bw.close();
		br.close();
		is.close();
		
	}

}
