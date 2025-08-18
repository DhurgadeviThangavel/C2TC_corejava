package Daytwo;

public class Execute {

	public static void main(String[] args) {
		Person p =new Person();
		p.setId(101);
		p.setName("Ram");
		p.setAge(20);
		p.setCity("Puducherry");
		
		System.out.println(p.toString());
		System.out.println(p);

	}

}
