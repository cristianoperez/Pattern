package memento;

public class User implements Cloneable {

	private String name;
	private int grade;
		
	private Memento memento;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void saveMemento(){
		memento = new Memento(this.grade);
	}
	
	public int getMemento(){
		return (int) memento.getObject();
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", grade=" + grade + ", memento="
				+ memento + "]";
	}

	
}
