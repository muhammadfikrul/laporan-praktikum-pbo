public class EncapDemo1941723005Fikrul {
	private String name;
	private int age;

	public String getName() {
		return name;
	}
	public void setName(String newName) {
		name = newName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int newAge) {
		if(newAge > 30){
			age = 30;
		}
		else{
			age = newAge;
		}
		if(newAge < 18){
			age = 18;
		}
	}
}