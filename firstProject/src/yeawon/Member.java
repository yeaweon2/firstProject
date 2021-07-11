package yeawon;

public class Member {
	private String memberNm;
	private String tel;
	private Gender gen;
	private Item items;
	
	public Member() {}
	
	public Member(String memberNm, String tel, Gender gen, Item items) {
		super();
		this.memberNm = memberNm;
		this.tel = tel;
		this.gen = gen;
		this.items = items;
	}
	
	public String getMemberNm() {
		return memberNm;
	}

	public void setMemberNm(String memberNm) {
		this.memberNm = memberNm;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Gender getGen() {
		return gen;
	}

	public void setGen(Gender gen) {
		this.gen = gen;
	}

	public Item getItems() {
		return items;
	}

	public void setItems(Item items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "회원명:" + memberNm + "/연락처:" + tel + "/성별:" + gen + "/품목명:" + items.getItemNm() + "/갯수:" + items.getItemCnt() + "/금액:"+ items.getItemAmt() ;
	}

	@Override
	public int hashCode() {
		return this.getMemberNm().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member mb = (Member) obj;
			return mb.memberNm.equals(memberNm);
		}else {
			return false;
		}
	}

}
