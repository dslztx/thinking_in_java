package chapter20;

import chapter0.OSExecute;

public class AtUnitExternalTest extends AtUnitExample1 {

  @Test
  boolean _methodOne() {
    return methodOne().equals("This is methodOne");
  }

  @Test
  boolean _methodTwo() {
    return methodTwo() == 2;
  }

  public static void main(String[] args) {
    OSExecute.command("java net.mindview.atunit.AtUnit AtUnitExternalTest");
  }
}
