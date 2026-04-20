package record;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentManager {

    private List<Student> students = new ArrayList<Student>();

   
    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Added: " + s);
    }
    
    public void addResultToStudent(int studentId,Result result) {
    	
    	for(Student s:students) {
    		if(s.getId()==studentId) {
    			s.addResult(result);
    			System.out.println("result added to student"+studentId);
    			return;
    		}
    	}
    	System.out.println("student not Found!");
    }
    public Student findStudentById(int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
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
    public void sortStudentsByMarks() {

        Collections.sort(students, new Comparator<Student>() {
            public int compare(Student s1, Student s2) {
                return s2.gettotalmarks() - s1.gettotalmarks(); 
            }
        });

        System.out.println("Students sorted by marks");
    }
    
    public void getTopper() {

        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }

        Student topper = students.get(0); // after sorting

        System.out.println("Topper is: " + topper);
    }
    
  
    
    public void loadFromFile() {

        try {
            BufferedReader reader = new BufferedReader(new FileReader("students.txt"));

            String line;
 
            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(",");

                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                int age = Integer.parseInt(parts[2]);

                students.add(new Student(id, name, age));
            }

            reader.close();
            System.out.println("Loaded successfully");

        } catch (IOException e) {
            System.out.println("Error loading file");
        }
    }
    
    public void saveToFile() {

        try {
            FileWriter writer = new FileWriter("students.txt");

            for (Student s : students) {
                writer.write(s.toString() + "\n");
            }

            writer.close();
            System.out.println("Data saved to file");

        } catch (IOException e) {
            System.out.println("Error saving file");
        }
    }














}