import java.util.*;

public class Merge {
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    int[]temp = new int[data.length];
    mergesort(data, temp, 0, data.length);
  }

  // helper method
  private static void mergesort(int[]data, int[]temp, int lo, int hi){
    // if (lo >= hi) {
    //   return;
    // }
    System.out.print("FULL ARRAY: [");
    for (int i = 0; i < data.length; i++) {
    	System.out.print(data[i]+", ");
    }
    System.out.print("]\n\n");

    int[] loData = Arrays.copyOfRange(data, lo, hi/2);
    int[] hiData = Arrays.copyOfRange(data, hi/2, hi);

    System.out.print("LOW DATA: [");
    for (int i = 0; i < loData.length; i++) {
    	System.out.print(loData[i]+", ");
    }
    System.out.print("]\n\n");

    System.out.print("HIGH DATA: [");
    for (int i = 0; i < hiData.length; i++) {
    	System.out.print(hiData[i]+", ");
    }
    System.out.print("]\n\n");


    // //mergesort left side
    // mergesort(loData, temp, lo, high/2);
    // //mergesort right side
    // mergesort(hiData, temp, hi/2, hi);
    //merge

  //   int loCount = 0;
  //   int hiCount = 0;
  //   int count = 0;

		// while (loCount < loData.length && hiCount < hiData.length) {
		// 	if (loData[loCount] <= hiData[hiCount]) {
		// 		data[count] = loData[loCount];
		// 		loCount++;
		// 		count++;
		// 	} else {
		// 		data[count] = hiData[hiCount];
		// 		hiCount++;
		// 		count++;
		// 	}
		// }

  }

  public static void main(String[]args) {
  	int[] data = new int[]{1,9,10,55,230,500,0,5,22,55,59,100};
  	mergesort(data);
  }
}
