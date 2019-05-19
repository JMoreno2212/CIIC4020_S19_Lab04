package llPositionalList;

import java.util.Iterator;
import java.util.NoSuchElementException;

import interfaces.PositionalList;

public class PLElementsBackwardIterator<E> implements Iterator<E> {
	private PLIteratorL2F<E> iterator;
	
	public PLElementsBackwardIterator(PositionalList<E> list) {
		this.iterator = new PLIteratorL2F<>(list);
	}
	
	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}

	@Override
	public E next() {
		if (!hasNext()) throw new NoSuchElementException("No more elements to iterate over."); 
		return iterator.next().getElement();
		
	}
	
	
}
