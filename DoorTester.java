import java.util.Scanner;
public class DoorTester {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String name = scanner.next();
    String state = scanner.next();

    Door door = new Door(name, state);

    door.setName(name);
    door.setState(state);
    System.out.println(door.getName());
    System.out.println(door.getState());

  }
  
}
