package java8;

import java.util.List;

public class Player {
	
	private String name;
	private int weight;
	private String gender;
	private String game;
	private float salary;
	List<String> hobbies;
	
	
	Player(String name,int weight,String gender,String game,float salary)
	{
		this.name=name;
		this.weight=weight;
		this.gender=gender;
		this.salary=salary;
		
	}
	
	
	
	Player(String name,int weight,String gender,String game,float salary,List<String> hobbies)
	{
		this.name=name;
		this.weight=weight;
		this.gender=gender;
		this.salary=salary;
		this.hobbies=hobbies;
	}
	
	
	
	
	public void test()
	{
		System.out.println("hello from player class");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}

}
