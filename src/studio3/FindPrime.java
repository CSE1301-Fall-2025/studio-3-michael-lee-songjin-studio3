import java.util.Scanner;
public class FindPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Number:");
        int num = in.nextInt();
        boolean prime[] = new boolean[num];
        for(int i=0; i<num; i++){
            prime[i]=true;
        }

        for(int i=2; i< Math.sqrt(num);i++){
            //System.out.println(i);
            if (prime[i]){
                double j= Math.pow(i,2);
                for(int k=(int) j; k<num; k+=i){
                    //System.out.println(k);
                    prime[k]=false;
                }
            }
        }
        for (int m=0; m<num; m++){
            if (prime[m]){
                System.out.println(m);
            }
        }
    }

}