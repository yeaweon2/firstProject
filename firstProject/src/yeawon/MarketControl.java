package yeawon;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MarketControl implements MarketInf {
	
	
	Set<Member> members = new HashSet<Member>();
	
	@Override
	public void start(){
		members.add(new Member("송혜교","010-111-4444", Gender.WOMEN,  new Item("사과",3,15000) ));
		members.add(new Member("강호동","011-222-77", Gender.MEN,  new Item("비누",4,7000) ));
		members.add(new Member("유재석","010-3589-1111", Gender.MEN,  new Item("주방세제",1,20500) ));
		members.add(new Member("박보검","015-9510-122", Gender.MEN,  new Item("면도기",3,7800) ));
		members.add(new Member("한지민","010-745-144", Gender.WOMEN,  new Item("과자",15,87000) ));
	}
	
	@Override
	public void itemBuy(String nm, String tel, Gender gen, Item item) {
		members.add(new Member(nm,tel,gen,item));
	}

	@Override
	public Boolean itemEdit(String nm, String tel, Gender gen, Item item) {
		Boolean chk = false;
		
		Iterator<Member> iter = members.iterator();
		while(iter.hasNext()) {
			Member mb = iter.next();
			System.out.println(mb.getMemberNm().equals(nm) + " / " + mb.getMemberNm() + " / " + nm);
			if(mb.getMemberNm().equals(nm)) {				
				mb.setTel(tel);
				mb.setGen(gen);
				mb.setItems(item);
				chk = true;
				break;
			}else {
				chk = false;
			}
		}
		return chk;
	}

	@Override
	public Boolean itemDel(String nm) {
		Boolean chk = false;
		return chk;
	}
	
	@Override
	public Set<Member> MemberList() {
		Iterator<Member> iter = members.iterator();
		while(iter.hasNext()) {
			Member mb = iter.next();
			members.add(mb);
		}
		
		return members;
	}

	@Override
	public Set<Member> MemberItemList(String name) {
		Iterator<Member> iter = members.iterator();
		while(iter.hasNext()) {
			Member mb = iter.next();
			
			if(mb.getMemberNm().equals(name)) {
				members.add(mb);
			}
			
		}
		System.out.println(members.size());
		return members;
	}
}
