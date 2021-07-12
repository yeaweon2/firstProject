package yeawon;

import java.util.Set;

public interface MarketInf {
	
	public void start();

	public void itemBuy(String nm, String tel, Gender gen, Item item);
	
	public Boolean itemEdit(String nm, String tel, Gender gen, Item item);
	
	public Boolean itemDel(String nm);
	
	public Set<Member> MemberList();
	
	public Set<Member> MemberItemList(String name);
	
	
}
