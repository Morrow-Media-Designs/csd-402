/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 * Comparable - Find larger (order) of two objects
 *
 * We must override the compareTo method
 *    with the concrete, implement type as the parameter  
 *
 * Negative  (-#) - Less than
 *   The calling object is less than (earlier) the parameter
 * Equal (0)
 * Positive (+#) - Greater than
 *   The calling object is greater than (later) the parameter
 */
public class Example_1_20 implements Comparable <Example_1_20>{
  
  private String name;
  
  // Constructor
  public Example_1_20(String name) {
    this.name = name;
  }
   
  // Getter
  public String getName() {
    return name;
  }

  // Override Comparable.compareTo
  @Override
  public int compareTo(Example_1_20 o){

    return this.name.compareTo(o.getName());
  }  
     
  public static void main(String[] args) {
    Example_1_20 emp1 = new Example_1_20("Larry");
    Example_1_20 emp2 = new Example_1_20("Ted");
    Example_1_20 emp3 = new Example_1_20("Adam");

    Example_1_20 emp10 = new Example_1_20("Frank");

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