package kolekcije_IteratorSucelja;

import java.util.ListIterator;

abstract class SuceljeIteratorZaListeBilj implements ListIterator<String>{

	public abstract boolean hasNext();

	public abstract String next();

	@Override
	public boolean hasPrevious() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String previous() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int nextIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int previousIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void set(String e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(String e) {
		// TODO Auto-generated method stub
		
	}

}
