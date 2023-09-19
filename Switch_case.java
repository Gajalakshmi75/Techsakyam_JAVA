public class Switch_case {
    public static void main(String[] args)
    {
        int num=55;
        String size;
        switch(num){
            case 39:
            size="small";
            break;
            case 52:
            size="Medium";
            break;
            case 55:
            size="Large";
            break;
            case 58:
            size="Extra large";
            break;
            default:
            size="Unkonown";
            break;
        }
        System.out.println("Size:"+size);
    }
    
}
