package info.ryo511.designpattern.FactoryMethod.idcard;

import static org.junit.jupiter.api.Assertions.*;

import info.ryo511.designpattern.TestUtil.StandardOutputStream;
import org.junit.jupiter.api.*;

class IDCardFactoryTest {

  private StandardOutputStream out;

  @BeforeEach
  public void beforeEach() {
    out = new StandardOutputStream();
    System.setOut(out);
  }

  @Test
  public void create() {
    var factory = new IDCardFactory();
    var card1 = factory.create("結城浩");
    var card2 = factory.create("とむら");
    card1.use();
    card2.use();
    assertEquals("結城浩のカードを作ります。", out.readLine());
    assertEquals("とむらのカードを作ります。", out.readLine());
    assertEquals("結城浩のカードを使います。", out.readLine());
    assertEquals("とむらのカードを使います。", out.readLine());
  }
}