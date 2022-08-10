package cafe;
public class Cafe {
	Coffee[] coffeList; 
	private int index;
	
	public Cafe() {
		super();
		this.coffeList=new Coffee[10];        // cafe 생성시 커피배열을 10개로 지정
		index=0;                               // 초기 배열 방 번호
	}	
	public Coffee[] getCoffeList() {
		return coffeList;
	}	
	public int getIndex() {
		return this.index;
	}	
	public void setCoffeList(Coffee coffee) {
		if (index < coffeList.length) { // 커피 객체를 배열에 저장
			coffeList[index] = coffee; // 넘지않을 경우 배열방에 저장
			index=index+1; // 다음 번 배열 방 번호 저장
		} else {
			System.out.println("정보 추가가 될 수 없습니다.");
		}
	}
	public int totalPrice() {
		int total = 0;
		if(index!=0) {
			for (int i = 0; i < index; i++) {
				total= total + coffeList[i].getPrice();
			}
		}else {
			System.out.println("커피가 없습니다.");
		}
		return total;
	}
}
