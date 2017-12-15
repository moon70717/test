package p11;

public class ListExam2 extends Object {
	int[] nums = new int[0];

	public boolean add(int num) {
		int len = nums.length;
		int[] copy_num = new int[len + 1];
		for (int i = 0; i < nums.length; i++) {
			copy_num[i] = nums[i];
		}
		copy_num[len] = num;
		nums = copy_num;
		return true;
	}

	public int indexOf(int num) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == num) {
				return i;
			}
		}
		return -1;
	}
	
	public int length() {
		return nums.length;
	}
	
	
	public static void main(String[]args) {
		ListExam2 le=new ListExam2();
		
		le.add(3);
		
	}
}
