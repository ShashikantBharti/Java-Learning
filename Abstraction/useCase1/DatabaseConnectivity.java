interface DatabaseConnection {
  void connect();
  void disconnect();
  void executeQuery(String Query);
}

class MySQLConnection implements DatabaseConnection {
  public void connect() { 
    System.out.println("Connecting to MySQL Database...");
    try {
      Thread.sleep(4000);
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("MySQL Database Connected Successfully!");
  }

  public void disconnect() {
    System.out.println("Disconnecting from MySQL Database...");
    try {
      Thread.sleep(2000);
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("MySQL Database Disconnected Successfully!");
  }

  public void executeQuery(String query) {
    System.out.println("Executing '" + query + "' Query...");
    try {
      Thread.sleep(5000);
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Query Executed Successfully!");
  }
}

class MongoDBConnection implements DatabaseConnection {
  public void connect() { 
    System.out.println("Connecting to MongoDB Database...");
    try {
      Thread.sleep(4000);
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("MongoDB Database Connected Successfully!");
  }

  public void disconnect() {
    System.out.println("Disconnecting from MongoDB Database...");
    try {
      Thread.sleep(2000);
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("MongoDB Database Disconnected Successfully!");
  }

  public void executeQuery(String query) {
    System.out.println("Executing '" + query + "' Query...");
    try {
      Thread.sleep(5000);
    } catch(InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println("Query Executed Successfully!");
  }
}

class Main {
  public static void main(String[] args) {
    DatabaseConnection db = new MySQLConnection();
    db.connect();
    db.executeQuery("SELECT * FROM students");
    db.disconnect();

    db = new MongoDBConnection();
    db.connect();
    db.disconnect();
  }
}