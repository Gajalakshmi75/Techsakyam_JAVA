import java.util.Scanner;
public class dowhile_loop {
  public static void main(String[] args) {
    int i = 1, n = 5;
    do {
      System.out.println(i);
      i++;
    } while(i <= n);
    System.out.println("----------------------------------");
  int sum = 0;
  int number = 0;
  Scanner input = new Scanner(System.in);
  do {
    sum += number;
    System.out.println("Enter a number");
    number = input.nextInt();
  } while(number >= 0); 
     
  System.out.println("Sum = " + sum);
  input.close();
}
}	



