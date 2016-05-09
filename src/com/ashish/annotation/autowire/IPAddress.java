package com.ashish.annotation.autowire;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddress {

	public static void main(String[] args)  {
		
		try {
			
			System.out.println("My Ip: " + InetAddress.getLocalHost());
			
			InetAddress addr = InetAddress.getByName("10:30:191:86");
			String host = addr.getHostName();
			System.out.println("Culprit: " + host);
			
		}catch(UnknownHostException he){
			System.out.println("Culprit Exception: " + he.getMessage());
		}
		catch(Exception e){
			System.out.println("Other problems: " + e.getMessage());
		}
		
	}

}
