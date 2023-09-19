class area{
    int length;
    int breadth;
    area(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public void getarea(){  //: getArea(). we bundled these fields and methods inside a single class.
        int area=length*breadth;
        System.out.println("Area:"+area);
    }
}
public class encapsulation {
    public static void main(String[] args)
    {
        area rect=new area(5,7);
        rect.getarea();
    }
    
}
