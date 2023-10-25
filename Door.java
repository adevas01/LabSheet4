/*
 * 1) Create class Door
*/
public class Door {
  // 2) Instance variables
  private String name;
  private String state;    

  // Constructor
  public Door(String name, String state) {
    this.name = name;
    this.state = state;    
  } 
  // 6) Setters for name and state
  public void setName(String newName) {
    this.name = newName;
  }
  public void setState(String newState) {
    this.state = newState;
  }
  // 3
  public void close() {
    System.out.println("The door is closed now"); 
  }
  public void open() {
    System.out.println("The door is openned now");
  }


  // Part 5 getters
  public String getState() {
    return state;
  }   
  public String getName() {
    return name;
  } 
}