class overloadd {

    String language;
  
    // constructor with no parameter
    overloadd() {
      this.language = "Java";
    }
  
    // constructor with a single parameter
    overloadd(String language) {
      this.language = language;
    }
  
    public void getName() {
      System.out.println("Programming Langauage: " + this.language);
    }
  
    public static void main(String[] args) {
  
      // call constructor with no parameter
      overloadd obj1 = new overloadd();
  
      // call constructor with a single parameter
      overloadd obj2 = new overloadd("Python");
  
      obj1.getName();
      obj2.getName();
    }
  }
  