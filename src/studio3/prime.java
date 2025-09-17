import java.util.Scanner;

public class prime {
    public static void main(String[] args){
    Scanner in = new Scanner (System.in);

    System.out.println("Number: ");
    int num = in.nextInt();
    Boolean prime[] = new Boolean[num];
    for (int i = 0; i < prime.length; i++){
        prime[i] = true;
    }

    for (int i = 2; i < num; i++){
       // System.out.println(i);
       if (prime[i]){
        for (int j = 2*i; j < num; j = j + i){
            //System.out.println(k);
            prime[j] = false;
        }
       }
       }

    for (int i = 0; i < num; i++){
        if (prime[i]){
           System.out.println(i);
        }
    }
    }
}
