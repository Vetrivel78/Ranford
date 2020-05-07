package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class Notepad {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		Library LB=new Library();
		LB.OpenApp("http://183.82.100.55/ranford2");
		LB.AdminLogin("Admin","M1ndq");
		
		//to get Test data file path
		
		String Fpath="C:\\Users\\mkdvv\\Desktop\\Role Text Document.txt";
		
		// Results File path
		
		String Rpath="C:\\Users\\mkdvv\\Desktop\\Project Workspace\\E banking\\src\\com\\ebanking\\results\\Results_RoleTextDocument.txt";
		String Sd;
		// To get test file data
		
		FileReader Fr=new FileReader(Fpath);
		BufferedReader Br= new BufferedReader(Fr);
		String Sread=Br.readLine();
		System.out.println(Sread);
		
		//Write
		
		FileWriter Fw=new FileWriter(Rpath);
		BufferedWriter Bw= new BufferedWriter(Fw);
		Bw.write(Sread);
		Bw.newLine();
		
		// Multiple Iterations While  Loop
		
		
		while ((Sd=Br.readLine())!=null)
			
											
		{
			System.out.println(Sd);
			
		// Split
		
		String Sr[]=Sd.split("###");
	
		String Rn=Sr[0];
		String Rt=Sr[1];
		
		
		String Res=LB.Rolecreation(Rn, Rt);
		System.out.println(Res);
		
		// Results
		Bw.write(Sd+"$$$$$"+Res);
		Bw.newLine();

		}
		Br.close();
		Bw.close();
			
	
	}

}
