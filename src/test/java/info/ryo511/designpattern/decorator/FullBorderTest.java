package info.ryo511.designpattern.decorator;

import static org.junit.jupiter.api.Assertions.*;

import info.ryo511.designpattern.testutil.StandardIOTest;
import org.junit.jupiter.api.Test;

class FullBorderTest extends StandardIOTest {

  @Test
  void test() {
    new FullBorder(new StringDisplay("hello")).show();
    assertEquals("+-----+", out.readLine());
    assertEquals("|hello|", out.readLine());
    assertEquals("+-----+", out.readLine());
  }
}