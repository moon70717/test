package p12;

public class Excute {

	public static void main(String[] args) {
		ListExam le = new ListExam();

		/*for (int i = 0; i < 10; i++) {
			le.add(i+"");
		}
		
		for (int i = 0; i < le.size(); i++) {
			if (Integer.parseInt(le.get(i)) % 2 == 0) {
				le.remove(i);
			}
			System.out.println(le.get(i));
		}*/
		
		
		le.inputAlStr();
		le.printAlStr();

		// le.remove(0);
	}
}
