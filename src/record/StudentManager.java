package record;

import java.util.ArrayList;
import java.util.List;

public class StudentManager {

    private List<Student> students = new ArrayList<Student>();

   
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Added: " + s);
    }

    
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

  
    public void deleteStudent(int id) {
        Student found = null;

        for (Student s : students) {
            if (s.getId() == id) {
                found = s;
                break;
            }
        }

        if (found != null) {
            students.remove(found);
            System.out.println("Deleted student with id: " + id);
        } else {
            System.out.println("No student with id: " + id);
        }
    }
}