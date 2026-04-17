package record;

public class Main {

	public static void main(String[] args) {
		
		StudentManager manager =new StudentManager();
		
		manager.addStudent(new Student(1,"shivu",19)); 
		manager.addStudent(new Student(2,"karan",26));
		manager.addStudent(new Student(3,"aujla",28));
		
		
		System.out.println("studentsList");
		manager.viewStudents();
		
		System.out.println("delete student");
		manager.deleteStudent(3);
		manager.viewStudents();
		
		manager.addResultToStudent(1, new Result(1, "Maths", 90));
		manager.addResultToStudent(1, new Result(1, "Science", 85));
		manager.viewStudents();
		manager.sortStudentsByMarks();
		manager.viewStudents();
		manager.getTopper();

        manager.loadFromFile();
        StudentManager manager1 = new StudentManager();
        manager1.loadFromFile();  
        manager1.viewStudents();
        manager1.saveToFile();     

	}

}
