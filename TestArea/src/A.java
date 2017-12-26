import java.util.*;

public class A {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		
		for (int i = list.size()-1;i>=0;i--) {
			if(list.get(i)%2==1) {
				list.add(list.get(i));
				list.remove(i);
			}
		}
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		for(int i = list.size()-1; i>0 ; i-=1) {
			list.add(i, 0);
		}
		list.add(0);
		
		System.out.println(list);
		System.out.println(list2);
	}
}