import java.util.*;

class java_cricmetric{
    public static void main(String [] args){
        int sum=0, maxIndex=0;
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[]  score = new int[n];
        for (int i = 0; i < n; i++) score[i] = sc.nextInt();

        for(int i =0; i<n ; i++){
            sum += score[i];
            if(score[maxIndex]<score[i])  maxIndex=i;
        }
        
        System.out.println(sum);
        System.out.println(maxIndex);

        sc.close();

    }
}