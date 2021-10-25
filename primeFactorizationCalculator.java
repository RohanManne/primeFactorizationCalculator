import java.util.Scanner;

public class primeFactorizationCalculator {

  public static String primeFactors(int number) {
    
    String primes = "Prime Factors: ";
    int n = number;
    
    if(n - 2 < 2) {
      return "Number is to small.";
    }
    
    
    while(n % 2 == 0) {
      primes += "2 ";
      n /= 2;
    }
    
    for(int i = 3; i <= n; i += 2) {
      while(n % i == 0) {
        primes += i + " ";
        n /= i;
      }
    }
    

    
    return primes;
  }
  
  public static void main(String[] args) {
    
    int number = 0;
    Scanner sc = new Scanner(System.in);
    
    System.out.println ("Please enter number to find Prime factors of: ");
    number = sc.nextInt();
    
    System.out.println(primeFactors(number));
  }

}
