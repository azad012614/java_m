//package hashmap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

//import TreeSet.Employee;

public class HashMapMain {

	public static void main(String[] args) {
		Integer i=1;
		HashMap<Integer,Employee> emp=new HashMap();
			Scanner sc=new Scanner(System.in);
			
		
		String ch;
		
		do
		{
		System.out.println("1.Add\n 2.dispaly\n3.Search");
		
		System.out.println("enter your choice");
		ch=sc.next();
		
		switch(ch)
		{
		case "1":
			Employee e=new Employee();
		System.out.println("enter id");
		e.id=sc.nextInt();
		System.out.println("enter name");
		e.name=sc.next();
		System.out.println("enter designation ");
		e.designation=sc.next();
		System.out.println("enter salary");
		e.salary=sc.nextDouble();
		
		emp.put(i,e);
		i++;
		break;
		
		case "2":
		for(Map.Entry m:emp.entrySet())
		{
			System.out.println(m.getKey()+"  "+m.getValue());
		}
		System.out.println("using iterator");
		
		
		break;
		
		case "3":
			System.out.println("enter key");
			Object nm=sc.nextInt();
			String flag="no";
			for(Map.Entry m:emp.entrySet())
			{
				if(m.getKey()==nm)
				{
					flag="yes";
					System.out.println(m);
				}
			}
			if(flag=="no")
			{
				System.out.println("no data found");
			}
			break;
		
		}
		System.out.println("do you want to continue?");
		ch=sc.next();
		}while(ch.equalsIgnoreCase("y"));
		
	}

}
