
public class Pizza {
	
	int size;
	String type;
	static int count;
	
	Pizza(){
		count++;
	}
	Pizza(String type){
		this();
		this.type = type;
	} 
	
	Pizza(int size, String type){
		this(type);
		this.size = size;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Pizza.count = count;
	}
	
	void toPrint() {
		System.out.println("종류:"+ type + "크기:" + size);
		
	}
}


