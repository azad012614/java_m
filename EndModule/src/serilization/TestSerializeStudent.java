package src;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;



public class TestSerializeStudent {
static Student s;
	public static void makeSerialize(String filename) {
		try {
			
			FileOutputStream fos=new FileOutputStream(filename);
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			oos.writeObject(s);
			oos.flush();
			System.out.println("Sucessfully file saved");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void makeDeSerialize(String filename) {
		try {
			
			FileInputStream fis=new FileInputStream(filename);
			ObjectInputStream ois=new ObjectInputStream(fis);
			s=(Student) ois.readObject();
			System.out.println("student is : "+s);
			ois.close();
			System.out.println("Sucessfully file saved");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s=new Student(1064,"azad","DAC");
		String filename="fil1.txt";
		makeDeSerialize(filename);
	}

}
