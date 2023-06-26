package web1;

import java.io.FileWriter;
import java.io.PrintWriter;

public class index6 {
	/*
		 PrintWriter = FileWriter + OutputStreamWriter
		 장점 :File 클래스를 사용하지 않고 사용 가능
		 단점 : 추가 데이터를 사용하지 못함
	*/
	public static void main(String[] args) throws Exception {
		/*
		//PrintWriter 단독
		String url = "write.txt";
		String enc = "utf8";
		PrintWriter pw = new PrintWriter(url,enc);
		pw.write("이순신 고객 정보"+"\n");
		pw.write("강감찬 고객 정보");
		pw.close();
		*/
		
		String url = "write.txt";
		/*
		FileWriter fw = new FileWriter(url,true);
		PrintWriter pw = new PrintWriter(fw);
		*/
		
		//PrintWriter + FileWriter 두 코드를 한줄로 쓸 수 있음... ↓
		PrintWriter pw = new PrintWriter(new FileWriter(url,true));
		
		pw.write("\n홍길동 고객 정보");
		pw.close();
	}

}
