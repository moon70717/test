package ch06;

public class Varargs {// ��������
	String concate(String s1) {
		String all="";
		all+=s1;
		return all;
	}
	String concate(String s1,String s2) {
		String all="";
		all+=s1+s2;
		return all;
	}
	String concate(String s1,String s2,String s3) {//�������� ������ �Ű������� �߰��ؾߵǼ� ������
		String all="";
		all+=s1+s2+s3;
		return all;
	}
	
	String[] concate(String...strings) {//�������� �ѹ��� ������ ����
		return strings;//��� �ڵ����� �迭�� ��ȯ�Ǽ� �����Ե�
		
	}
	/*String[] concate(String str, String...strings) {  �����ϰ� ���� ����� �Ǽ� �޼��带 ȣ���ҋ� ������ ���� 
		return strings;  
		
	}*/
	String[] concate(int i, String...strings) {//�ٸ� �Ű������� ���� ����ҷ��� ���� �ڿ� �־���
		return strings;
		
	}
	public static void main(String[]args) {
		String[] str=new Varargs().concate("1","2","3","4");
		for(int i=0;i<str.length;i++) {
			System.out.print(str[i]);
		}System.out.println();
		String[] str2={"3","5"};
		str=new Varargs().concate(str2);//�迭�� ����������
		for(int i=0;i<str2.length;i++) {
			System.out.print(str[i]);
		}System.out.println();
	}
}
