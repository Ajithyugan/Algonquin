package Networking;
import java.io.*;
import java.net.*;

public class Echo_server {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {	


			ServerSocket myServer = new ServerSocket(1254);	
			
			System.out.println("SERVER is waiting for the CLIENT");
			System.out.println("Loading...........................");
			Socket socket = myServer.accept();
			System.out.println("Client is connected");


			DataOutputStream os = new DataOutputStream(socket.getOutputStream());
			
			os.writeBytes("Hello, This is Server Have a Nice Day");
		
			socket.close();
			myServer.close();

		}
		catch(UnknownHostException e ) {
			System.out.println ("Server not found" + e);
		}
		catch (IOException e) {
			System.out.println ("I/O error"+ e);

		} 

	}


}
