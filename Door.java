public class Door {

  private String name;
  private String state;

  public Door(String name, String state) {
    this.name = name;
    this.state = state;
  } 

  public void setName(String newName) {
    this.name = newName;
  }

  public void setState(String newState) {
    this.state = newState;
  }
  
  public String getName() {
    return name;
  }

  public String getState() {
    return state;
  }
}