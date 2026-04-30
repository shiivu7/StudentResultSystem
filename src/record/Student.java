package record;

import java.util.ArrayList;
import java.util.List;

public class Student {

    private int id;
    private String name;
    private int age;
    private List<Result> results = new ArrayList<>();

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void addResult(Result r) {
        results.add(r);
    }

    public int getTotalMarks() {
        int total = 0;
        for (Result r : results) {
            total += r.getMarks();
        }
        return total;
    }

    public String getGrade() {
        int total = getTotalMarks();

        if (total >= 90) return "A";
        if (total >= 75) return "B";
        if (total >= 50) return "C";
        return "Fail";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    }
}