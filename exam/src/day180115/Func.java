package day180115;

interface Func {
	public int calc(int a, int b);
	Func add = (int a, int b) -> a + b;
	Func add2 = (int a, int b) -> { return a + b; };
}
