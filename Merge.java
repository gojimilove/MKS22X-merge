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

    //print data
    System.out.print("FULL ARRAY: [");
    for (int i = 0; i < data.length; i++) {
    	System.out.print(data[i]+", ");
    }
    System.out.print("]\n\n");

    //split array
    int[] loData = Arrays.copyOfRange(data, lo, hi/2);
    int[] hiData = Arrays.copyOfRange(data, hi/2, hi);

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
    //mergesort(loData, temp, lo, high/2);
    
    //mergesort right side
    //mergesort(hiData, temp, hi/2, hi);
    
    //merge assumming the two arrays ur merging are sorted

  	int loCount = 0;
  	int hiCount = 0;
  	int count = 0;

  	while (count < data.length) {
  		if (loCount >= loData.length) {
  			for (int i = hiCount; i < hiData.length; i++) {
  				System.out.println("HIGH: "+hiData[hiCount]);
  				data[count] = hiData[hiCount];
  				count++;
  			}
  		}
  		if (hiCount >= hiData.length) {
  			for (int i = loCount; i < loData.length; i++) {
  				System.out.println("LOW: "+loData[loCount]);
  				data[count] = loData[loCount];
  				count++;
  			}
  		}
  		else if (loData[loCount] <= hiData[hiCount]) {
  			System.out.println("LOW: "+loData[loCount]);
  			data[count] = loData[loCount];
  			loCount++;
  			count++;
  		} else {
  			System.out.println("HIGH: "+hiData[hiCount]);
  			data[count] = hiData[hiCount];
  			hiCount++;
  			count++;
  		}
  		//System.out.println(data[count-1]);
  	}

  	System.out.print("FULL ARRAY: [");
    for (int i = 0; i < data.length; i++) {
    	System.out.print(data[i]+", ");
    }
    System.out.print("]\n\n");

  }

  public static void main(String[]args) {
  	int[] data = new int[]{1,9,10,55,230,500,0,5,22,55,59,100};
  	mergesort(data);
  }
}
