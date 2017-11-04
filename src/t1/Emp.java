package t1;

import java.io.Serializable;

public class Emp implements Serializable{
	private static final long serialVersionUID=1L;
      private String name;
      private String gender;
      private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Emp(String name,String gender,int age) {
		this.name=name;
		this.gender=gender;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
      
      
}
