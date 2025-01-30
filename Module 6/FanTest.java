package Module_6;

// Test class
public class FanTest {
    public static void main(String[] args) {
        // Creating fans using both constructors
        Fan defaultFan = new Fan();
        Fan customFan = new Fan(Fan.FAST, true, 10.5, "blue");

        // Displaying initial states
        System.out.println("Default Fan: " + defaultFan);
        System.out.println("Custom Fan: " + customFan);

        // Modifying default fan properties
        defaultFan.setSpeed(Fan.MEDIUM);
        defaultFan.setOn(true);
        defaultFan.setRadius(8.0);
        defaultFan.setColor("black");

        // Displaying modified state
        System.out.println("Modified Default Fan: " + defaultFan);
    }
}