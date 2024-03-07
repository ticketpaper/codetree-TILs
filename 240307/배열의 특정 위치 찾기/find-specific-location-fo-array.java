import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum=0, count =0;
        float third = 0;

        for(int i=0;i<10;i++){
            arr[i] = sc.nextInt();
        }

        for(int i=1; i<10; i+=2){
            sum+=arr[i];
        }
        for(int i=2; i<10; i+=3){
            third += arr[i];
            count++;
        }
        System.out.println(sum+" "+third/count);

    }
}