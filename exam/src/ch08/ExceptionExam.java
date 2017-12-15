package ch08;

public class ExceptionExam {
	
	ExceptionExam(int... in){
		
	}
	
	public static void main(String[] args) throws Exception{//어떤 에러가 발생할 가능성이 있는지 표시해둠, 메소드에 예외를 선언한다고함
		try {
			Exception ea=new Exception("에러 만들음");//에러를 직접 발생시킬수 있다
			int[] arr = new int[2];
//			arr[3]=2;
			throw ea;//에러 발동
			/*int a = 0;
			a /= 0;
			System.out.println("afs");// 에러가 떠서 catch로가면 뒤에것은 실행되지않음
*/		} catch (ArithmeticException e) {//수학적 에러
			if(e instanceof ArithmeticException) {//ArithmeticException의 인스턴스인지 확인
				System.out.println(true);
			}
			System.out.println("ArithmeticException e");
		} catch (ArrayIndexOutOfBoundsException e) {//배열숫자 애러
			System.out.println("ArrayIndexOutOfBoundsException e");
		} catch (Exception e) {//모든 예외 클래스는 Exception클래스의 자손이므로 Exception e를 선언하면 어떤 에러가 발생해도 처리됨
			System.out.println("에러발생메세지:"+e.getMessage());//getMessage로 에러 메세지를 받을수 있음
			e.printStackTrace();
		} /*catch(ExceptionA | ExceptionB ae) { 여러개를 할수있다
			
		} */finally {//트라이 캐치를 다 쓴뒤에 실행하게됨
			System.out.println("finally블럭입니다");
		}
	}
}
