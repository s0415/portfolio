package web1;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
/*
	TCP
	[Server]
	InputStream -> byte -> 출력
	
	[Client]
	OutputStream -> byte ->전송
	
	통신 - Socket (get붙음)
	소켓 포함 getInputStream() (byte단위) ->InputStream 
	소켓 포함 getOutputStream()(byte단위) ->OutputStream 
 */
public class server2 {
	//TCP - server
	public static void main(String[] args) {
		chat_server2 cs = new chat_server2(8000);
		
	}

}
class chat_server2{
	ServerSocket sk = null;
	Socket so =  null;
	InputStream is = null;
	OutputStream os = null;
	OutputStreamWriter osw = null;
	String msg = null;
	
	public chat_server2(int port) {
		try {
			this.sk = new ServerSocket(port);
			System.out.println("SERVER START");
			while(true){
				this.so = this.sk.accept();
				this.is = this.so.getInputStream();
				byte data[]=new byte[1024];
				int n = this.is.read(data);
				this.msg = new String(data,0,n);
				System.out.println(this.msg);
			}
		}
		catch(Exception e) {
			
		}
	}
}
