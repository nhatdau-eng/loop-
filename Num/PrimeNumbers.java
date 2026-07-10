package Num;
import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in );

        System.out.print("Nhap so nguyen can in : ");
        int number = 20;
        int count = 0;
        int N =2; 
        
        while(count < number){
            boolean isPrime = true ; 
            for( int i = 2 ; i < N ; i++){
                if(N % i == 0){
                    isPrime = false ;
                    break;
                }
            }
            if(isPrime){
                System.out.println(N);
                count ++;
            }
            N++;
        }
        scanner.close();
    }
}
