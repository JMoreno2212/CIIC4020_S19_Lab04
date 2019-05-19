package positionalListTesterClasses;

import interfaces.Position;
import llPositionalList.LinkedPositionalList;
import llPositionalList.PLElementsBackwardIterator;

public class LinkedPLElementsBackwardsTester {
	public static void main(String[] args) {
		LinkedPositionalList<Integer> list1 = new LinkedPositionalList<>();

		Position<Integer> f = list1.addFirst(1); 
		Position<Integer> l = list1.addLast(10);
		Position<Integer> c = list1.addAfter(f, 4); 
		list1.addBefore(c, 3); 
		list1.addAfter(f, 2); 
		Position<Integer> pp = list1.addBefore(l, 7); 
		list1.addAfter(pp, 8);
		list1.addBefore(l, 9);
		showList("list1 = ", list1);


		Position<Integer> p1 = list1.after(pp); 
		System.out.println("Removing from list1: " + list1.remove(p1));	
		showList("list1 = ", list1);
		System.out.println("Removing from list1: " + list1.remove(list1.first()));	
		showList("list1 = ", list1);
		System.out.println("Removing from list1: " + list1.remove(list1.last()));	
		showList("list1 = ", list1);
		
		iterateBackwards("Iterating backwards over list1: ", list1);

	}

	private static void showList(String msg, LinkedPositionalList<Integer> list) {
		System.out.print(msg); 
		for (Integer v : list) 
			System.out.print(v + " "); 
		System.out.println(" -- size = " + list.size()); 
	}
	
	@SuppressWarnings("unused")
	private static void iterateBackwards(String msg, LinkedPositionalList<Integer> list) {
		System.out.println(msg);
		PLElementsBackwardIterator<Integer> backwardsIter = new PLElementsBackwardIterator<>(list);
		for(Integer integer : list) {
			System.out.print(backwardsIter.next() + " ");
		}
	}
}
