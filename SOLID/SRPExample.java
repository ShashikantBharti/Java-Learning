// SRP - Single Responsibility Principle

// Class for Managing User Data  (Responsibilty 1) 
class UserDataManager {
  public void saveUserData(String userData) {
    // Save user data
    try {
      System.out.println("Data saving...");
      Thread.sleep(2000);
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("User data saved to the database - " + userData);
  }
}

// Class for logging actions (responsibility 2) 
class Logger {
  public void log(String message) {
    System.out.println("Log: " + message);
  }
}

// Main Class

public class SRPExample {
  public static void main(String[] args) {
    UserDataManager userDataManager = new UserDataManager();
    Logger logger = new Logger();

    userDataManager.saveUserData("User12345");
    logger.log("User Data Saved Successfully!");
  }
}









