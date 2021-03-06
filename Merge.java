import java.util.*;

public class Merge {
	public static void insertionsort(int[] data, int lo, int hi) {
		for (int i = lo; i < hi; i++) {
			int current = data[i];
			int j = 0;
			for (j = i; j > 0 && current <= data[j - 1]; j--) {
				data[j] = data[j - 1]; //move int at index (j-1) to index j
			}
			data[j] = current; //move int current to index j
		}
	}


  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    mergesort(data, 0, data.length-1);
  }

  // helper method
  private static void mergesort(int[]data, int lo, int hi){
    if (data.length <= 43) {
    	insertionsort(data, 1, data.length);
    	return;
    }
    if (lo >= hi) {
      return;
    }

    //split array in half
    int[] loData = Arrays.copyOfRange(data, lo, hi/2+1);
    int[] hiData = new int[data.length-loData.length];
    if (data.length == 3) {
    	hiData[0] = data[2];
    } else {
    	hiData = Arrays.copyOfRange(data, hi/2+1, hi+1);
    }

    // System.out.println(lo);
    // System.out.println(hi/2+1);
    // System.out.println(hi+1);

    // //print data
    // System.out.print("FULL ARRAY: [");
    // for (int i = 0; i < data.length; i++) {
    // 	System.out.print(data[i]+", ");
    // }
    // System.out.print("]\n\n");

    // //print lower half
    // System.out.print("LOW DATA: [");
    // for (int i = 0; i < loData.length; i++) {
    // 	System.out.print(loData[i]+", ");
    // }
    // System.out.print("]\n\n");

    // //print higher half
    // System.out.print("HIGH DATA: [");
    // for (int i = 0; i < hiData.length; i++) {
    // 	System.out.print(hiData[i]+", ");
    // }
    // System.out.print("]\n\n");

    //mergesort left side
    mergesort(loData, 0, loData.length-1);

    //mergesort right side
    mergesort(hiData, 0, hiData.length-1);

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

    // System.out.print("SORTED ARRAY: [");
    // for (int i = 0; i < data.length; i++) {
    // 	System.out.print(data[i]+", ");
    // }
    // System.out.print("]\n\n");
  }

  public static void main(String[]args) {
  	// int[] test = new int[]{38,27,43,3,9,82,10};
  	// insertionsort(test,1,test.length);
  	int[] data = new int[]{38,27,43,3,9,82,10};
  	System.out.print("UNSORTED ARRAY: [");
    for (int i = 0; i < data.length; i++) {
    	System.out.print(data[i]+", ");
    }
    System.out.print("]\n\n");
  	
  	
    int[]data1 = new int[data.length];
    for (int i = 0; i < data1.length; i++) {
    	data1[i] = data[i];
    }
    mergesort(data);
    Arrays.sort(data1);
    System.out.print("SORTED ARRAY: [");
    for (int i = 0; i < data.length; i++) {
    	System.out.print(data[i]+", ");
    }
    System.out.print("]\n\n");
    System.out.print("REAL SORTED ARRAY: [");
    for (int i = 0; i < data1.length; i++) {
    	System.out.print(data1[i]+", ");
    }
    System.out.print("]\n\n");
    if (Arrays.equals(data1, data)) System.out.println("YaY");
  }

  
}
