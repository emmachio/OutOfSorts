import java.util.Arrays;
public class Sorts{

  public static void bubbleSort(int[] data) {
    int last = data.length;
    for(int j = 0; j < data.length; j++){
      for(int i = 0; i < last-1; i++) {
        System.out.println(Arrays.toString(data));
        int a = data[i];
        int b = data[i+1];
        if(a > b) {
          data[i] = b;
          data[i+1] = a;
        }
      }
    last--;
    }
  }
  public static void main(String[] args) {
    int[] nums = {4,3,2,10,12,1,5,6};
    bubbleSort(nums);
    String test = Arrays.toString(nums);
    System.out.println(test);
  }

}
