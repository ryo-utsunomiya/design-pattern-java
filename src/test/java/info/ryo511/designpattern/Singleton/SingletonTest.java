package info.ryo511.designpattern.Singleton;

import static org.junit.jupiter.api.Assertions.*;

import info.ryo511.designpattern.TestUtil.StandardOutputStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SingletonTest {

  private StandardOutputStream out;

  @BeforeEach
  public void beforeEach() {
    out = new StandardOutputStream();
    System.setOut(out);
  }


  @Test
  public void instanceIsSame() {
    assertSame(Singleton.getInstance(), Singleton.getInstance());
  }

  @Test
  public void createOnce() {
    Singleton.getInstance();
    Singleton.getInstance();
    assertEquals("インスタンスを生成しました\n", out.readAll());
  }
}