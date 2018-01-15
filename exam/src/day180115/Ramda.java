package day180115;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ramda {
	public static void main(String[] args) {
		new Thread(() -> {
			System.out.println("hi");
		}).start();
		int result = Func.add.calc(1, 2) + Func.add2.calc(3, 4);
		System.out.println(result);

		//사용하기 위해 준비해놈 (Steam을 준비함) 
		Arrays.asList(1, 2, 3).stream(); // (1)
		Arrays.asList(1, 2, 3).parallelStream();// 요놈은 병렬로 준비

		System.out.println("순서대로 출력");
		Arrays.asList(1, 2, 3).stream().forEach(System.out::println);

		System.out.println("제곱하기");
		Arrays.asList(1, 2, 3).stream().map(i -> i * i).forEach(System.out::println);

		System.out.println("최초요소부터 limit까지");
		Arrays.asList(1, 2, 3).stream().limit(1).forEach(System.out::println);

		System.out.println("컬렉션으로 배열로 변경");
		Object obj = Arrays.asList(1, 2, 3).stream().collect(Collectors.toList());
		System.out.println(obj);
		obj = Arrays.asList(1, 2, 3).stream().iterator();
		System.out.println(obj);

		System.out.println("있는 값을 조건에따라 거름");
		Arrays.asList(1, 2, 3).stream().filter(i -> 2 >= i).forEach(System.out::println);
	}
}
