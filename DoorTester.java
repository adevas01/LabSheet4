public class DoorTester {
  public static void main(String[] args) {

    Door door = new Door("front door", "open");

    door.setName("front Door");
    door.setState("open");
    System.out.println(door.getName());
    System.out.println(door.getState());

  }
  
}
