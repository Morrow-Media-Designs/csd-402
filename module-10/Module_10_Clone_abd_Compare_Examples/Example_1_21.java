/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Comparable and Cloneable
 *
 * Must override Object.clone method
 * public Object clone() throws CloneNotSupportedException
 * 
 * Must change visibility from protected to public
 * 
 * Negative (-#) - Less than
 * Equal (0)
 * Positive (+#) - Greater than
 */
public class Example_1_21 implements Cloneable, Comparable <Example_1_21>{
  
  private String name;
  
  // Constructor
  public Example_1_21(String name) {
    this.name = name;
  }
   
  // Getter
  public String getName() {
    return name;
  }

  public void setName(String s) {
    name = s;
  }

  // Override Comparable.compareTo
  @Override
  public int compareTo(Example_1_21 o){

    return this.name.compareTo(o.getName());
  }  
  
  @Override
  public Object clone() throws CloneNotSupportedException{  
        return (Example_1_21)super.clone();  
    }
   
  public static void main(String[] args) {


    Example_1_21 emp7 = new Example_1_21("Ted");
    Example_1_21 emp8;

      try {

        emp8 = (Example_1_21) emp7.clone();
        System.out.println();
        System.out.println(emp7.getName());
        System.out.println(emp8.getName());

        System.out.println();

        emp7.setName("George");
        emp8.setName("Sue");
        
        System.out.println(emp7.getName());
        System.out.println(emp8.getName());

        System.out.println();

      }catch (CloneNotSupportedException e) {

        e.printStackTrace();
      }

System.out.println("------------------------------------");


    Example_1_21 emp1 = new Example_1_21("Larry");
    Example_1_21 emp2 = new Example_1_21("Ted");
    Example_1_21 emp3 = new Example_1_21("Adam");

    Example_1_21 emp10 = new Example_1_21("Frank");

    System.out.println();

    System.out.println("C".compareTo("C")); // Equals
    System.out.println("C".compareTo("A")); // 2
    System.out.println("C".compareTo("F")); // -3

    System.out.println();

    System.out.println(emp10.compareTo(emp1)); // -6
    System.out.println(emp10.compareTo(emp2)); // -14
    System.out.println(emp10.compareTo(emp3)); // 5
    System.out.println(emp10.compareTo(emp10)); // 0

    System.out.println();
  }
}