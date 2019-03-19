import java.util.*;

public class Merge {
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    mergesort(data, 0, data.length-1);
  }

  // helper method
  private static void mergesort(int[]data, int lo, int hi){
    if (lo >= hi) {
      return;
    }

    //split array in half
    int[] loData = Arrays.copyOfRange(data, lo, hi/2+1);
    int[] hiData = Arrays.copyOfRange(data, hi/2+1, hi+1);

    // System.out.println(lo);
    // System.out.println(hi/2);
    // System.out.println(hi);

    //print data
    // System.out.print("FULL ARRAY: [");
    // for (int i = 0; i < data.length; i++) {
    // 	System.out.print(data[i]+", ");
    // }
    // System.out.print("]\n\n");

    //print lower half
    // System.out.print("LOW DATA: [");
    // for (int i = 0; i < loData.length; i++) {
    // 	System.out.print(loData[i]+", ");
    // }
    // System.out.print("]\n\n");

    //print higher half
    // System.out.print("HIGH DATA: [");
    // for (int i = 0; i < hiData.length; i++) {
    // 	System.out.print(hiData[i]+", ");
    // }
    // System.out.print("]\n\n");

    //mergesort left side
    mergesort(loData, lo, hi/2);

    //mergesort right side
    mergesort(hiData, lo, hi/2);

    //merge 2 sorted arrays assuming they are both already sorted
    int loCount = 0;
    int hiCount = 0;
    int count = 0;

    while (count < data.length) {
    	if (loCount >= loData.length) {
    		//if reached the end of low array, just add high values
    		data[count] = hiData[hiCount];
    		hiCount++;
    		count++;
    	} else if (hiCount >= hiData.length) {
    		//if reached the end of high array, just add low values
    		data[count] = loData[loCount];
    		loCount++;
    		count++;
    	} else if (loData[loCount] <= hiData[hiCount]) {
    		//if not at the end of either array yet, add smaller value counting from begining
    		//value in low array smaller
    		data[count] = loData[loCount];
    		loCount++;
    		count++;
    	} else {
    		//value in high array smaller
    		data[count] = hiData[hiCount];
    		hiCount++;
    		count++;
    	}
    }
  }

  public static void main(String[]args) {
  	int[] data = new int[]{38,27,43,3,9,82,10};
  	System.out.print("UNSORTED ARRAY: [");
    for (int i = 0; i < data.length; i++) {
    	System.out.print(data[i]+", ");
    }
    System.out.print("]\n\n");
  	mergesort(data);
  	System.out.print("SORTED ARRAY: [");
    for (int i = 0; i < data.length; i++) {
    	System.out.print(data[i]+", ");
    }
    System.out.print("]\n\n");
  }
}
