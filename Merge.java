import java.util.*;

public class Merge {
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    int[]temp = new int[data.length];
    mergesort(data, 0, data.length-1);
  }

  // helper method
  private static void mergesort(int[]data, int lo, int hi){
    if (lo >= hi) {
      return;
    }

    //split array
    int[] loData = Arrays.copyOfRange(data, lo, hi/2+1);
    int[] hiData = Arrays.copyOfRange(data, hi/2+1, hi+1);

    System.out.println(lo);
    System.out.println(hi/2);
    System.out.println(hi);

    // if (data.length <= 2) {
    //   if(loData[0] > hiData[0]) {
    //     int old = data[0];
    //     data[0] = data[1];
    //     data[1] = old;
    //   }
    //   System.out.print("FULL ARRAY: [");
    //   for (int i = 0; i < data.length; i++) {
    //   	System.out.print(data[i]+", ");
    //   }
    //   System.out.print("]\n\n");
    //   return;
    // }

    //print data
    System.out.print("FULL ARRAY: [");
    for (int i = 0; i < data.length; i++) {
    	System.out.print(data[i]+", ");
    }
    System.out.print("]\n\n");

    //print lower half
    System.out.print("LOW DATA: [");
    for (int i = 0; i < loData.length; i++) {
    	System.out.print(loData[i]+", ");
    }
    System.out.print("]\n\n");

    //print higher half
    System.out.print("HIGH DATA: [");
    for (int i = 0; i < hiData.length; i++) {
    	System.out.print(hiData[i]+", ");
    }
    System.out.print("]\n\n");

    //mergesort left side
    mergesort(loData, lo, hi/2);

    //mergesort right side
    mergesort(hiData, lo, hi/2);

    //merge 2 sorted arrays
  }

  public static void main(String[]args) {
  	int[] data = new int[]{38,27,43,3,9,82,10};
  	mergesort(data);
  }
}
