package info.ryo511.designpattern.prototype;

import static org.junit.jupiter.api.Assertions.*;

import info.ryo511.designpattern.testutil.StandardOutputStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import info.ryo511.designpattern.prototype.framework.Manager;

class PrototypeTest {

  private StandardOutputStream out;

  @BeforeEach
  public void beforeEach() {
    out = new StandardOutputStream();
    System.setOut(out);
  }

  @Test
  void usePrototype() {
    var manager = new Manager();

    manager.register("strong message", new UnderlinePen('~'));
    manager.register("warning box", new MessageBox('*'));
    manager.register("slash box", new MessageBox('/'));

    manager.create("strong message").use("hello");
    manager.create("warning box").use("hello");
    manager.create("slash box").use("hello");

    assertEquals("\"hello\"", out.readLine());
    assertEquals(" ~~~~~ ", out.readLine());
    assertEquals("*********", out.readLine());
    assertEquals("* hello *", out.readLine());
    assertEquals("*********", out.readLine());
    assertEquals("/////////", out.readLine());
    assertEquals("/ hello /", out.readLine());
    assertEquals("/////////", out.readLine());
  }
}