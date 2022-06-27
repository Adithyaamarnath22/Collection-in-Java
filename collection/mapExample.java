package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class mapExample {
	public static void main(String args[]) {
		Scanner S=new Scanner(System.in);
		int ID,i;
		String name;
		String Address;
		String position;
		int Salery,j;
		
		int n=S.nextInt();
		Map<Integer,Employee>map=new HashMap<Integer,Employee>();
		Employee[]emp=new Employee[n];
		for(i=0;i<n;i++) {
			System.out.println("Enter Employee ID:");
			ID=S.nextInt();
			System.out.println("Enter Employee Name:");
			name=S.next();
			System.out.println("Enter Employee Address:");
			Address=S.next();
			System.out.println("Enter Employee Position:");
			position=S.next();
			System.out.println("Enter Employee Salery:");
			Salery=S.nextInt();
emp[i]=new Employee();
emp[i].setID(ID);
emp[i].setName(name);
emp[i].setAddress(Address);
emp[i].setPosition(position);
emp[i].setSalery(Salery);
		map.put(i, emp[i]);
		
		}
for(Map.Entry<Integer,Employee>en:map.entrySet())
{
	int key=en.getKey();
	Employee e=en.getValue();
    System.out.println(key+"\t"+e.getID()+"\t"+e.getName()+"\t"+e.getAddress()+"\t"+e.getPosition()+"\t\t" +e.getSalery());	


}
	
	}

}
