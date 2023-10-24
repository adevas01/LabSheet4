public class Door {

  private String name;
  private String state;

  public Door(String name, String state) {
    this.name = name;
    this.state = state;
  } 

  public void setName(String name) {
    this.name = name;
  }

  public void setState(String state) {
    this.state = state;
  }
  
  public String getName() {
    return name;
  }

  public String getState() {
    return state;
  }
}