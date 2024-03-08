import java.util.*;
public class Main { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int odd_sum = 0, even_sum =0;
        for(int i=0; i<arr.length; i++){
            int num = sc.nextInt();
            arr[i] = num; 
            if((i+1)%2==1) odd_sum += num;
            else even_sum += num;
        }
        int max = Math.max(odd_sum, even_sum);
        int min = Math.min(odd_sum, even_sum);
        System.out.println(max-min);
    }
}