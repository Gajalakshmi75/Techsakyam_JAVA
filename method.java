public class method {
    
    public int addnum(int a,int b){
        int sum=a+b;
        return sum;
    }
    public static void main(String[] args){
        int num1=7;
        int num2=5;
        method obj=new method();
        int result=obj.addnum(num1,num2);
        System.out.println("Sum is:"+result);
    }

}
