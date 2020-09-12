package info.ryo511.designpattern.decorator;

import static org.junit.jupiter.api.Assertions.*;

import info.ryo511.designpattern.testutil.StandardIOTest;
import org.junit.jupiter.api.Test;

class SideBorderTest extends StandardIOTest {

  @Test
  void test() {
    new SideBorder(new StringDisplay("hello"), '#').show();
    assertEquals("#hello#", out.readLine());
  }
}