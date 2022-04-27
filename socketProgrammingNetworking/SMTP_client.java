package Networking;
 
import java.io.*;
import java.net.*;

public class SMTP_client {

	public	static String localHost = "192.168.0.34";
	public static int port =  1254;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Socket client =new Socket(localHost,port);
			System.out.println("Now Client connected to the Server");

			BufferedReader is = new BufferedReader(new InputStreamReader(client.getInputStream()));

			String severMsg = is.readLine();
			System.out.println("Message from Server :"+ severMsg);
			client.close();


		}
		catch(UnknownHostException e ) {
			System.out.println ("Server not found" + e);
		}
		catch (IOException e) {
			System.out.println ("I/O error"+ e);

		}
	} 
}
