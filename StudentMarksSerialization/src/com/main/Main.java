package com.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.marks.Marks;
import com.student.Student;

public class Main {

	public static void main(String[] args) {
		try(FileOutputStream fos = new FileOutputStream("test");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
//			Student student = new Student(1156, "Hamza");
//			oos.writeObject(student);
//			System.out.println("Student inserted");
			
			Marks marks = new Marks(1156, "Hamza", 90, 91, 92);
			oos.writeObject(marks);
			System.out.println("Marks entered");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("test");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
//			Student student = (Student) ois.readObject();
//			System.out.println("ID: " + student.getId());
//			System.out.println("Name: " + student.getName());
			
			Marks marks = (Marks) ois.readObject();
			System.out.println("ID: " + marks.getId());
			System.out.println("Name: " + marks.getName());
			System.out.println("Marks in subject 1: " + marks.getSubject1());
			System.out.println("Marks in subject 2: " + marks.getSubject2());
			System.out.println("Marks in subject 3: " + marks.getSubject3());
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
