package jp.co.internous.action;

public class Person3 {

	private String name = null;
	private int age = 0;

	public Person3(String name,int age){
		this.name = name;
		this.age = age;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return this.age;
	}
	public void setAge(int age){
		this.age=age;
	}
}
