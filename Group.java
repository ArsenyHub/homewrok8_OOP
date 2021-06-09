package homework;


import java.util.Arrays;
import java.util.Comparator;
import java.util.NoSuchElementException;

public class Group {
	private Student[] students = new Student[10];
	private String nameGroup = "Programming";
	private int NUMBER_OF_GROUP = 12;
	 	
	
	public void addStudent(Student student) throws Exception {
		for(int i =0;i<=students.length;i++) {
			try {
				if (i >= students.length) {
					throw new Exception();
				}
				if (students[i] == null) {
				students[i] =student; 
				break;
				}
			} catch (MyException e) {
				break;
			}
		}
	}
	
	public void delStudent(long idBook) {
		for(int i=0;i<students.length;i++) {
			if(students[i]!=null && idBook==students[i].getIdBook()) {
				students[i]=null;
				break;
			}
		}
	}
	
	public Student searchStudent(String lastName) {
		for(int i=0;i<students.length;i++) {
			try {
				if(students[i]!= null && students[i].getLastname().equals(lastName)) {
					return students[i];
				}
			} catch (NoSuchElementException e) {
				break;
			}
		}
		return null ;
	}
	public Student[] getStudents() {
		return students;
	}	

	public void setStudents(Student[] students) {
		this.students = students;
	}

	public String toString() {
	    String a="Group:" + nameGroup+"\n";
	    
	    for(int i=0;i<students.length;i++) {
	      if(students[i]!=null) {
	    	  a += "Student: " +students[i].getName()+" " +students[i].getLastname() +"," +students[i].getAge() + "," +students[i].getIdBook() + "," +students[i].getGender() + "\n";
	      }
	    }
	    return a;
	}
	
	public void sortStudentsByLastname() {
		Arrays.sort(students,  Comparator.nullsFirst( new StudentComparator()));
		for(Student st: students) {
			System.out.println(st);
		}
	}
	@Override
	public boolean equals(Object o) {
		if(this==o) return true;
		if(o==null || getClass() != o.getClass()) return false;
		Group g = (Group) o;
		return (NUMBER_OF_GROUP==g.NUMBER_OF_GROUP);
	}	
	@Override
	public int hashCode() {
	   return NUMBER_OF_GROUP;
	}
	
	//¬водим студента которого нужно проверить
	public void noEqualStudents(Student student) {
		int a = 0;
		for(int i =0; i<students.length;i++) {
			if(students[i] != null && students[i].equals(student)) {
				a++;
			} else continue;
		}
		if(a>=2) {
			System.out.println("ERROR, the same student found!");
		} else {
			System.out.println("Student is only one");
		}
	}
	
	
	
	
}
