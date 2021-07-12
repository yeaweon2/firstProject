package yeawon;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import javax.management.MBeanAttributeInfo;

public class MarketApp {
	
	static MarketInf srv = new MarketControl();
	Scanner scn = new Scanner(System.in);
	Set<Member> members = new HashSet<Member>();
	
	List<Item> items = new ArrayList<>();
	
	public void start() {
		srv.start();
		while(true) {
			menuView();
			String sel = scn.nextLine();
			if(sel.equals("1") || sel.equals("구매")) {
				itemBuy();
			}else if(sel.equals("2") || sel.equals("수정")) {
				itemEdit();
			}else if(sel.equals("3") || sel.equals("반품")) {
				itemDel();
			}else if(sel.equals("4") || sel.equals("조회")) {
				searchList();
			}else if(sel.equals("5") || sel.equals("종료")) {
				break;
			}else {
				System.out.println("정확한 메뉴를 선택해주세요.");
			}
		}
		System.out.println("프로그램 종료.");
	}
	
	public void menuView() {
		System.out.println();
		System.out.println("━━━━━━━━━━━━━━━ [ 마 트 ] ━━━━━━━━━━━━━━━");
		System.out.println("   1.구매  2.수정  3.반품  4.조회  5.종료  ");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.print("선택 > ");
	}
	
	public void searchMenuView() {
		System.out.println();
		System.out.println("━━━━━━━━━ [ 조 회 ] ━━━━━━━━━");
		System.out.println(" 1.전체  2.회원  3.종료 ");
		System.out.println("━━━━━━━━━━━━━━━━━━━━━━━━━━━━");
		System.out.print("선택 > ");
	}
	
	public void itemBuy() {
		String name = scanString("이름 입력 >> ");
		String tel = scanString("연락처 입력 >> ");
		Gender gen = scanGen("성별 입력(1.남자/2.여자 ) >> ");
		Item item = scanItem("품목을 입력해주세요------->>");
		srv.itemBuy(name, tel, gen, item);
		
	}
	
	public void itemEdit() {
		String name = scanString("이름 입력 >> ");
		Set<Member> mb = srv.MemberList();
		Iterator<Member> iter = mb.iterator();
		Boolean editChk = false;
		
		while(iter.hasNext()) {		
			if(iter.next().getMemberNm().equals(name)) {
				String tel = scanString("연락처 입력 >> ");
				Gender gen = scanGen("성별 입력(1.남자/2.여자 ) >> ");
				Item item = scanItem("품목을 입력해주세요------->>");
				editChk = srv.itemEdit(name, tel, gen, item);
				if(editChk) {
					System.out.println("※ 수정이 완료되었습니다.");
					break;
				}else {
					System.out.println("※ 해당 회원정보가 없습니다.");
				}
			}
		}		
	}
	
	public void itemDel() {
		
	}

	public void searchList() {
		
		while(true) {
			searchMenuView();
			String sel = scn.nextLine();
			if(sel.equals("1") || sel.equals("전체조회")) {
				Set<Member> members = srv.MemberList();
				for( Member mb : members ) {
					if( mb != null ) {
						System.out.println(mb.toString());
					}
				}
				System.out.println();
				break;
			}else if(sel.equals("2") || sel.equals("회원조회")) {
				
				memberDetail();
				break;
			}else if(sel.equals("3") || sel.equals("종료")) {
				break;
			}else {
				System.out.println("※ 정확한 조회메뉴를 다시 선택해주세요 >>");
			}
		}
		
	}
	
	public void memberDetail() {
		String name = scanString("이름 입력 >> ");
//		Set<Member> mb = srv.MemberItemList(name);
		Set<Member> mb = srv.MemberList();
		Iterator<Member> iter = mb.iterator();
		int a = 0;
		while(iter.hasNext()) {
//			items.add(iter.next().getItems());		
			if(iter.next().getMemberNm().equals(name)) {
				items.add(iter.next().getItems());
			}
			a++;
		}
		
		System.out.println(a + ">==================================");		
		for(int i = 0; i < items.size(); i++) {
			System.out.println( (i+1) + ". 품목명 : " + items.get(i).getItemNm() + " / 갯수 : " + items.get(i).getItemCnt() + " / 금액 : " + items.get(i).getItemAmt());
		}
		System.out.println("==================================");
	}
	
	public String scanString(String arg) {
		System.out.print(arg);
		String txt = scn.nextLine();
		return txt;
	}
	
	public Integer scanInt(String arg) {
		System.out.print(arg);
		int txt = 0;
		while(true) {
			try {
				txt = scn.nextInt();
				break;
			}catch(Exception e) {
				System.out.println("※ 다시 입력해주세요(숫자형식) >>");
			}
		}
		return txt;
	}	
	
	public Gender scanGen(String arg) {
		System.out.print(arg);
		String txt = scn.nextLine();
		Gender gen = null;
		if(txt.equals("2") ||txt.equals("여자")||txt.equals("여성")||txt.equals("여") ) {
			gen = Gender.WOMEN;
		}else {
			gen = Gender.MEN;
		}
		return gen;
	}
	
	public Item scanItem(String arg) {
		System.out.println(arg);
		String itemNm = scanString("품목명 입력 >>");
		int itemCnt = scanInt("갯수 입력 >>");
		scn.nextLine();
		int itemAmt = scanInt("금액 입력 >>");
		scn.nextLine();
		Item item = new Item(itemNm, itemCnt, itemAmt);
		return item;
	}
	
	

}
