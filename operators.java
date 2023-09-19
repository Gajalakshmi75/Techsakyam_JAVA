public class operators {
    public static void main(String[] args){
    int a=7,b=5;                   //Arithmetic operators
    System.out.println("a+b=" + (a+b));
    System.out.println("a-b=" + (a-b));
    System.out.println("a*b=" + (a*b));
    System.out.println("a/b=" + (a/b));
    System.out.println("a%b=" + (a%b));
    System.out.println("----------------------------------------------");
    int c=7;         //Assignment operators
    int var;
    var=c;
    System.out.println("var using =:"+var);
    var+=c;
    System.out.println("var using +=:"+var);
    var-=c;
    System.out.println("var using -=:"+var);
    var*=c;
    System.out.println("var using *=:"+var);
    System.out.println("----------------------------------------------");
    int m=4,n=6;   //relational operators
    System.out.println(a==b);
    System.out.println(a!=b);
    System.out.println(a>b);
    System.out.println(a<b);
    System.out.println(a>=b);
    System.out.println(a<=b);
    System.out.println("----------------------------------------------");                  
                          //logcal operators
    System.out.println((7>4)&&(6>5));
    System.out.println((7>4)&&(6>5));
    
    System.out.println((7>4)||(6>5));
    System.out.println((7>4)||(6>5));
    System.out.println((7<4)||(6>5));

    System.out.println(!(5==7));
    System.out.println(!(7>5));
    System.out.println("----------------------------------------------");

    int p=7,q=7; //incrremt decrement
    System.out.println("value of p:"+p);
    int result1=++p;
    System.out.println("After increment:" + result1);
    System.out.println("value of q:"+p);
    int result2=--q;
    System.out.println("After decrement:"+result2);
    System.out.println("----------------------------------------------");


}
}
