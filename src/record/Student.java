package record;

import java.util.ArrayList;
import java.util.List;

import Studentmanage.Result;

public class Student {
	
	   private List<Result> results =new ArrayList<Result>();
	   
	   public void addresults(Result r) {
			results.add(r);
		}
		
		public String getGrade() {

		    int total = gettotalmarks();

		    if (total >= 90) {
		        return "A";
		    } else if (total >= 75) {
		        return "B";
		    } else if (total >= 50) {
		        return "C";
		    } else {
		        return "Fail";
		    }
		}

		
		private int id;
		private String name;
		private int age;
		
		@Override
		public String toString() {
		    return "Student [name=" + name +
		           ", age=" + age +
		           ", id=" + id +
		           ", totalMarks=" + gettotalmarks() +
		           ", grade=" + getGrade() + "]";
		}

		public Student(int id, String name, int age) {
			super();
			this.id = id;
			this.name = name;
			this.age = age;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public void addResult(Result result) {
			results.add(result);
		}
		
		public int gettotalmarks() {
			int Total =0;
			
			for(Result r: results) {
				Total +=r.getMarks();
			}
			return Total;
		}
		

	}


