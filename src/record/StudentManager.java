package record;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class StudentManager {

    private Map<Integer, Student> students = new HashMap<>();

    public void addStudent(Student s) {
        if (students.containsKey(s.getId())) {
            System.out.println("Student with this ID already exists");
            return;
        }
        students.put(s.getId(), s);
        System.out.println("Added: " + s);
    }

    public void addResultToStudent(int studentId, Result result) {
        Student s = students.get(studentId);
        if (s != null) {
            s.addResult(result);
            System.out.println("Result added to student " + studentId);
        } else {
            System.out.println("Student not found");
        }
    }

    public Student findStudentById(int id) {
        return students.get(id);
    }

    public int getStudentCount() {
        return students.size();
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No students found");
            return;
        }
        for (Student s : students.values()) {
            System.out.println(s);
        }
    }

    public void deleteStudent(int id) {
        if (students.remove(id) != null) {
            System.out.println("Deleted student with id: " + id);
        } else {
            System.out.println("No student with id: " + id);
        }
    }

    public void sortStudentsByMarks() {
        List<Student> sorted = new ArrayList<>(students.values());
        sorted.sort((s1, s2) -> Integer.compare(s2.getTotalMarks(), s1.getTotalMarks()));
        for (Student s : sorted) {
            System.out.println(s);
        }
    }

    public void getTopper() {
        if (students.isEmpty()) {
            System.out.println("No students found");
            return;
        }

        Student topper = null;

        for (Student s : students.values()) {
            if (topper == null || s.getTotalMarks() > topper.getTotalMarks()) {
                topper = s;
            }
        }

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

                students.put(id, new Student(id, name, age));
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

            for (Student s : students.values()) {
                writer.write(s.getId() + "," + s.getName() + "," + s.getAge() + "\n");
            }

            writer.close();
            System.out.println("Data saved to file");

        } catch (IOException e) {
            System.out.println("Error saving file");
        }
    }
}