package yeawon;

public class Item {
	private String itemNm;	// 물건명
	private int itemCnt;	// 갯수
	private int itemAmt;	// 금액
	
	public Item() {}
	
	public Item(String itemNm, int itemCnt, int itemAmt) {
		super();
		this.itemNm = itemNm;
		this.itemCnt = itemCnt;
		this.itemAmt = itemAmt;
	}

	public String getItemNm() {
		return itemNm;
	}

	public void setItemNm(String itemNm) {
		this.itemNm = itemNm;
	}

	public int getItemCnt() {
		return itemCnt;
	}

	public void setItemCnt(int itemCnt) {
		this.itemCnt = itemCnt;
	}

	public int getItemAmt() {
		return itemAmt;
	}

	public void setItemAmt(int itemAmt) {
		this.itemAmt = itemAmt;
	}

	@Override
	public String toString() {
		return "[ 품목:" + itemNm + ", 갯수:" + itemCnt + ", 금액:" + itemAmt + " ]";
	}

	
}
