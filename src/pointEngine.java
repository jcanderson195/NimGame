
public class pointEngine {

	public int counterTotal = 17;	
	public int computerCheat = 1;
	public int newCounterTotal = 16;
	public int piece1 = 1;
	public int piece2 = 2;
	public int piece3 = 3;
	public int piece1Pull = counterTotal - piece1;
	public int piece2Pull = counterTotal - piece2;
	public int piece3Pull = counterTotal - piece3;
	
	int computerFirstTurn = counterTotal + computerCheat - piece1;
	
	public int newCounterTotal(){
		return newCounterTotal;
	}
	public void subCounter(int newTotal){
		newCounterTotal-=newTotal;
	}
	public int subCounter2(){
		return newCounterTotal;
	}
	public void addMoney2(int newTotal){
		newCounterTotal-=newTotal;
	}
}
