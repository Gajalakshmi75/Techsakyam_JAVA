public class loops {
    public static void main(String[] args){
        int n=5;
        for(int i=1;i<=n;i++)           //for loop
        {
            System.out.println("JAva is Fun");
        }
        System.out.println("**************************************");

        // Program to find the sum of natural numbers from 1 to 1000.
        int sum=0;
        int num=1000;
        for(int i=1;i<=num;i++)
        {
            sum+=i;

        }
        System.out.println("Sum="+sum);
        System.out.println("**************************************");

        //foreach looop
        int[] numbers={7,5,4,-6};
        for(int number:numbers){
            System.out.println(number);
        }
        System.out.println("**************************************");

        //foreach infinite loop
         int s=0;
         for(int i=1;i<=10;--i)
         {
            System.out.println("HIII");
         }
         System.out.println("**************************************");
    }
    
}
