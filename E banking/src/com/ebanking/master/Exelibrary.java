package com.ebanking.master;

import java.io.IOException;

public class Exelibrary {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		Library Lb=new Library();
		String rvalue=Lb.OpenApp("http://183.82.100.55/ranford2");
		System.out.println(rvalue);
		rvalue=Lb.AdminLogin("Admin","M1ndq");
		System.out.println(rvalue);
		rvalue=Lb.Branchcreation("srnagar546","mainroad","50062", "INDIA","Andhra Pradesh","Hyderabad");
		System.out.println(rvalue);
		rvalue=Lb.Rolecreation("QATestled", "E"); 
		System.out.println(rvalue);
		rvalue=Lb.Employeecreation("Arun","12345","testIT","Abc123");
		System.out.println(rvalue);
		Lb.Logout();
		Lb.Close();
		
		
 }

}
