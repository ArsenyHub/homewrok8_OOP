package homework;

public class Human {
	private String name;
	private String lastname;
	private int age;
	private Gender gender;
	private int dnaCode; //просто цифры для удобства сравнивания
	
	
	public Human(String name, String lastname, int age, Gender gender, int dnaCode) {
		 super();
		this.name= name;
		this.lastname = lastname;
		this.age = age;
		this.gender = gender;
		this.dnaCode = dnaCode;
	}
	public Human() {
		super();
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", lastname=" + lastname + ", age=" + age + ", gender=" + gender + "]";
	}
	@Override
	public boolean equals(Object o) {
		if(this==o) return true;
		if(o==null || getClass() != o.getClass()) return false;
		Human human = (Human) o;
		System.out.print("Are these people equal?- ");
		return (dnaCode == human.dnaCode);
	}
	@Override
	public int hashCode() {
	   return dnaCode;
	}
}
	
	 


