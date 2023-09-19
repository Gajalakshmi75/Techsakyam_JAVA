class constructorr {
    private String name;
    // constructor
    constructorr() {
      System.out.println("Constructor Called:");
      name = "Programiz";
    }
    public static void main(String[] args) {
      // constructor is invoked while
      // creating an object of the Main class
      constructorr  obj = new constructorr();
      System.out.println("The name is " + obj.name);
    }
  }
  