package ssa;

import java.util.*;

public class Student {
			  ArrayList<Student> classRoster = new ArrayList<>();
			  ArrayList<Student> newList= new ArrayList<>();
			 public String firstName;
			 public String lastName;
			 public String id; 
			 public String eyeColor; 
			 public int monthsEmployed;
			 
public Student(){}
public Student(String id, String firstName, String lastName, String eyeColor, int monthsEmployed) {
	  this.id = id;
	  this.firstName = firstName;
	  this.lastName = lastName;
	  this.eyeColor = eyeColor;
	  this.monthsEmployed = monthsEmployed;
}
	
//public void printClassRoster() {
//	
//
//			Collections.sort(classRoster);
//			//this.printRosterHeader();
//			for(Student aStudent : classRoster) {
//			//	this.printStudentDetail(aStudent);
//			}
//}



			 
public String getFirstName() {
	return firstName;
}



public void setFirstName(String firstName) {
	this.firstName = firstName;
}



public String getLastName() {
	return lastName;
}



public void setLastName(String lastName) {
	this.lastName = lastName;
}



public String getId() {
	return id;
}



public void setId(String id) {
	this.id = id;
}



public String getEyeColor() {
	return eyeColor;
}



public void setEyeColor(String eyeColor) {
	this.eyeColor = eyeColor;
}



public int getMonthsEmployed() {
	return monthsEmployed;
}



public void setMonthsEmployed(int monthsEmployed) {
	this.monthsEmployed = monthsEmployed;
}

public static Comparator<Student> FirstNameComparator
= new Comparator<Student>() {

public int compare(Student s1, Student s2) {

String firstName1 = s1.getFirstName();
String firstName2 = s2.getFirstName();

//ascending order
return firstName1.compareTo(firstName2);

//descending order
//return firstName2.compareTo(firstName1);
}

};

public static Comparator<Student> IdComparator
= new Comparator<Student>() {

public int compare(Student s1, Student s2) {

String id1 = s1.getId();
String id2 = s2.getId();

//ascending order
return id1.compareTo(id2);

//descending order
//return firstName2.compareTo(firstName1);
}

};


public void printClassRoster() {

	Student evan = new Student("008888", "Evan", "Tizard", "Brown", 12);
	Student michael = new Student("001122", "Michael", "Clair", "Other", 12);
	Student stephen = new Student("001212", "Stephen", "Rook", "Brown", 11);
	Student jonathan = new Student("474143", "Jonathan", "Stafford", "Brown", 13);
	Student kyle = new Student("005295", "Kyle", "Deen", "Blue", 2);
	Student kevin = new Student("004400", "Kevin", "Tran", "Other", 12);
	Student reuben = new Student("132617", "Reuben", "Turner", "Blue", 12);
	Student li = new Student("306700", "Li", "Lui", "Brown", 12);
	Student joshua = new Student("215296", "Joshua", "Franey", "Other", 27);
	Student gabriel = new Student("523420", "Gabriel", "Hamilton", "Black", 10);
	Student aisha = new Student("004014", "Aisha", "Covington", "Brown", 10);
	Student arun = new Student("006789", "Arun", "Soma", "Brown", 2);
	Student steve = new Student("009999", "Steve", "Ellwood", "Other", 2);
	Student shaquill = new Student("3943769", "Shaquill", "Timmons", "Brown", 11);
	Student karen = new Student("001449", "Karen", "Reiter", "Blue", 10);
	Student dax = new Student("267252", "Dax", "Richards", "Brown", 12);
	Student mike = new Student("229949", "Mike", "Sykes", "Brown", 13);
	Student daniel = new Student("772223", "Daniel", "Kiros", "Brown", 3);
	Student peter = new Student("004444", "Peter", "Choi", "Brown", 2);
	Student joe = new Student("005255", "Joe", "Hill", "Brown", 2);
	
	
	
	classRoster.add(evan);
	classRoster.add(michael);
	classRoster.add(stephen);
	classRoster.add(jonathan);
	classRoster.add(kyle);
	classRoster.add(kevin);
	classRoster.add(reuben);
	classRoster.add(li);
	classRoster.add(joshua);
	classRoster.add(gabriel);
	classRoster.add(aisha);
	classRoster.add(arun);
	classRoster.add(steve);
	classRoster.add(shaquill);
	classRoster.add(karen);
	classRoster.add(dax);
	classRoster.add(mike);
	classRoster.add(daniel);
	classRoster.add(peter);
	classRoster.add(joe);
	
	
	
	
	
	System.out.println("Student Class Roster");
	System.out.println(" ");
	System.out.println("Empl Id  " + "First name  " + "Last Name" + "   Eye color" + "   Months at SSA");
	System.out.println("=======  " + "==========  " + "=========   " + "=========   " + "=============     ");
	
	Collections.sort(classRoster,FirstNameComparator );
	for(Student student: classRoster)
		System.out.printf("%-8s %-10s  %-14s %-6s   %d %n",student.getId(), student.getFirstName(), student.getLastName(), student.getEyeColor(), student.getMonthsEmployed());
	 
	// Sorted
	int flag = 0; 
	//Collections.sort(classRoster,FirstNameComparator);
	//Collections.sort(classRoster, IdComparator);
	HashMap<String, String> studentMap= new HashMap<>();
	Collections.sort(classRoster, IdComparator.reversed());
	
	for(Student student: classRoster){
		studentMap.put(student.getId(), student.getFirstName());
	
	if(student.getId().equals("008888") || flag==1 ){
		flag++;
		newList.add(student);
		
	}
	
}
	
	Collections.sort(classRoster, IdComparator);
	for(Student studentNew: classRoster){
		if(studentNew.getId().equals("008888") || flag==3){
	     flag++;
	     if(flag==4) 	    	 
	    	 newList.add(studentNew);
	  
		}
}
	
	 Collections.sort(newList, IdComparator);
	 for(int i=0; i< newList.size(); i++)
	 System.out.printf("Id : %s and Name: %s %n", newList.get(i).getId(), newList.get(i).getFirstName());
			
}

}
