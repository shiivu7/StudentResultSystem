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

	}

}
