package collection;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Arraylistsample {
	public static void main(String args[]) {
		ArrayList L=new ArrayList();
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name=S.next();
		System.out.println("Enter the Class:");
		String Class=S.next();
		System.out.println("Enter the Department:");
		String Dep=S.next();
		L.add(name);
	    L.add(Class);
	    L.add(Dep);
	   System.out.println("enter index no:");
	   int i=S.nextInt();
	   System.out.println("enter your name:");
	   String z=S.next();
		L.set(i,z);
		L.remove(2);
		Iterator itr=L.iterator();
	    System.out.print("[");
	    while(itr.hasNext()) {
	    	System.out.print(itr.next()+" ");
	    }
		System.out.print("]");
	}

}



