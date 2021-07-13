
public class PizzaMain {

	public static void main(String[] args) {
		
		Pizza pizza1 = new Pizza();
		pizza1.setSize(12);
		pizza1.setType("슈퍼스프림");
		pizza1.toPrint();
		
		Pizza pizza2 = new Pizza();
		pizza2.setSize(5);
		pizza2.setType("포테이토");
		pizza2.toPrint();
		
		Pizza pizza3 = new Pizza();
		pizza3.setSize(69);
		pizza3.setType("베이컨");
		pizza3.toPrint();
	}

}
