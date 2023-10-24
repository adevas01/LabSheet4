
public class DoorTester {
  public static void main(String[] args) {  


    Door door1 = new Door("front door", "open");

    door1.setName("back door");
    door1.setState("closed");
    System.out.println("The " + door1.getName() + " is " + door1.getState());

    Door door2 = new Door("side door", "closed");

    door2.setName("front door");
    door2.setState("open");
    System.out.println("The " + door2.getName() + " is " + door2.getState());



  }
  
}
