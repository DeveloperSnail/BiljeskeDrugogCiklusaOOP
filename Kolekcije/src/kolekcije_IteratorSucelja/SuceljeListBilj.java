package kolekcije_IteratorSucelja;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

abstract class SuceljeListBilj implements List<String>{

	//Sučelje list implementira sučelje Collection, ovo su nasljeđene metode
	public abstract int size();
	public abstract boolean add(String e);
	public abstract boolean remove(Object o);
	public abstract boolean isEmpty();
	public abstract boolean contains(Object o);
	public abstract Iterator<String> iterator();
	public abstract Object[] toArray();
	public abstract <T> T[] toArray(T[] a);
	public abstract boolean containsAll(Collection<?> c);
	public abstract boolean addAll(Collection<? extends String> c);
	public abstract boolean addAll(int index, Collection<? extends String> c);
	public abstract boolean removeAll(Collection<?> c);
	public abstract boolean retainAll(Collection<?> c);
	public abstract void clear();
	//Ovo su sve metode od collections, ovo ispod su posebne ta list
	
	public abstract String get(int index);

	public abstract String set(int index, String element);

	public abstract void add(int index, String element);

	public abstract String remove(int index);

	public abstract int indexOf(Object o);

	public abstract int lastIndexOf(Object o);

	public abstract ListIterator<String> listIterator();

	public abstract ListIterator<String> listIterator(int index);

	public abstract List<String> subList(int fromIndex, int toIndex);

}
