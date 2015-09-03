package memento;

public class Run {

	public static void main(String[] args) {

		
		User user2 = new User();
		user2.setName("Manoel");
		user2.setGrade(5);
		user2.saveMemento();
		
		user2.setGrade(10);
		
		System.out.println(user2.getMemento());
		System.out.println(user2.getGrade());
		
	}
}


