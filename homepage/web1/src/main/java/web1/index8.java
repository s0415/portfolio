package web1;

import java.io.FileWriter;
import java.io.PrintWriter;

public class index8 {
	//해당 배열 데이터를 파일로 이관(응용편)

	public static void main(String[] args) throws Exception {
		String data[]= {"홍길동","이순신","장보고","김유신"};
		//user.txt로 저장되도록 합니다.
		
		String url = "user.txt";
		PrintWriter pw = new PrintWriter(new FileWriter(url,true));
		int w=0;
		while(w<data.length) {
		pw.write(data[w].toString()+"\n");
		w++;
		}
		
		/*
		File f = new File("user.txt");
		int ea = data.length;
		int w =0;
		PrintWriter pw = new PrintWriter(f);
		while(w<ea) {
			//System.out.println(data[w]);
			pw.write(data[w]+"\n");
			w++;
		}
		*/
		
		pw.close();
	}
}
