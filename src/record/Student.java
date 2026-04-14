package record;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	   private List<Result> results =new ArrayList<Result>();

		
		private int id;
		private String name;
		private int age;
		
		@Override
		public String toString() {
			return "student [id=" + id + ", name=" + name + ", age=" + age + "]";
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
			// TODO Auto-generated method stub
			
		}
		

	}


