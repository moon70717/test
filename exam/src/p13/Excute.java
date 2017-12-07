package p13;

import java.util.ArrayList;
import java.util.Scanner;

public class Excute {

	ArrayList<Person> alPerson;

	Excute() {
		alPerson = new ArrayList<Person>();
		inputPersonCount();
	}

	void inputPersonCount() {
		System.out.println("시험본 총 학생수를 입력해주세요");
		Scanner s = new Scanner(System.in);
		int cnt = s.nextInt();
		for (int i = 0; i < cnt; i++) {
			s.nextLine();
			System.out.println((i + 1) + "번째 학생 이름을 입력해 주세요");
			Student st = new Student();
			st.setName(s.nextLine());
			System.out.println((i + 1) + "번째 학생의 나이를 입력해 주세요");
			st.setAge(s.nextInt());
			st.setCnt(alPerson.size()+1);
			alPerson.add(st);
		}
	}

	void sortAlList() {
//		SortList sorr=new SortList();
//		Collections.sort(alPerson,sorr);
		Person tempp=new Person();
		int age1;
		int age2;
		for(int i=0;i<alPerson.size();i++) {
			age1=alPerson.get(i).getAge();

			for(int j=0;j<alPerson.size();j++) {
				age2=alPerson.get(j).getAge();
				
				if(age1>age2) {
					tempp=alPerson.get(i);
					alPerson.set(i, alPerson.get(j));
					alPerson.set(j, tempp);
				}
			}
		}
	}
	
	void perintAlPerson() {
		for (Person p : alPerson) {
			Student s = (Student) p;
			/*System.out.print(s.getName() + "의 나이는 ");
			System.out.println(s.getAge() + "점 입니다.\n"+s.getCnt()+"번째 입력");*/
			System.out.println(p);
		}
	}

	public static void main(String[] args) {
		Excute e = new Excute();

		e.sortAlList();
		e.perintAlPerson();
	}
}


