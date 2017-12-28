package ch12;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		Box<Apple> appleB=new Box<Apple>();
		
	}	
}
class Apple{
	
}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>();

	void add(T item) {
		list.add(item);
	}

	T get(int i) {
		return list.get(i);
	}

	ArrayList<T> getList() {
		return list;
	}

	int size() {
		return list.size();
	}

	public String toString() {
		return list.toString();
	}
}
