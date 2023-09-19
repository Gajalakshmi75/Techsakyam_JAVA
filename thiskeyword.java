class thiskeyword {
    int instVar;

    thiskeyword(int instVar){
        this.instVar = instVar;
        System.out.println("this reference = " + this);
    }

    public static void main(String[] args) {
        thiskeyword obj = new thiskeyword(8);
        System.out.println("object reference = " + obj);
    }
}
