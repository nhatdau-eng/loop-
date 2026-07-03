import java.util.Scanner;
 public class Prime {
    public static void main(String[] agrs){
        Scanner scanner = new Scanner( System.in);
        System.out.print("Enter the numer:");
        int number = scanner.nextInt();

        if(number < 2 ){
            System.out.print(number + " is a not prime");
        }
        else{
            int i = 2 ; 
        boolean check = true ; 
        while( i <= Math.sqrt(number)){
            if (number % i == 0 ){
                check = false ;
                break ; 
            }
            i++ ;
        }
    
        if(check)
            System.out.println(number + " is a prime");
        else
            System.out.println(number + " is not a prime");
        }
        scanner.close();
 }
}
