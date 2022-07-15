package com.marks;

import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.student.Student;

public class Marks extends Student {
	private int subject1, subject2, subject3;
	
	public Marks(int id, String name, int subject1, int subject2, int subject3) {
		super(id, name);
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}
	
	
	public int getSubject1() {
		return subject1;
	}

	public int getSubject2() {
		return subject2;
	}

	public int getSubject3() {
		return subject3;
	}


	private void writeObject(ObjectOutputStream objectOutputStream) throws NotSerializableException {
		throw new NotSerializableException();
	}
	
	private void readObject(ObjectInputStream objectInputStream) throws NotSerializableException {
		throw new NotSerializableException();
	}
}
