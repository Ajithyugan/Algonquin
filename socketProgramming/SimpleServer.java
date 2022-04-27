package Lab11;

import java.io.*;
import java.net.*;

public class SimpleServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		try {	

			ServerSocket server = new ServerSocket(1254);	

			System.out.println("[SERVER] is waiting for clinent connection");
			Socket socket = server.accept();

			System.out.println("[SERVER] connected for clinent");

			DataOutputStream outPutStream = new DataOutputStream(socket.getOutputStream());
//			PrintWriter outPutStream = new PrintWriter(socket.getOutputStream(),true);

			outPutStream.writeBytes("This is Server");

			socket.close();
			server.close();

		}
		catch(UnknownHostException e ) {
			System.out.println ("Server not found" + e);
		}
		catch (IOException e) {
			System.out.println ("I/O error"+ e);

		}

	}


}
