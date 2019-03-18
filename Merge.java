import java.util.*;

public class Merge {
  public static void main(String[]args) {

  }
  /*sort the array from least to greatest value. This is a wrapper function*/
  public static void mergesort(int[]data){
    int[]temp = new int[data.length];
    mergesort(data, temp, 0, data.length);
  }

  // helper method
  private static void mergesort(int[]data, int[]temp, int lo, int hi){
    if (lo >= hi) {
      return;
    }
    int[] loData = Arrays.copyOfRange(data, lo, hi/2);
    int[] hiData = Arrays.copyOfRange(data, hi/2, hi);
    //mergesort left side

    //mergesort right side

    //merge

  }
}
