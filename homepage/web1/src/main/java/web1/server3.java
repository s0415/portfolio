package web1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server3 {
	//InputStream -> InputStreamReader -> BufferedReader (TCP - 통신)
	//동기채팅 구현 -> 비동기채팅 구현(Thread) -> run() 메소드에 적용
	//비동기 채팅 구현 Thread 및 run() -> while write만 구현
 	//Server
	
	public static void main(String[] args) {
		new chat_server3();

	}

}
class chat_server3{
	ServerSocket ss = null;
	Socket sk = null;
	BufferedReader br = null;
	BufferedWriter bw = null;
	Scanner sc = new Scanner(System.in);		
	public chat_server3() {
		try {
			//1.서버소켓 생성
			this.ss= new ServerSocket(8000);
			System.out.println("START CHAT");
			
			//2.클라이언트 연결대기
			this.sk = this.ss.accept();
			System.out.println("Connect OK");
			
			//3.채팅 입/출력 스트림 생성
			this.br = new BufferedReader(new InputStreamReader(this.sk.getInputStream()));
			this.bw = new BufferedWriter(new OutputStreamWriter(this.sk.getOutputStream()));
			
			while(true) {
				//4.클라이언트 메세지를 받는 사항
				String msg = this.br.readLine();
				if(msg.equals("exit")) {
					System.out.println("Client Out");
					break;
				}
				System.out.println("message : "+msg);
				
				//5.서버에서 클라이언트로 보내는 메세지
				System.out.println("sendmessage : ");
				String msg2 = this.sc.nextLine();
				this.bw.write(msg2+"\n");	//줄바꿈으로 통신여부를 확인
				this.bw.flush();
			}
		}
		catch(Exception e) {
			System.out.println("Client Connect Error");
		}
		finally {	//프로그램 완전종료
			try {
				this.sc.close();
				this.sk.close();
				this.br.close();
				this.bw.close();
			}
			catch(Exception e) {
				System.out.println("Client Error");
			}
			
		}
	}
}