import java.util.Scanner;
import record.*;

public class Main {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);

        manager.loadFromFile();

        while (true) {

            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Add Result");
            System.out.println("5. Sort by Marks");
            System.out.println("6. Show Topper");
            System.out.println("7. Exit");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter id: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();

                    manager.addStudent(new Student(id, name, age));
                    break;

                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter id to delete: ");
                    int delId = sc.nextInt();
                    manager.deleteStudent(delId);
                    break;

                case 4:
                    System.out.print("Enter student id: ");
                    int sid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter subject: ");
                    String subject = sc.nextLine();

                    System.out.print("Enter marks: ");
                    int marks = sc.nextInt();

                    manager.addResultToStudent(sid, new Result(sid, subject, marks));
                    break;

                case 5:
                    manager.sortStudentsByMarks();
                    break;

                case 6:
                    manager.getTopper();
                    break;

                case 7:
                     manager.saveToFile();
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}