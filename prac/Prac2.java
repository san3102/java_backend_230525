package prac;
import java.util.*;
public class Prac2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = 3;
        int[] slicer = {1,5,2};
        int[] num_list = {1,2,3,4,5,6,7,8,9};


        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        switch(n){
            case 1:
                for(int i = 0; i <= b; i++){
                    arr.add(num_list[i]);
                }
                break;
            case 2:
                for(int i = a; i <= num_list.length - a; i++){
                    arr.add(num_list[i]);
                }
                break;
            case 3:
                for(int i = a; i <= b; i++){
                    arr.add(num_list[i]);
                }
                break;
            case 4:
                for(int i = a; i <= b; i += c){
                    arr.add(num_list[i]);
                }
                break;
        }


        System.out.println(arr);
    }
}
