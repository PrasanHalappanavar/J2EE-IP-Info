package Wow;
import java.util.*;
import java.net.*;
public class IP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter Address :");
			String url=sc.next();
			InetAddress ip=InetAddress.getByName(url);
			System.out.println("Host name :"+ip.getHostName());
			System.out.println("Host Address :"+ip.getHostAddress());
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
