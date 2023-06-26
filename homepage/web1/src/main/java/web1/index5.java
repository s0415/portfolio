package web1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class index5 {
	//FileReader = InputStream + InputStreamReader
	//FileWriter(기존 데이터에서 추가 가능) = OutputStream + OutputStreamWriter
	
	public static void main(String[] args) throws Exception {
		File f = new File("test.txt");
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
		br.close();
		fr.close();
		
		File z = new File("write.txt");
		FileWriter fw = new FileWriter(z,true);	//true : 기존 데이터가 삭제되지 않고 남겨둔 상태에서 추가됨
		fw.write("Filewrite로 저장시킴"+"\n");
		fw.close();
	}

}
