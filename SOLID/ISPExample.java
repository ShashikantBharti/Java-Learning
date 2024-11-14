// Interface segregation principle
// Seperate interface with different role

interface Workable {
  void work();
}

interface Eatable {
  void eat();
}

// Worker class only implementss Workable
class Worker implements Workable {
  public void work() {
    System.out.println("Worker is working...");
  }
}

// Super Worker implements both
class SuperWorker implements Workable, Eatable {
  public void work() {
    System.out.println("Super worker is working...");
  }

  public void eat() {
    System.out.println("Super worker is eating...");
  }
}


public class ISPExample {
  public static void main(String[] args) {
    Worker worker = new Worker();
    worker.work();

    SuperWorker sw = new SuperWorker();
    sw.work();
    sw.eat();
  }
}