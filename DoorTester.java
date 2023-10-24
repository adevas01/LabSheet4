
public class DoorTester {
  public static void main(String[] args) {  


    Door door1 = new Door("front door", "open");

    //door.setName("front door");
    //door.setState("open");
    System.out.println("The " + door1.getName() + " is " + door1.getState());

    Door door2 = new Door("side door", "closed");

    //door.setName("front door");
    //door.setState("open");
    System.out.println("The " + door2.getName() + " is " + door2.getState());



  }
  
}
