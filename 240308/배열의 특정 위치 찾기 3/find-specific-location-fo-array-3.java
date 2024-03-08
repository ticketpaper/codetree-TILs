import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i]==0){
                index = i;
                break;
            }
        }
        System.out.println(arr[index-1]+arr[index-2]+arr[index-3]);
        
    }
}