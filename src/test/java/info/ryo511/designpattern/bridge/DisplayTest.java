package info.ryo511.designpattern.bridge;

import static org.junit.jupiter.api.Assertions.*;

import info.ryo511.designpattern.testutil.StandardIOTest;
import org.junit.jupiter.api.Test;

class DisplayTest extends StandardIOTest {

  @Test
  void display() {
    new Display(new StringDisplayImpl("hello")).display();
    assertEquals("+-----+", out.readLine());
    assertEquals("|hello|", out.readLine());
    assertEquals("+-----+", out.readLine());
  }
}