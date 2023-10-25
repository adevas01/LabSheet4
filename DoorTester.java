
public class DoorTester {
  public static void main(String[] args) {  

    // 4) Door object 
    Door frontDoor = new Door("Front", "open");
    System.out.println("The front door is " + frontDoor.getState());
    System.out.println("Expected: open");
    System.out.println("........................................");

    Door backDoor = new Door("Back", "closed");
    System.out.println("The back door is " + backDoor.getState());
    System.out.println("Expected: closed");
    System.out.println(".........................................");

    // Use mutators/setters to change the state variable
    backDoor.setState("open");
    System.out.println("The back door is " + backDoor.getState());
    System.out.println("Expected: open");
    System.out.println("..........................................");  

    // Use mutators/setters to change the name variable
    backDoor.setName("Kitchen");
    System.out.println("The back door is called " + backDoor.getName());
    System.out.println("Expected: Kitchen");
    System.out.println(".........................................."); 

    // door object sideDoor
    Door sideDoor = new Door("Side", "closed");
    System.out.println("The side door is " + sideDoor.getState());
    System.out.println("Expected: closed");
    sideDoor.setState("open");
    System.out.println("The side door is " + sideDoor.getState());
    System.out.println("Expected: open");
    System.out.println(".........................................."); 
    

    



  }
  
}
