/** 
* Name: Session.java
 * Date: 14 January 2025
 * Author: Tat Chansereyvong
 * Modified: 14 January 2025
 * Description: Lab 05
/* */

public class Session {
    private static final int duration;
    private static final Session Instance;
    static {
        duration = 4;
        Instance = new Session("008-167-378", 1, 5);
    }

    private String ID;
    private int startTime;
    private int endTime;
    public Session(String ID, int startTime, int endTime){
        this.ID = ID;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public static Session getInstance() {
        return Instance;
    }

    //Task 8

    public void setDuration(int startTime, int endTime) throws IllegalArgumentException {
        if(startTime >= endTime) {
            throw new IllegalArgumentException("Start time cannot be bigger than End Time");
        }
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public void display() {
        System.out.println("*****************************");
        System.out.println("         SESSION");
        System.out.println("*****************************");
        System.out.println("Session ID: "+ID);
        System.out.println("Start at: "+startTime+"AM");
        System.out.println("Duration: "+duration+" Hours");
        System.out.println("End at: "+endTime+"AM");
        System.out.println("*****************************");
    }
}
