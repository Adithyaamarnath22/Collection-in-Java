package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class task {
	public static void main(String args[]) {
		ArrayList L=new ArrayList();
		Scanner S=new Scanner(System.in);
		do {
	    System.out.println("1 Display installed applications");
     
	    System.out.println("2 Install an applications");
	    
	    System.out.println("3 Uninstall an applications");
	   
	    System.out.println("4 Update");
	
	    System.out.println("5 Quit");
	    
	    System.out.println("Enter your choice:");
    	int n=S.nextInt();
	    
	    if (L.isEmpty()) {
	    	System.out.println("There is no Application Installed");
	    }
	    else {
	    	System.out.println("Application Installed");
	    }
//		if()
	  
	    Object name = null;
		L.add(name);
		
		
		
		   System.out.println("enter index no:");
		   int i=S.nextInt();
		   System.out.println("enter your name:");
		   String z=S.next();
		   L.remove(3);
		   L.set(i, z);
		   
		   
		   
		   
		   
		   Iterator itr=L.iterator();
		    System.out.print("[");
		    while(itr.hasNext()) {
		    	System.out.print(itr.next()+" ");
		    }
			System.out.print("]");
		}	
}
	}

