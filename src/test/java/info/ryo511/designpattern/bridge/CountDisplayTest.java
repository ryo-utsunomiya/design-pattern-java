package info.ryo511.designpattern.bridge;

import static org.junit.jupiter.api.Assertions.*;

import info.ryo511.designpattern.testutil.StandardIOTest;
import org.junit.jupiter.api.Test;

class CountDisplayTest extends StandardIOTest {

  @Test
  void multiDisplay() {
    new CountDisplay(new StringDisplayImpl("hello")).multiDisplay(2);
    assertEquals("+-----+", out.readLine());
    assertEquals("|hello|", out.readLine());
    assertEquals("|hello|", out.readLine());
    assertEquals("+-----+", out.readLine());
  }
}