package springbean;

public class BeanLifeCycle {
	
	@Override
	public String toString() {
		return "BeanLifeCycle [id=" + id + ", name=" + name + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
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
	private int id;
	private String name;
	
	public void init()
	{
		System.out.println("The init method has started");
		
		int add = id * id;
		System.out.println(add);
		
		
	}
	public void destroy()
	{
		System.out.println("The destroy method has started");
	}
	
	

}
