package p08;

public class Exam {
	public static void main(String[]args) {
		int[] nums1= {1,2,3};
		int[] nums2= {2,3,4};
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(nums2[i]==nums1[j])
					System.out.println(nums2[i]+"와"+nums1[j] +"은 같음");
			}
		}
	}
}
