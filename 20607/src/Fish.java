
public final class Fish extends Animal{

	public static void main(String[] args) {
		
		Fish gold = new Fish();
		gold.name = "날치";
		gold.toPrint();
		
		//업캐스팅 : 상위 <-- 하위
		Animal ani = gold;
		ani.toPrint();
		//다운 캐스팅
		Fish silver = (Fish)ani;
		silver.toPrint();
	}

}
