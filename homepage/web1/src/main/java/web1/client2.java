package web1;

import java.io.BufferedReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client2 {
	//TCP - client
	public static void main(String[] args) {
		new chat_client2("localhost",8000);

	}

}
class chat_client2{
	BufferedReader br = null;
	String msg = null;
	Socket sk = null;
	OutputStream os = null;
	
	public chat_client2(String ip,int port) {
		try {
		while(true) {
			this.sk = new Socket(ip,port);
			Scanner sc = new Scanner(System.in);
			System.out.println("message : ");
			String msg = sc.nextLine();
			//System.out.println(this.br.readLine());
			this.os = this.sk.getOutputStream();
			this.os.write(msg.getBytes());
		}
		
		}
		catch(Exception e) {
			
		}
	}
}