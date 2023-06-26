package web1;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class index7 {
	//이미지, 동영상 로드 => byte
	
	
	public static void main(String[] args) throws Exception {
		/*
		File f = new File("image.jpg");
		InputStream is = new FileInputStream(f);
		//System.out.println(is.read());		//한 픽셀의 rbg값을 출력함
		
		byte a[]= new byte[is.available()];
		//	=	byte a[]=new byte[(int)f.length()];
		//System.out.println(is.read(a));			//이미지파일 용량 확인
		
		
		File cp = new File("test.jpg");
		OutputStream os = new FileOutputStream(cp);
		//	한줄로쓰면 = OutputStream os = new FileOutputStream("test.jpg");
		 * 
		int w;
		while((w=is.read(a))!=-1) {
			os.write(a, 0, w);
		}
		os.close();
		is.close();
		*/
		
		//**다른방식-------------------------------------------------------------
		
		File f2 = new File("image.jpg");
		DataInputStream ds = new DataInputStream(new FileInputStream(f2));
		byte a2[]= new byte[ds.available()];
		ds.readFully(a2);	//이미지 전체 파일을 읽어들임(반복문 없이 적용)
		
		FileOutputStream os = new FileOutputStream("test2.jpg");
		os.write(a2);
		os.close();
		ds.close();
	}

}