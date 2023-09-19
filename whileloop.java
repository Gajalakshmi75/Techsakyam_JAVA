import java.util.Scanner;
public class whileloop {
    public static void main(String[] args){
        int i=1,n=5;
        while(i<=n)
        {
            System.out.println(i);
            i++;
        }
        System.out.println("-----------------------------------------");
        //sum of positive numbers
        int sum=0;      
        Scanner input=new Scanner(System.in);
        System.out.println("enter a number:");
        int number=input.nextInt();
        while(number>=0)
        {
        sum+=number;
        System.out.println("Enter THE number");
        number=input.nextInt();
        }
        System.out.println("Sum="+sum);
        input.close();
    }
}
