
public final class Fish extends Animal{

	public static void main(String[] args) {
		
		Fish gold = new Fish();
		gold.name = "��ġ";
		gold.toPrint();
		
		//��ĳ���� : ���� <-- ����
		Animal ani = gold;
		ani.toPrint();
		//�ٿ� ĳ����
		Fish silver = (Fish)ani;
		silver.toPrint();
	}

}
