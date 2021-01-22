package Lab11;

import java.io.*;
import java.net.*;

import javax.swing.JOptionPane;

public class SimpleClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String localHost = "192.168.0.34";
		int port =  1254;
		
		try {
			Socket socketSimpleClient =new Socket(localHost, port);

			System.out.println("connected to the server");

			BufferedReader input = new BufferedReader(new InputStreamReader(socketSimpleClient.getInputStream()));


			String severResponce = input.readLine();
			System.out.println("Message from Server :"+ severResponce);
//			System.out.println(input.read());

		//	JOptionPane.showMessageDialog(null, severResponce);
			socketSimpleClient.close();
//			System.exit(0);

		}
		catch(UnknownHostException e ) {
			System.out.println ("Server not found" + e);
		}
		catch (IOException e) {
			System.out.println ("I/O error"+ e);

		}

	}
}
