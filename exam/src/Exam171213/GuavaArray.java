package Exam171213;

import java.util.List;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.common.collect.Lists;
import com.google.common.primitives.Ints;

public class GuavaArray {

	public void arrayToListWithGuava() {
//	    Integer[] sourceArray = { 0, 1, 2, 3, 4, 5 };
//	    List<Integer> targetList = Lists.newArrayList(sourceArray);
		
		List<Integer> sourceList = Lists.newArrayList(0, 1, 2, 3, 4, 5);
	    int[] targetArray = Ints.toArray(sourceList);
	}
	
	public static void main(String[]args) {
		List<Integer> sourceList = Lists.newArrayList(0, 1, 2, 3, 4, 5);
	    int[] targetArray = Ints.toArray(sourceList);
	    
	    ListMultimap<String, String> multimap = ArrayListMultimap.create();
	    multimap.put("3","4");
	    multimap.put("3","1");
	    multimap.put("3","2");
	    multimap.put("3","4");
	    multimap.put("3","5");
	    
	    System.out.println(multimap.toString());
	}

}
