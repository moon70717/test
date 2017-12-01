package ch09;

public class Hash {
	public static void main(String[]args) {
		String str1=new String("str");
		String str2=new String("str");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
	}
}
