package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Empword {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Library LB=new Library();
		LB.OpenApp("http://183.82.100.55/ranford2");
		LB.AdminLogin("Admin","M1ndq");

		
		String Fpath="C:\\Users\\mkdvv\\Desktop\\Project Workspace\\E banking\\src\\com\\ebanking\\testdata\\Employee Text Document.txt";
		
		String Rpath="C:\\Users\\mkdvv\\Desktop\\Project Workspace\\E banking\\src\\com\\ebanking\\results\\Results_EmpTextdocument.txt";
		
		String Sd;
		
		FileReader Fr=new FileReader(Fpath);
		BufferedReader Br=new BufferedReader(Fr);
		String Sread=Br.readLine();
		System.out.println(Sread);
		
		FileWriter Fw=new FileWriter(Rpath);
		BufferedWriter Bw=new BufferedWriter(Fw);
		Bw.write(Sread);
		Bw.newLine();
		
		while ((Sd=Br.readLine())!=null)
		
		{
			System.out.println(Sd);
			
		 String SR[]=Sd.split("###");
		 String En=SR[0];
		 String Lpd=SR[1];
		 String Ro=SR[2];
		 String Bra=SR[3];
		 
							
		
			String Res=LB.Employeecreation(En, Lpd, Ro, Bra);
			

			Bw.write(Sd+"$$$$$"+Res);
			Bw.newLine();
						
			
		}
		
		Br.close();
		Bw.close();
		
		
		
	}

}
