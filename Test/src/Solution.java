import java.io.*;
import java.util.*;

class Student {
	private int ID;
	private String name;
	private double CGPA;
	
	public Student(int ID, String name, double CGPA) {
		this.ID = ID;
		this.name = name;
		this.CGPA = CGPA;
	}
	
	public int getID() {
		return ID;
	}
	
	public String getName() {
		return name;
	}
	
	public double getCGPA() {
		return CGPA;
	}
}

class Priorities {
	private List<Student> students = new ArrayList<>();
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public int getStudentsSize() {
		return students.size();
	}
	
	public Student getHighestPriorityStudent() {
		Student highestPriorityStudent = students.get(0);
		for(int i = 1; i < students.size(); i++) {
			Student currentStudent = students.get(i);
			if(currentStudent.getCGPA() > highestPriorityStudent.getCGPA()) {
				highestPriorityStudent = currentStudent;
			} else if(currentStudent.getCGPA() == highestPriorityStudent.getCGPA()) {
				if(currentStudent.getName().compareTo(highestPriorityStudent.getName()) < 0) {
					highestPriorityStudent = currentStudent;
				} else if(currentStudent.getName().compareTo(highestPriorityStudent.getName()) == 0) {
					if(currentStudent.getID() < highestPriorityStudent.getID()) {
						highestPriorityStudent = currentStudent;
					}
				}
			}
		}
		
		return highestPriorityStudent;
	}
	
	public Student removeHighestPriorityStudent() {
		//remove highest priority student
		//		1. highest cgpa
		//		2. same cgpa, then name
		//		3. same cgpa and name, then id
		Student highestPriorityStudent = getHighestPriorityStudent();
		students.remove(highestPriorityStudent);
		return highestPriorityStudent;
	}

	public List<Student> getStudents() {
		return students;
	}

	public List<Student> getStudents(List<String> events) {
		for(String event: events) {
			String[] input = event.trim().split(" ");
        	if(input.length > 1) {
        		String name = input[1];
        		double CGPA = Double.parseDouble(input[2]);
        		int ID = Integer.parseInt(input[3]);
        		
        		Student student = new Student(ID, name, CGPA);
        		addStudent(student);
        	} else {
        		removeHighestPriorityStudent();
        	}
		}
		
		return students;
	}
}

public class Solution {
    public static void main(String[] args) throws IOException {
    	Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<String> events = new ArrayList<>();
        
        Priorities priorities = new Priorities();
        for(int i = 0; i < n; i++) {
        	String event = sc.nextLine();
        	
        	events.add(event);
        }
        
        List<Student> studentsYetToBeServed = priorities.getStudents(events);
        
    	if(studentsYetToBeServed.size() > 1) {
    		int sizeOfStudentsYetToBeServed = studentsYetToBeServed.size();
    		for(int i = 0; i < sizeOfStudentsYetToBeServed; i++) {
    			System.out.println(priorities.removeHighestPriorityStudent().getName());
    		}
    	} else {
    		System.out.println("EMPTY");
    	}
        
        sc.close();
    }
}