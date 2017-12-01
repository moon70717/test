package p08;

public class SortExam {
	
	public static void main(String[]args) {
		int[] nums= {1,2,2,3,3,4};
		int count=0;
		String duplStr="";
		for(int i=0;i<nums.length;i++) {
			for(int j=0;j<i;j++) {
				if(nums[i]==nums[j]) {
					count++;
					duplStr+=nums[i]+", ";
				}
			}
		}
		System.out.println(duplStr.substring(0,duplStr.length()-2));
		System.out.println("중복갯수는: "+count);
		
		count=1;
		switch(count) {
		case 1:
			System.out.println("case 1");
			break;
		default:
			System.out.println("default");
			break;
		}
	}
}
