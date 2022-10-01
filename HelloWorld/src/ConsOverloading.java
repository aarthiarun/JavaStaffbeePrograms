
class ConsOverloading {

  String language;

  // constructor with no parameter
  ConsOverloading () {
    language = "Java";
  }

  // constructor with a single parameter
  ConsOverloading (String language) {
    this.language = language;
  }

  public void getName() {
    System.out.println("Programming Langauage: " + this.language);
  }

  
}
