/** 
* Name: Main.java
 * Date: 14 January 2025
 * Author: Tat Chansereyvong
 * Modified: 14 January 2025
 * Description: Lab 05
/* */
 public class Main {
    public static void main(String[] args) {
        Session session = Session.getInstance();

        try{
            session.setDuration(1, 5);
            System.out.println("Session set from " + session.getStartTime() + " to " + session.getEndTime());
            session.display();
        } catch (IllegalArgumentException error) {
            System.out.println("Error: " + error.getMessage());
        }
    }
}
