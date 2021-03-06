package chapter21;

import java.util.concurrent.TimeUnit;

public class SimpleThread extends Thread {

  private static int threadCount = 0;
  private int countDown = 5;

  public SimpleThread() {
    super(Integer.toString(++threadCount));
    start();
  }

  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      new SimpleThread();
    }
  }

  public String toString() {
    return "#" + getName() + "(" + countDown + "), ";
  }

  public void run() {
    while (true) {
      System.out.println(this);
      if (--countDown == 0) {
        return;
      }

      try {
        TimeUnit.SECONDS.sleep(1);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
