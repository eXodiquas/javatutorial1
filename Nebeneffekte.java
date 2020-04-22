import java.util.*;

class Nebeneffekte {

    /*
        Call-By-Value
        Call-By-Reference
    */

    public static void main(String[] args) {
        int[] huhu = new int[] {1,2,3,4,5,6};
        malZwei(huhu);
        System.out.println(Arrays.toString(huhu));
    }

    public static void malZwei(int[] arr) {
        for(int i = 0; i < arr.length; i += 1) {
            arr[i] *= 2;
        }
    }
}